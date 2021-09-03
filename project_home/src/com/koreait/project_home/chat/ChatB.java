package com.koreait.project_home.chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener{

	JTextArea area;
	JTextField field;
	JScrollPane scroll;
	ChatA chatA;
	ChatC chatC;
	
	
	public ChatB() {
		// 생성
		area = new JTextArea();
		field = new JTextField(20);
		scroll = new JScrollPane(area);
		
		// 스타일
		area.setPreferredSize(new Dimension(240,300));
		area.setBackground(Color.LIGHT_GRAY);
		
		// 조립
		setLayout(new FlowLayout());
		add(scroll);	
		add(field);
			
		
		//윈도우 설정
		this.setBounds(500, 100, 280, 400);
		setVisible(true);
		
		// 연결
		field.addKeyListener(this);

	}
		public void setChatA(ChatA chatA) {
			this.chatA= chatA;
			
			
		}
		public void keyPressed(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				String msg=field.getText();
				chatA.area.append(msg+"\n");
				this.area.append(msg+"\n");
				field.setText(" ");
				chatA.chatC.area.append(msg+"\n");
		
		}
		}	
}