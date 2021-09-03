package com.koreait.bookapp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.koreait.bookapp.model.Admin;

// 어플리케이션의 메인 윈도우 (View == 디자인)
public class MainFrame extends JFrame implements ActionListener {
	JPanel p_north;
	JPanel p_center; // 모든 페이지가 공존할 컨테이너 역할
	JButton bt_main; // 도서관리 메인페이지
	JButton bt_schedule; // 일정관리 - 달력화면
	JButton bt_regist; // 회원가입
	JButton bt_cs; // 고객센터
	JButton bt_login; // 로그인 or 로그아웃

	BookMain bookMain; // 도서관리 페이지
	Schedule schedule;
	MemberJoin memberJoin;
	CSMain csMain;
	LoginForm loginForm;

	ArrayList<JButton> btnList; // 버튼을 가리킴에 있어 규칙을 만들기 위해
	ArrayList<Page> pageList; // 페이지를 가리킴에 있어 규칙을 만들기 위해

	// 로그인 상태 여부...
	Admin loginObj; // null..
	
	public MainFrame() {
		// 생성
		p_north = new JPanel();
		p_center = new JPanel();
		bt_main = new JButton("도서관리 메인");
		bt_schedule = new JButton("일정관리");
		bt_regist = new JButton("회원가입");
		bt_cs = new JButton("고객센터");
		bt_login = new JButton("Login");

		bookMain = new BookMain(this);
		schedule = new Schedule(this);
		memberJoin = new MemberJoin(this);
		csMain = new CSMain(this);
		loginForm = new LoginForm(this);

		btnList = new ArrayList<JButton>();
		pageList = new ArrayList();

		// 부모인 Page 객체에 mainFrame을 전달하자
		// memberJoin.setMainFrame(this);

		// 버튼을 개성있는 이름이 아닌, 규칙잇는 숫자로 가리키기 위해, 그래야 반복문, 베열에 친하다.
		btnList.add(bt_main);
		btnList.add(bt_schedule);
		btnList.add(bt_regist);
		btnList.add(bt_cs);
		btnList.add(bt_login);

		// 페이지들을 개성있는 이름이 아닌, 규칙잇는 숫자로 가리키기 위해, 그래야 반복문, 베열에 친하다.
		pageList.add(bookMain);
		pageList.add(schedule);
		pageList.add(memberJoin);
		pageList.add(csMain);
		pageList.add(loginForm);

		// 스타일
		p_north.setBackground(Color.gray);
		p_center.setBackground(Color.black);

		// 조립
		p_north.add(bt_main);
		p_north.add(bt_schedule);
		p_north.add(bt_regist);
		p_north.add(bt_cs);
		p_north.add(bt_login);
		add(p_north, BorderLayout.NORTH);

		p_center.add(bookMain);
		p_center.add(schedule);
		p_center.add(memberJoin);
		p_center.add(csMain);
		p_center.add(loginForm);

		// 프레임에 페이지 부착
		add(p_center);

		// 윈도우 창
		setSize(1200, 800);
		setVisible(true);
		setLocationRelativeTo(null); // 화면 정 가운데 위치하게!!
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 소스와 리스너 연결
//		 bt_main.addActionListener(this);
//		 bt_schedule.addActionListener(this);
//		 bt_regist.addActionListener(this);
//		 bt_cs.addActionListener(this);
//		 bt_login.addActionListener(this);
		// 반복문으로 가능
		for (JButton bt : btnList) {
			bt.addActionListener(this);
		}
		showHide(4);
	}
	
	

	// 페이지 보이고, 안보이고 처리, n의 값은 visible을 true로 놓을 대상 페이지값
	public void showHide(int n) {
		for (int i = 0; i < pageList.size(); i++) {
			Page page = pageList.get(i);
			if (i == n) { // 넘겨받은 값과 일치한 경우만
				page.setVisible(true);
			} else {
				page.setVisible(false);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		// System.out.println("지금 누른 버튼의 리스트 내에서늬 위치는" +btnList.indexOf(btn));
		int index = btnList.indexOf(btn);
		
		if(loginObj == null) {
			if(index == 0 || index ==1 || index ==3) {
				JOptionPane.showMessageDialog(this, "로그인이 필요한 서비스 입니다");
			} else { // 2,4
				showHide(index);
			}
		}else { 
			showHide(index);
			//로그인한 상태에서 만일 로그아웃 버튼을 누르면?
			if(index ==4) {
				//로그아웃 대상
				loginObj=null;
				JOptionPane.showMessageDialog(this, "로그아웃 되었습니다");
				//로그아웃 문구를 로그인으로 다시 바꿔야함
				bt_login.setText("Login");
			}else {
				showHide(index);
			}
		}

		// showHide(버튼의 index)
//		if(btn.equals(bt_main)) {			// equals는 내용 비교
//			showHide(0);
//		}else if (btn.equals(bt_schedule)) {
//			showHide(1);
//		}else if (btn.equals(bt_regist)) {
//			showHide(2);
//		}else if (btn.equals(bt_cs)) {
//			showHide(3);
//		}else if (btn.equals(bt_login)) {
//			showHide(4);
//		}
		// System.out.println(btn.getText() + " 눌렀니??");
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
