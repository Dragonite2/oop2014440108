import java.awt.event.*;

import javax.swing.*;
//java.awt.event�� ��Ű�� �̸�, ActionEvent�� ActionListener�� Ŭ���� �̸�
//ù ��° �̺�Ʈ ������ ���� ���

public class MyListener implements ActionListener 
{
	//�� �������̽��� �Ʒ��� �޼ҵ� �ϳ��� ���ǵǾ� ����.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		//�׼� �̺�Ʈ ��ü���� ������ ��ư ��ü�� (��ư ��ü�� ���۷��� ��) �����´�.
		button.setText("��ư�� ���������.");
		System.out.println("OMG ��ư�� ���������!!!");
	}

}
