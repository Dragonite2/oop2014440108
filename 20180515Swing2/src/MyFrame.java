import java.awt.FlowLayout;
import javax.swing.*; //와일드 카드 : swing 패키지의 모든 클래스 불러오기

//프레임을 생성하는 두 번째 방법 : JFrame으로부터 상속받은 클래스 생성.
public class MyFrame extends JFrame
{
	public MyFrame()
	{
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LYJ's second frame");
		
		//새로운 컴포넌트를 프레임에 추가함.
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		//this.setLayout(new FlowLayout()); 위의 식을 두 줄로 풀어쓸 수 있다.
		//FlowLayout 이 명령어는 플로 배치 매니저 사용
		
		JLabel label = new JLabel("네 자리의 정수를 입력하시오."); //label 객체 생성
		JTextField tf = new JTextField(30); //Text-Field 객체 생성(매개변수 : 길이)
		JButton button = new JButton("버튼"); //버튼 객체 생성
		button.setText("확인");
		tf.setText("봄은 봄이로되 졸립구먼."); //프로그래밍을 통해 Text Field를 채울 수 있다.
		
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//this.add(label);//객체를 프레임에 추가
		//this.add(tf); //객체를 프레임에 추가
		
		this.add(panel);
		//panel의 특징은 특정 묶음을 '하나의 컴포넌트'로 취급한다는 점이다. 이는 창 크기를 변경해보면 그 차이점을 알 수 있다.
		//ex)계산기를 만들 때 패널을 생성하면 도움이 된다.
		this.add(button); //객체를 프레임에 추가
		
		//this.pack(); //프레임 크기를 컴포넌트의 크기에 꽉 채워서 맞춤.
		//add 명령어는 순서에 따라 배치가 달라진다.
		
		this.setVisible(true);
	}
}
