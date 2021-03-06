package com.koreait.bookapp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.koreait.bookapp.model.SubCategory;
import com.koreait.bookapp.model.SubCategoryDAO;
import com.koreait.bookapp.model.TopCategory;
import com.koreait.bookapp.model.TopCategoryDAO;

//도서관리 페이지
public class BookMain extends Page {
	JPanel p_west; // 서쪽 입력폼 영역
	JPanel p_center; // 가운데 테이블 영역
	JPanel p_east; // 동쪽 입력폼 영역
	JComboBox ch_top; //탑 카테고리
	JComboBox ch_sub; // 서브 카테고리
	JTextField t_name; // 책이름
	JTextField t_price; // 가격
	JButton bt_img; // 이미지 탐색기 창 띄우기 
	JPanel p_preview; // 미리보기 위한 패널 (paint메소드 재정의할 예정)
	JButton bt_regist; //등록버튼
	
	TopCategoryDAO topCategoryDAO;
	List<TopCategory> topList;
	SubCategoryDAO subCategoryDAO;
	
	public BookMain(MainFrame mainFrame) {
		super(mainFrame);
		// 보더레이아웃 적용
		p_west = new JPanel();
		p_center = new JPanel();
		p_east = new JPanel();
		ch_top = new JComboBox();
		ch_sub = new JComboBox();
		t_name = new JTextField();
		t_price = new JTextField();
		bt_img = new JButton("이미지 찾기");
		p_preview = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
			}
		};
		bt_regist = new JButton("등록");
		topCategoryDAO = new TopCategoryDAO();
		subCategoryDAO = new SubCategoryDAO() ;
		
		// 스타일
		p_west.setPreferredSize(new Dimension(200,750));
		p_west.setBackground(Color.gray);
		
		Dimension d = new Dimension(190,40);
		ch_top.setPreferredSize(d);
		ch_sub.setPreferredSize(d);
		t_name.setPreferredSize(d);
		t_price.setPreferredSize(d);
		bt_img.setPreferredSize(d);
		p_preview.setPreferredSize(new Dimension(190,195));
		
		//레이아웃 교체
		setLayout(new BorderLayout());
		
		//조립
		p_west.add(ch_top);
		p_west.add(ch_sub);
		p_west.add(t_name);
		p_west.add(t_price);
		p_west.add(bt_img);
		p_west.add(p_preview);
		p_west.add(bt_regist);
		
		// 서쪽 영역에 등록 폼 부착
		add(p_west, BorderLayout.WEST);
		
		//콤보박스에 리스너 연결
		ch_top.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					int index = ch_top.getSelectedIndex(); // 유저가 선택한 콤보박스의 index
					System.out.println("지금 선택한 콤보박스의 index "+index);
					
					TopCategory topCategory = topList.get(index);
					System.out.println("당신이 선택한 인덱스에서 추출한 VO는 " + topCategory);
					
					List<SubCategory> subList = subCategoryDAO.selectByTopCategory(topCategory.getTopcategory_id());
					
					
					for(SubCategory subCategory : subList) {
						ch_sub.addItem(subCategory.getName());
					}
				}
			}
		});
		
		getList();
	}
	public void getList() {
		topList = topCategoryDAO.selectAll();
		//탑 카테고리에 데이터 채워넣기
		for(TopCategory topCategory : topList) {
			ch_top.addItem(topCategory.getName());
		}
	}
}
