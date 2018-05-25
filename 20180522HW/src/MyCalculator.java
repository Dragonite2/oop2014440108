import javax.swing.*; //���� ���

import java.awt.FlowLayout;
import java.awt.event.*; //�̺�Ʈ ó��

public class MyCalculator extends JFrame implements ActionListener
{
	//�ʵ� ����
	private JTextField tf; //�ؽ�Ʈ �ʵ�
	private int A,B,S; //����, �ǰ���, �����
	private int temp; 
	private JButton plus, clear, result; //Ư�� ���(+,=,C)
	private boolean addswitch; //addend ���(����)����, augend ���(�ǰ���)���� �������� ���� ����Ī ����. false�� ��� ����, true�� ��� �ǰ���
	private JButton[] num; //��ư �迭
	private int multiplus; //���� ���� ��� ī��Ʈ ����
	private JLabel warning; //�ƹ� ��� ���� ���ǹ�
	
	
	//������(Constructor)
	public MyCalculator()
	{
		//�ʵ尪 �ʱ�ȭ
		multiplus = 10;
		A = 0; //A(addend), B(augend)
		B = 0; //�ʱ� ����, �ǰ����� ����
		S = A + B; //S�� sum�� ����.
		addswitch = false;
		
		//�ʱ� ������ ����
		setTitle("���� ���� ����");
		setSize(800,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setLocationRelativeTo(null);

		//������Ʈ ����
		tf = new JTextField(8); //���� â
		tf.setText("0"); //�ʱⰪ
		clear = new JButton("C");
		result = new JButton("=");
		plus = new JButton("+");	
		num = new JButton[10];
		warning = new JLabel("���� �̿��� Ű �Է����� �� ��");

		//��ȣ ��ư ������Ʈ ���� �� �̺�Ʈ ������ ���
		for(int i = 0;i<10;i++)
		{
			this.num[i] = new JButton(""+i); //��ư�� ���ڸ� �����.
			this.num[i].setActionCommand("number"+i); //��ư���� ActionCommand�� �־�� �Ѵ�.
			this.num[i].addActionListener(this); //�翬�� �̺�Ʈ �����ʵ� ����� �Ǿ�� �ϱ� ������ �迭�� ������ ����� �Ѵ�.
		}
		
		//�� ������Ʈ�� �̺�Ʈ ������ ���
		clear.setActionCommand("clear");
		clear.addActionListener(this);
		result.setActionCommand("result");
		result.addActionListener(this);
		plus.setActionCommand("plus");
		plus.addActionListener(this);
		
		//�г� ����	
		JPanel calc_design = new JPanel();
		calc_design.setLayout(new FlowLayout());
		JPanel module = new JPanel();
		JPanel sev_to_nine = new JPanel();
		JPanel four_to_six = new JPanel();
		JPanel one_to_three= new JPanel();
		JPanel zero_to_clear = new JPanel();
		
		/*
		��ġ ������ ���� �� ������ ����
		
		��ȣ �κ��� FlowLayout���� ó��,
		���� ����� BoxLayout���� ó���Ͽ�
		������ ������ ����. �Ϻ� ������Ʈ�� �߾� ���� ��ġ�� ����� �����.
		*/
		module.setLayout(new BoxLayout(module, BoxLayout.Y_AXIS));
		sev_to_nine.setLayout(new FlowLayout());
		four_to_six.setLayout(new FlowLayout());
		one_to_three.setLayout(new FlowLayout());
		zero_to_clear.setLayout(new FlowLayout());	

		//�гο� ������Ʈ �߰�
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

	//�������̽� �̺�Ʈ ������ �޼ҵ� ����
	//else���� ���� ���� �Ϲ���������, �ٸ� ��ư���� ��ȣ�ۿ��� �ʿ��� Ư���� '���ǹ��� Ȯ���ϰ� Ư�� ������ �����ϴ� ��'�� ������ �Ŷ�� �����Ͽ� ���ǹ��� ������ �ۼ��Ͽ���.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Ư�� ��ư ��� ����
		//C(Clear) - ��� ���� �ʱ�ȭ�Ѵ�.
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
			//�ǰ���(augend) ���� ���� �׳� ���ϱ�
			//X+0�� ���̶� ���� ������.
			if(addswitch == false)
			{
				//�Ϲ����� ���� ���
				if(multiplus < 1)
				{
					S = Integer.parseInt(tf.getText());
					tf.setText(""+this.S);
					temp = 0; //������ ����� ���� ���.
				}
				
				//= ��ư�� ������ ����ä�� ���� ���� ��� ��� ��
				else if(multiplus >= 1)
				{
					S = A + Integer.parseInt(tf.getText());
					tf.setText(""+this.S);
					temp = 0;
					multiplus = 0; //������ ����� ���� ���� ���ÿ� = ��ư�� �������� ���� ���� ���� ��带 �ʱ�ȭ�Ѵ�.
				}
			}
			
			//�ǰ����� ������ ���
			else if(addswitch == true)
			{
				//B���� tf�� ���� �о��.
				B = Integer.parseInt(tf.getText());
				S = A + B; //�̹� ����� A ���� B�� ���� ����
				tf.setText(""+this.S);
				addswitch = false;
				multiplus = 0; 
				temp = 0; //������ ����� ���� ���� ���ÿ� = ��ư�� �������� ���� ���� ���� ��带 �ʱ�ȭ�Ѵ�.
			}
		}
		
		//+(plus) ���� 
		if(e.getActionCommand().equals("plus"))
		{
			//���� ��忡�� + ��ư ����
			if(addswitch == false)
			{
				//A���� �Է��� ���� ������ ��, �ǰ��� ���� �ٲ۴�.	
				multiplus++; //'���� ���� ��� ī��Ʈ'�� ����.
				//
				if(multiplus <= 1) //�������� ���� ���(= ��ư�� �̿��Ͽ� ���� ī��Ʈ�� 0���� �ʱ�ȭ�� ���)
				{
					A = Integer.parseInt(tf.getText()); //�ܼ��� �ؽ�Ʈ�ʵ忡 �ִ� ���� �ҷ����� ���� �߿��ϴ�.
					addswitch = true;
					temp = 0; //��Ƶ״� �ӽ� ���� �׸��� ���.  

				}
				
				//+��ư�� ��� ���� ���� ī���͸� ��� �׾ƿø��� ���
				else if(multiplus > 1)
				{
					A = A + Integer.parseInt(tf.getText());  //�� ���� ������ ����Ǿ� �ִ� ���� �����Ͽ� �ؽ�Ʈ �ʵ��� ���� ����ϴ� ���� �߿��ϴ�.
					tf.setText(""+this.A);
					addswitch = true;
					temp = 0; //��Ƶ״� �ӽ� ���� �׸��� ���.
				}
				


			}

			//�ǰ��� ��忡�� +�� �ѹ� �� ����
			else if(addswitch == true)
			{	
				B = Integer.parseInt(tf.getText());
				A = A + B; //������ ������� �����ش�.
				tf.setText(""+this.A);
				//1�������� ������� �ѹ� �� �����ش�.
				addswitch = false;
				temp = 0; //���� ��Ƶ״� �׸��� ����.
			}
		}

		//��ȣ �˰���. Switch���� ��� default �κп��� �ٸ� Ŀ�ǵ�� ���̴� ��찡 �߻��� ����� if������ ��ü��.
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