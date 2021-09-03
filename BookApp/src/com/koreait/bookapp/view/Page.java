package com.koreait.bookapp.view;

import java.awt.Dimension;

import javax.swing.JPanel;

// 앞으로 어플리케이션에서 사용될 모든 페이지들의 어버이 클래스
// 그리고 이 클래스에는 가장 공통적이면서 보편적 기능을 부여한다.
public class Page extends JPanel {
	private MainFrame mainFrame; // private 객체는 자식이 사용불가이므로 getter,setter 사용

	public Page(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setPreferredSize(new Dimension(1200, 750));
	}

	// 모든 페이지는 누군가가 세터로 페이지를 넘겨주면 주소값이 생긴다.
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}
}
