import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException
	{
			Queue<String> strs = new PriorityQueue<String>();
			//���ĺ� ������ �����ϴ� '�켱���� ť'
			strs.add("Trump");
			strs.add("������");
			strs.add("President");
			strs.add("Joonpyo");
			
			while(!strs.isEmpty())
			//strs queue�� ��� �ݺ��� Ż��
			{
				System.out.println(strs.remove());
				//��� ���ſ� ���ÿ� ��� return
				Thread.sleep(1000); //�����带 1�ʰ� ����. 
			}
	}

}
