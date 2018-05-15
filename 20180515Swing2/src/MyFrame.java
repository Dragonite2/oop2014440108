import java.awt.FlowLayout;
import javax.swing.*; //���ϵ� ī�� : swing ��Ű���� ��� Ŭ���� �ҷ�����

//�������� �����ϴ� �� ��° ��� : JFrame���κ��� ��ӹ��� Ŭ���� ����.
public class MyFrame extends JFrame
{
	public MyFrame()
	{
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LYJ's second frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰���.
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		//this.setLayout(new FlowLayout()); ���� ���� �� �ٷ� Ǯ� �� �ִ�.
		//FlowLayout �� ��ɾ�� �÷� ��ġ �Ŵ��� ���
		
		JLabel label = new JLabel("�� �ڸ��� ������ �Է��Ͻÿ�."); //label ��ü ����
		JTextField tf = new JTextField(30); //Text-Field ��ü ����(�Ű����� : ����)
		JButton button = new JButton("��ư"); //��ư ��ü ����
		button.setText("Ȯ��");
		tf.setText("���� ���̷ε� ��������."); //���α׷����� ���� Text Field�� ä�� �� �ִ�.
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//this.add(label);//��ü�� �����ӿ� �߰�
		//this.add(tf); //��ü�� �����ӿ� �߰�
		
		this.add(panel);
		//panel�� Ư¡�� Ư�� ������ '�ϳ��� ������Ʈ'�� ����Ѵٴ� ���̴�. �̴� â ũ�⸦ �����غ��� �� �������� �� �� �ִ�.
		//ex)���⸦ ���� �� �г��� �����ϸ� ������ �ȴ�.
		this.add(button); //��ü�� �����ӿ� �߰�
		
		//this.pack(); //������ ũ�⸦ ������Ʈ�� ũ�⿡ �� ä���� ����.
		//add ��ɾ�� ������ ���� ��ġ�� �޶�����.
		
		this.setVisible(true);
	}
}
