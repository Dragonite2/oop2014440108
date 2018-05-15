import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

//�� ��° �̺�Ʈ ������ ���� ���.(�������̽� ������ ������ Ŭ������)
//�̺�Ʈ ó���⸦ ������ Ŭ������ �����ߴ�.
public class MyFrame extends JFrame implements ActionListener
{
	JButton button, btn; //�ʵ� �������� �����ص� ����.(�Ʒ� ������ �޼ҵ� ����)
	//�ʵ�� Ŭ���� �� ��� ������ ���� �����̱� ������, ��� �޼ҵ忡�� ���� ������.
	JTextField tf; //�ؽ�Ʈ �ʵ嵵 '�ʵ�'�� ���� ����.
	public MyFrame()
	{	
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LYJ's second frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰���.
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		this.button = new JButton("ù ��° ��ư"); //��ư ��ü ����
		this.tf = new JTextField(30);
		this.add(this.tf);
		this.add(this.button); //��ư ��ü�� �����ӿ� �߰�
		this.button.setActionCommand("button 1");
		this.button.addActionListener(this);
		
		this.btn = new JButton("�� ��° ��ư");
		this.add(this.btn);
		this.btn.setActionCommand("button 2");
		this.btn.addActionListener(this);
		//�̺�Ʈ ������ ��ü ���
		//Ŭ���� ������ ���� �� ����� ��ü�� ���� ������ ������, �� Ŭ������ ������ ��쿡�� ���� �ʿ����.
		
		//��ư�� ���� �� ���� �� setActionCommand�� �̿��ϸ� ����.
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("button 1"))
			this.tf.setText("ù ��° ��ư");
		else
			this.tf.setText("�� ��° ��ư");
		
		//JButton button = (JButton) e.getSource();
		//�׼� �̺�Ʈ ��ü���� ������ ��ư ��ü�� (��ư ��ü�� ���۷��� ��) �����´�.


		//System.out.println("OMG ��ư�� �� ���������!!!");
	}
	
}
