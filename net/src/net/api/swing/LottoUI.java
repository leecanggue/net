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
	JPanel pan_nth, pan_sth ;  // �г� �߿��� ����, ����
	ImageIcon icon;
	List<JButton>btns ;
	
    public LottoUI() {   //<= ���ο��� ȣ��� ������ �޼ҵ�
		init() ;  
		// ������ �ҽ��� �Ϻη� ������ �޼ҵ�� ó���ؼ� ����� ��ġ�� ������� ȣ��ν� ����� �����ϵ��� �ϴ� ��.
		// �ڹٽ�ũ��Ʈ���� ȣ�̽�Ʈ ���� ��
		
	}
    

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btns.size() == 0){   // ��ư�� ������ ��ư�� ������
			makeBtns() ;
		} else {
			lotto.setLotto() ; 
			showLotto() ;
		}
	}

	private void makeBtns() {
		// ��ư ������ , ũ��, ��ġ ����.
		// for���� 6�� ����  . 
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
		String imgPath = "C:\\Users\\SuperClass\\lotto\\" +Integer.toString(i)+".gif" ;    // ���� ��
		return new ImageIcon(imgPath);
	}


	private void init() {     // ��� ������ �޼ҵ�...
		
		setTitle("�ζ� ������");
		lotto = new Lotto() ;    // this. ������ ����  , �� ��ü�� �����ߴٸ� �� Ŭ������ ������ �������
		                         // �����ڿ����� �ݵ�� this. ��� �����ؾ� ( �Ķ���� ������ ��� ��)
		                         // ������ �޼ҵ忡���� �ش� Ŭ������ ��������� ����Ų��
		                         // default �� �װŶ�� ���� �ȴ�.
		btns = new ArrayList<JButton>();  // this. ������ ����
		pan_nth = new JPanel() ;  //pan_nth �ʱ�ȭ
		pan_sth = new JPanel() ;  // pan_sth �ʱ�ȭ
		setTitle("�ζ� ������");
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,300);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize() ;
		
	
		add(pan_sth);
		btn = new JButton("������") ; 
		
		
		btn.addActionListener(this);  
		//  this == lottoUI  // Ŭ���� �̸��� ��Ī 
		// Ŭ������ ����� Ȯ���ϴ� ����.
		// this�� LottoUI�� �� �� �ִ� ��� �߿���  ActionLister �� �޼ҵ� ��
		// actionPerformed(Action e) �� ��ư���� �ο��ϴ� ���
		
		
		
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		pan_nth.add(btn);
		setLocation(dim.width/2, dim.height/2);
		
	
		setVisible(true);
		
		// ���� �г� ,�����г�  ����
		// ��ư���� �̺�Ʈ�� �Ҵ�
		// btn.addActionListener(this) ;
		// ���� �гο� BoderLayout���� ���ʿ� ��ġ
		// ���� �г��� ���ʿ� ��ġ
		// ������ ������� 1200,300
		// x,y ��ǥ�� 300,400 //
		// �������� ������� Ȯ�� �Ұ� (�ٲ� �� ����)//
		
		
	}
	
}
