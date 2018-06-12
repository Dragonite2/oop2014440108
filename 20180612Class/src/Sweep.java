import java.util.*;

public class Sweep
{

	public static void main(String[] args) 
	{
		Set<String> strs = new LinkedHashSet<String>(); //"����" ��ü ��ȯ.
		//Hashset : �ؽ��Լ� ������ ����(������ �� �� ����.)
		//Treeset : ���ĺ� ������ ����.
		//LinkedHashSet : ���ĺ� �������� ����.
		//�⺻���� �޼ҵ� add(), remove(), set(), sweep ��
		strs.add("Trump");
		strs.add("������");
		strs.add("President");
		strs.add("Joonpyo");
		
		//Sweep�ϴ� ���
		//1. Iterator ���
		Iterator<String> e = strs.iterator(); //�ݺ���(�ſ� �߻�����.)
		while(e.hasNext()) //������ �ȴ�.
		{
			String str = e.next(); //�ϳ��� ����.
			System.out.println(str);
			//�ؽ� �Լ��� ������� ���.
		}
		//2. for() �ݺ��� ���
		//for(��� Ÿ�� ���� ���� : collection ���� [���⼭�� ���� ����]) ����
		for(String str1: strs)
		{
			System.out.println(str1);
		}
	}

}
