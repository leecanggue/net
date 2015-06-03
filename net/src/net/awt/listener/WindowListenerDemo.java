package net.awt.listener;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트의 생성
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		// import 단축키 CTRL + SHIFT + O
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit 객체 생성.. new 가 아닌 메소드 리턴방식으로 객체를 생성시킴
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		
	
		
		 /* [2] 컴포넌트의 구체화 
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 접하는 것보다 위해처럼 dim을 사용하면
		// 보여지는 화면에따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨.
		frame.addWindowListener(new EventHandler());
		// 이벤트를 결합시킴
		frame.setVisible(true);
	}
}
class EventHandler implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 윈도우 닫기 버튼을 클릭했을 때 호출
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0); // 0의 의미는 잘 모르지만 짐작컨대 종료값이다.
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}