
public class TestString 
{
	public static void main(String[] args) 
	{	
		int a = 10; //int �ڷ����� ���� a ���� + �� 10�� a�� ������.
		//���� ����(primitive variable)
		//String ��ü ����
		String str; //Class String�� ��ü�� ������ �� �ִ� ���� ����(Reference ����) ����
		//�ҹ��ڷ� �����ϴ� int(C������ ����)�ʹ� �޸�
		//String�� "�빮��"�� �����ϴµ�, �ٷ� Class�� �̸��̶�� ���� �ǹ���.
		str = new String("Hello darkness my old friend."); //��ü ����
		
		//�޼ҵ� ȣ�� ��� : ���� ����.�޼ҵ�()
		int len = str.length(); //String ��ü�� ����
		System.out.println("string length is : " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
	}

}
