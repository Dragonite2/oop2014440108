import javax.swing.*; //스윙 사용

import java.awt.FlowLayout;
import java.awt.event.*; //이벤트 처리

public class MyCalculator extends JFrame implements ActionListener
{
	//필드 선언
	private JTextField tf; //텍스트 필드
	private int A,B,S; //가수, 피가수, 결과값
	private int temp; 
	private JButton plus, clear, result; //특수 기능(+,=,C)
	private boolean addswitch; //addend 모드(가수)인지, augend 모드(피가수)인지 구분짓기 위한 스위칭 변수. false일 경우 가수, true일 경우 피가수
	private JButton[] num; //버튼 배열
	private int multiplus; //다중 덧셈 기능 카운트 전용
	private JLabel warning; //아무 기능 없는 주의문
	
	
	//생성자(Constructor)
	public MyCalculator()
	{
		//필드값 초기화
		multiplus = 10;
		A = 0; //A(addend), B(augend)
		B = 0; //초기 가수, 피가수값 설정
		S = A + B; //S는 sum의 약자.
		addswitch = false;
		
		//초기 프레임 설정
		setTitle("정수 덧셈 계산기");
		setSize(800,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setLocationRelativeTo(null);

		//컴포넌트 설정
		tf = new JTextField(8); //계산기 창
		tf.setText("0"); //초기값
		clear = new JButton("C");
		result = new JButton("=");
		plus = new JButton("+");	
		num = new JButton[10];
		warning = new JLabel("숫자 이외의 키 입력하지 말 것");

		//번호 버튼 컴포넌트 설정 및 이벤트 리스너 등록
		for(int i = 0;i<10;i++)
		{
			this.num[i] = new JButton(""+i); //버튼에 글자를 새긴다.
			this.num[i].setActionCommand("number"+i); //버튼별로 ActionCommand가 있어야 한다.
			this.num[i].addActionListener(this); //당연히 이벤트 리스너도 등록이 되어야 하기 때문에 배열로 리스너 등록을 한다.
		}
		
		//각 컴포넌트에 이벤트 리스너 등록
		clear.setActionCommand("clear");
		clear.addActionListener(this);
		result.setActionCommand("result");
		result.addActionListener(this);
		plus.setActionCommand("plus");
		plus.addActionListener(this);
		
		//패널 설정	
		JPanel calc_design = new JPanel();
		calc_design.setLayout(new FlowLayout());
		JPanel module = new JPanel();
		JPanel sev_to_nine = new JPanel();
		JPanel four_to_six = new JPanel();
		JPanel one_to_three= new JPanel();
		JPanel zero_to_clear = new JPanel();
		
		/*
		배치 관리자 지정 및 디자인 설정
		
		번호 부분은 FlowLayout으로 처리,
		계산기 모듈은 BoxLayout으로 처리하여
		계산기의 디자인 구현. 일부 컴포넌트는 중앙 정렬 배치로 모양을 잡았음.
		*/
		module.setLayout(new BoxLayout(module, BoxLayout.Y_AXIS));
		sev_to_nine.setLayout(new FlowLayout());
		four_to_six.setLayout(new FlowLayout());
		one_to_three.setLayout(new FlowLayout());
		zero_to_clear.setLayout(new FlowLayout());	

		//패널에 컴포넌트 추가
		calc_design.add(tf);
		calc_design.add(result);
		
		sev_to_nine.add(num[7]);
		sev_to_nine.add(num[8]);
		sev_to_nine.add(num[9]);
		
		four_to_six.add(num[4]);
		four_to_six.add(num[5]);
		four_to_six.add(num[6]);

		one_to_three.add(num[1]);
		one_to_three.add(num[2]);
		one_to_three.add(num[3]);

		zero_to_clear.add(num[0]);
		zero_to_clear.add(plus);
		zero_to_clear.add(clear);
				
		
		module.add(calc_design);
		module.add(sev_to_nine);
		module.add(four_to_six);
		module.add(one_to_three);
		module.add(zero_to_clear);
		module.add(warning);
		
		warning.setAlignmentX(CENTER_ALIGNMENT);
		
		this.add(module);
		pack();
		setVisible(true);
	}

	//인터페이스 이벤트 리스너 메소드 구현
	//else문을 쓰는 편이 일반적이지만, 다른 버튼과의 상호작용이 필요한 특성상 '조건문에 확실하게 특정 조건을 기입하는 편'이 나았을 거라고 생각하여 조건문을 일일이 작성하였음.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//특수 버튼 기능 지정
		//C(Clear) - 모든 것을 초기화한다.
		if(e.getActionCommand().equals("clear"))
		{
			tf.setText("0");
			A = 0;
			B = 0;
			S = 0;
			temp = 0;
			multiplus = 0;
			addswitch = false;
		}
		
		//=(equal, result)
		if(e.getActionCommand().equals("result"))
		{
			//피가수(augend) 지정 없이 그냥 더하기
			//X+0의 식이랑 같은 원리임.
			if(addswitch == false)
			{
				//일반적인 덧셈 기능
				if(multiplus < 1)
				{
					S = Integer.parseInt(tf.getText());
					tf.setText(""+this.S);
					temp = 0; //이전에 저장된 값을 비움.
				}
				
				//= 버튼을 누르지 않은채로 다중 덧셈 모드 사용 시
				else if(multiplus >= 1)
				{
					S = A + Integer.parseInt(tf.getText());
					tf.setText(""+this.S);
					temp = 0;
					multiplus = 0; //이전에 저장된 값을 비움과 동시에 = 버튼이 눌러지는 순간 다중 덧셈 모드를 초기화한다.
				}
			}
			
			//피가수가 지정된 경우
			else if(addswitch == true)
			{
				//B값이 tf의 값을 읽어옴.
				B = Integer.parseInt(tf.getText());
				S = A + B; //이미 저장된 A 값에 B의 값을 더함
				tf.setText(""+this.S);
				addswitch = false;
				multiplus = 0; 
				temp = 0; //이전에 저장된 값을 비움과 동시에 = 버튼이 눌러지는 순간 다중 덧셈 모드를 초기화한다.
			}
		}
		
		//+(plus) 연산 
		if(e.getActionCommand().equals("plus"))
		{
			//가수 모드에서 + 버튼 누름
			if(addswitch == false)
			{
				//A값에 입력한 수를 저장한 후, 피가수 모드로 바꾼다.	
				multiplus++; //'다중 덧셈 모드 카운트'를 쌓음.
				//
				if(multiplus <= 1) //정상적인 덧셈 모드(= 버튼을 이용하여 덧셈 카운트를 0으로 초기화한 경우)
				{
					A = Integer.parseInt(tf.getText()); //단순히 텍스트필드에 있는 값만 불러오는 것이 중요하다.
					addswitch = true;
					temp = 0; //담아뒀던 임시 숫자 그릇을 비움.  

				}
				
				//+버튼을 계속 눌러 덧셈 카운터를 계속 쌓아올리는 경우
				else if(multiplus > 1)
				{
					A = A + Integer.parseInt(tf.getText());  //이 때는 기존에 저장되어 있던 값을 포함하여 텍스트 필드의 값을 계산하는 것이 중요하다.
					tf.setText(""+this.A);
					addswitch = true;
					temp = 0; //담아뒀던 임시 숫자 그릇을 비움.
				}
				


			}

			//피가수 모드에서 +를 한번 더 누름
			else if(addswitch == true)
			{	
				B = Integer.parseInt(tf.getText());
				A = A + B; //가수에 결과값을 몰아준다.
				tf.setText(""+this.A);
				//1차적으로 결과값을 한번 더 보여준다.
				addswitch = false;
				temp = 0; //역시 담아뒀던 그릇을 비운다.
			}
		}

		//번호 알고리즘. Switch문의 경우 default 부분에서 다른 커맨드와 꼬이는 경우가 발생한 관계로 if문으로 대체함.
		if(e.getActionCommand().equals("number0"))
		{
				tf.setText(""+(temp));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number1"))
		{
				tf.setText(""+(temp+1));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number2"))
		{
				tf.setText(""+(temp+2));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number3"))
		{
				tf.setText(""+(temp+3));
				temp = 10 * Integer.parseInt(tf.getText());
		}

		if(e.getActionCommand().equals("number4"))
		{
				tf.setText(""+(temp+4));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number5"))
		{
				tf.setText(""+(temp+5));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number6"))
		{
				tf.setText(""+(temp+6));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number7"))
		{
				tf.setText(""+(temp+7));
				temp = 10 * Integer.parseInt(tf.getText());
		}

		if(e.getActionCommand().equals("number8"))
		{
				tf.setText(""+(temp+8));
				temp = 10 * Integer.parseInt(tf.getText());
		}
		
		if(e.getActionCommand().equals("number9"))
		{
				tf.setText(""+(temp+9));
				temp = 10 * Integer.parseInt(tf.getText());
		}
	
		
	}

}