
public class TestString {

	public static void main(String[] args)
	{
		// ���� �� ����.
		int a, b;
		a = 3;
		b = 3;
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//x==y ���� ��� boolean ������ �ް� �Ǿ� true �Ǵ� false ���� ��� �ȴ�.
		
		System.out.println(a==b);
		//������ ������ ��� ���� ������ true�� ����,
		System.out.println(str1 == str2);
		//������ ������ ���, '��ü�� ������ ����'�� �ǹ̰� �ƴϴ�!(Reference ���� str1 str2�� ������ �ٸ��� ����.)
		System.out.println(str1.equals(str2));
		//equals �޼ҵ带 ��ȯ�Ͽ� ���� �� ��, ���������� ���� �񱳸� �ϰ� �ȴ�.
		
		str1 = str2; //str1�� �ּҰ��� str2�� �ּҰ��� ������.
		//���� : �̷��� �Ǹ� ������ str1�� '�ּҰ�'�� �� �̻� Ȱ���� �Ұ����ϰ� ��. ��, garbage(������)�� �ȴ�.
		//Ȱ���� �� �Ǵ� [�޸� ����]�� �ᱹ JVM ���� [Garbage collector(������ ������)]�� ���� ���ŵ�. �� Ȱ���� '������ ����'�̶�� �Ѵ�.
		System.out.println(str1 == str2); //�̷��� �Ǹ� Reference ������ ������ ���� str1�� str2�� �����ϰ� �ȴ�.
	}

}
