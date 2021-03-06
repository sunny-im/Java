package com.koreait.bookapp.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.koreait.bookapp.model.Admin;
import com.koreait.bookapp.model.AdminDAO;

//회원가입 페이지
public class MemberJoin extends Page{
	MainFrame mainFrame; //null
	
	JLabel la_id,la_pass,la_name,la_email;
	JTextField t_id, t_pass, t_name, t_email;
	JButton bt_regist;
	
	JPanel content; //컨텐츠를 감싸 줄 영역
	AdminDAO adminDAO;
	
	public MemberJoin(MainFrame mainFrame) {
		super(mainFrame);
		//setBackground(Color.blue);
		//생성
		la_id = new JLabel("ID");
		la_pass = new JLabel("Password");
		la_name = new JLabel("Name");
		la_email = new JLabel("Email");

		t_id = new JTextField();
		t_pass = new JTextField();
		t_name = new JTextField();
		t_email = new JTextField();
		bt_regist = new JButton("회원가입");
		
		content = new JPanel();
		adminDAO = new AdminDAO();
		
		//스타일
		Dimension d = new Dimension(400,40);
		la_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		la_name.setPreferredSize(d);
		la_email.setPreferredSize(d);

		t_id.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		t_name.setPreferredSize(d);
		t_email.setPreferredSize(d);
		
		//조립
		content.add(la_id);
		content.add(t_id);
		content.add(la_pass);
		content.add(t_pass);
		content.add(la_name);
		content.add(t_name);
		content.add(la_email);
		content.add(t_email);
		
		content.add(bt_regist);
		
		content.setPreferredSize(new Dimension(830,300));
		add(content);
		
		//이벤트소스와 리스너 연결
		bt_regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자가 입력한 값을 변수로 받아둠
				String id = t_id.getText();
				String name = t_name.getText();
				String pass = t_pass.getText();
				String email = t_email.getText();
				
				// 낱개로 보내지 말고, 하나의 객체의 인스턴스에 담아서 전달하자!!!(VO를 이용하자)
				Admin admin = new Admin(); // empty
				admin.setId(id);
				admin.setName(name);
				admin.setPassword(pass);
				admin.setEmail(email);
				
				int result = adminDAO.insert(admin); // VO로 전달!!
				if(result == 1) {
					JOptionPane.showMessageDialog(getMainFrame(), "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(getMainFrame(), "등록실패");
				}
			}
		});
	}
}
