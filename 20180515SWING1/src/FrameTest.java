import javax.swing.JFrame;
//javax.swing�̶�� ��Ű������ JFrame�̶�� Ŭ������ ���Խ��״�.

public class FrameTest 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("LYJ frame");
		frame.setSize(900,500); //���� ����, ���� ����(�ȼ� ����)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� ��ư�� ������ â�� ����ǰ� ������.
		//JFrame�� Ŭ���� �̸��̰�, EXIT_ON_CLOSE�� ����(static) �ʵ�.
		//���� �޼ҵ�� �̸� �ڿ� () ��ȣ�� �پ�� ��...
		//EXIT_ON_CLOSE : ������ ��(constant)
		frame.setVisible(true); //â�� ���̰� ��.
	}
}
