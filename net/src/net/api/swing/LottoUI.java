package net.api.swing;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoUI extends JFrame implements ActionListener{
	
	Lotto lotto ; 
	JButton btn ;  
	JPanel pan_nth, pan_sth ;  // 패널 중에서 북쪽, 남쪽
	ImageIcon icon;
	List<JButton>btns ;
	
    public LottoUI() {   //<= 메인에서 호출된 생성자 메소드
		init() ;  
		// 복잡한 소스를 하부로 보내고 메소드로 처리해서 선언된 위치에 관계없이 호출로써 기능을 수행하도록 하는 것.
		// 자바스크립트에서 호이스트 같은 거
		
	}
    

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btns.size() == 0){   // 버튼이 없으면 버튼을 만들어라
			makeBtns() ;
		} else {
			lotto.setLotto() ; 
			showLotto() ;
		}
	}

	private void makeBtns() {
		// 버튼 생성자 , 크기, 위치 설정.
		// for문을 6번 돌림  . 
		// 
		JButton temp = null ;
		for (int i = 0; i < 6; i++) {
			temp = new JButton();
			btns.add(temp) ;
			pan_sth.add(temp);
			
		}
	}

	private void showLotto() {
		int[] arr = lotto.getLotto();
		for (int i = 0; i < arr.length; i++) {
			btns.get(i).setIcon(getIcon(arr[i]));
		}
	}
	
	

	private Icon getIcon(int i) {
		String imgPath = "C:\\Users\\SuperClass\\lotto\\" +Integer.toString(i)+".gif" ;    // 많이 씀
		return new ImageIcon(imgPath);
	}


	private void init() {     // 얘는 생성자 메소드...
		
		setTitle("로또 생성기");
		lotto = new Lotto() ;    // this. 생략된 상태  , 단 객체로 생성했다면 이 클래스의 영원한 멤버변수
		                         // 생성자에서는 반드시 this. 라고 지정해야 ( 파라미터 없으면 없어도 됨)
		                         // 하지만 메소드에서는 해당 클래스의 멤버변수를 가르킨다
		                         // default 로 그거라고 보면 된다.
		btns = new ArrayList<JButton>();  // this. 생략된 상태
		pan_nth = new JPanel() ;  //pan_nth 초기화
		pan_sth = new JPanel() ;  // pan_sth 초기화
		setTitle("로또 생성기");
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,300);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize() ;
		
	
		add(pan_sth);
		btn = new JButton("생성기") ; 
		
		
		btn.addActionListener(this);  
		//  this == lottoUI  // 클래스 이름을 지칭 
		// 클래스의 기능을 확장하는 역할.
		// this는 LottoUI가 할 수 있는 기능 중에서  ActionLister 의 메소드 중
		// actionPerformed(Action e) 를 버튼에게 부여하는 기능
		
		
		
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		pan_nth.add(btn);
		setLocation(dim.width/2, dim.height/2);
		
	
		setVisible(true);
		
		// 북쪽 패널 ,남쪽패널  생성
		// 버튼에는 이벤트를 할당
		// btn.addActionListener(this) ;
		// 북쪽 패널에 BoderLayout에서 북쪽에 배치
		// 남쪽 패널은 남쪽에 배치
		// 프레임 싸이즈는 1200,300
		// x,y 좌표는 300,400 //
		// 프레임의 싸이즈는 확장 불가 (바꿀 수 없게)//
		
		
	}
	
}
