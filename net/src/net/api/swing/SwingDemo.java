package net.api.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 프레임의 기본 레이아웃 관리자는 
 */
public class SwingDemo {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600, 150); // 프레임 크기 결정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우창 닫기 이벤트
		setTitle("MVC 모델");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체생성
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		/* 패널 객체 생성 */
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		/* 패널 책상 변경 */
		panel.setBackground(Color.YELLOW);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.RED);
		/* 라벨 객체 생성. 패널A 에 라벨 추가 */
		JLabel label = new JLabel(" JEE (MVC 모델)");
		panelA.add(label);
		JButton button1 = new JButton("Model : 순수자바");
		JButton button2 = new JButton("View : JSP");
		JButton button3 = new JButton("Controller : 서블릿");
		JButton button4 = new JButton("(+) Database : 오라클");
		/* panelB 에 button1, 2, 3, 4추가 */
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);
		/* panel 에 panelA, panelB 추가 */
		panel.add(panelA);
		panel.add(panelB);
		/* 프레임에 panel 추가 */
		add(panel);
		setLocation(dim.width / 2, dim.height / 2);
		setVisible(true);
	}
}
