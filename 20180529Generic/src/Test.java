
public class Test 
{

	public static void main(String[] args)
	{
		Box box = new Box();
		String str = new String("Hello");
		
		box.setObject(str); //�Ű������� Object�� �޵��� �Ͽ����� String�� �� ����.
		//Object�� String�� ���� ��ü�� �ش��ϱ� ������ Upcasting�� �Ͼ��.
		String str1 = "Mr." + box.getObject(); //�������� Casting �߻�
		//Integer i = 1 + box.getObject(); - �� �ڵ尡 �Ұ����� ������ box�� data�� String ���� ����Ǿ� �ֱ� ����.
		//Integer - Reference type , int - primitive type
		Integer i;
		i = 3;
		i = new Integer(5); //Integer Class�� ���� �� ���� ��ü ���� ����ó�� �����ϴ� ���� ����.
	
		System.out.println(i);
		System.out.println("The box contains " + box.getObject());
		System.out.println("The box contains " + str1);
		
		//primitive ������ box�� �Ű������� ���� �� �ִ� ���� : AutoBoxing
		int j = 32;
		box.setObject(j);
		//System.out.println(box.getObject() + 30); �̰� �ȵ�. ��� Ÿ���� ��ü�� ���� �� ������, ��ȯ�� �� "� ������ ������"�� �־����� �������� ��.
		System.out.println((Integer) box.getObject() + 68); 
	}

}
