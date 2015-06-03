package net.api.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 �������� �⺻ ���̾ƿ� �����ڴ� 
 */
public class SwingDemo {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600, 150); // ������ ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������â �ݱ� �̺�Ʈ
		setTitle("MVC ��");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü����
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		/* �г� ��ü ���� */
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		/* �г� å�� ���� */
		panel.setBackground(Color.YELLOW);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.RED);
		/* �� ��ü ����. �г�A �� �� �߰� */
		JLabel label = new JLabel(" JEE (MVC ��)");
		panelA.add(label);
		JButton button1 = new JButton("Model : �����ڹ�");
		JButton button2 = new JButton("View : JSP");
		JButton button3 = new JButton("Controller : ������");
		JButton button4 = new JButton("(+) Database : ����Ŭ");
		/* panelB �� button1, 2, 3, 4�߰� */
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);
		/* panel �� panelA, panelB �߰� */
		panel.add(panelA);
		panel.add(panelB);
		/* �����ӿ� panel �߰� */
		add(panel);
		setLocation(dim.width / 2, dim.height / 2);
		setVisible(true);
	}
}