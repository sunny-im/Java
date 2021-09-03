package com.koreait.project_home.chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener,KeyListener{

	JTextArea area;
	JTextField field;
	JButton bt;
	JScrollPane scroll;
	ChatB chatB;
	ChatC chatC;
	
	
	public ChatA() {
		// 생성
		area = new JTextArea();
		field = new JTextField(13);
		bt = new JButton("open");
		scroll = new JScrollPane(area);
		
		// 스타일
		area.setPreferredSize(new Dimension(240,300));
		area.setBackground(Color.orange);
		
		// 조립
		setLayout(new FlowLayout());
		add(scroll);	
		add(field);
		add(bt);
			
		
		//윈도우
		this.setBounds(200, 100, 280, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//연결
		bt.addActionListener(this);
		field.addKeyListener(this);

	}
		
	public void actionPerformed(ActionEvent e) {
		//대화 상대방
		if(chatB==null) {
		chatB=new ChatB();
		chatB.setChatA(this);
		}
		if(chatC==null) {
		chatC=new ChatC();
		chatC.setChatA(this);
		}
	}
	
	public void keyPressed(KeyEvent arg0) {}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			String msg=field.getText();
			chatB.area.append(msg+"\n");
			chatC.area.append(msg+"\n");
			this.area.append(msg+"\n");
			field.setText(" ");
			
		}
	}
	
	
	public static void main(String[] args) {
		new ChatA();
	}
}