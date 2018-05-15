import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

//두 번째 이벤트 리스너 구현 방법.(인터페이스 구현을 프레임 클래스에)
//이벤트 처리기를 프레임 클래스에 구현했다.
public class MyFrame extends JFrame implements ActionListener
{
	JButton button, btn; //필드 형식으로 선언해도 가능.(아래 재정의 메소드 참조)
	//필드는 클래스 내 모든 구간이 접근 구간이기 때문에, 모든 메소드에서 접근 가능함.
	JTextField tf; //텍스트 필드도 '필드'로 선언 가능.
	public MyFrame()
	{	
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LYJ's second frame");
		
		//새로운 컴포넌트를 프레임에 추가함.
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		this.button = new JButton("첫 번째 버튼"); //버튼 객체 생성
		this.tf = new JTextField(30);
		this.add(this.tf);
		this.add(this.button); //버튼 객체를 프레임에 추가
		this.button.setActionCommand("button 1");
		this.button.addActionListener(this);
		
		this.btn = new JButton("두 번째 버튼");
		this.add(this.btn);
		this.btn.setActionCommand("button 2");
		this.btn.addActionListener(this);
		//이벤트 리스너 객체 등록
		//클래스 생성을 따로 한 경우라면 객체를 새로 만들어야 하지만, 본 클래스에 구현한 경우에는 굳이 필요없다.
		
		//버튼이 여러 개 있을 때 setActionCommand를 이용하면 좋다.
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("button 1"))
			this.tf.setText("첫 번째 버튼");
		else
			this.tf.setText("두 번째 버튼");
		
		//JButton button = (JButton) e.getSource();
		//액션 이벤트 객체에서 눌러진 버튼 객체를 (버튼 객체의 레퍼런스 값) 가져온다.


		//System.out.println("OMG 버튼이 또 눌러졌어요!!!");
	}
	
}
