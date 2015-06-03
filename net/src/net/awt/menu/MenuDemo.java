package net.awt.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class MenuDemo {
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
		
		Label labId = new Label("ID : ");
		labId.setBounds(50,50,30,10); // 50, 50 은 위치 30,10은 가로세로 
		Label labPwd = new Label("Password : ");
		labPwd.setBounds(50,65,100,10);
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemOpen = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem subMenuPreview =new MenuItem("Preview");
		MenuItem subMenuSetup = new MenuItem("PrintSetup");
		
		/*
		 * [2] 컴포넌트 조립
		 */
		subMenu.add(subMenuPrint);
		subMenu.add(subMenuPreview);
		subMenu.add(subMenuSetup);
		
		Menu menuEdit = new Menu("Edit");
		Menu menuview = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(subMenu);
		menuFile.addSeparator(); //메뉴에서 분리선을 나타냄
		menuFile.add(itemExit);
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuview);
		menuBar.setHelpMenu(menuHelp);
		
		frame.setMenuBar(menuBar);
		/*
		 * [2] 컴포넌트의 조립
		 */
	//	frame.setLayout(null);
		// LayoutManager 중에서 FlowLayout 사용하겠다.
		
		/*
		 * [3] 컴포넌트의 구체화 
		 */
		frame.setLocation(dim.width/2, dim.height/2);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 접하는 것보다 위해처럼 dim을 사용하면
		// 보여지는 화면에따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨.
		frame.setVisible(true);
	}
}