package lyj2;
import lyj1.*;
//�ڹ� �ʱ� java.util.Scanner; ���� ����
//�⺻ ��Ű��(default package) : java.lang(import ���� �������� �ʰ� �⺻������ ���)

public class Test 
{
	public static void main(String args[])
	{
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error : age is a private field
		
		 Dog aDog = new Dog(); 
		 //�⺻���� ������� ��ü ���� �� ������ �ٸ� ��Ű���� ������ ���� �Ұ�.(�ش� ��Ű���� ���� Ŭ����)
		 //�ٸ� ��Ű���� Ŭ���� ���� ���
		 //1. �Ʒ�ó�� ��Ű�� �̸�.Ŭ���� �̸� ������ ��ü ����(�Ϻ� Ŭ���� ���赵�� ���� ��)
		 //lyj1.Dog aDog = new lyj1.Dog(); 
		 //2. ��ó�� import ��ɾ� ��� �� �Ϲ����� ��ü ���� ��� ���(��Ű�� �̸�.* : ��Ű�� �� ��� Ŭ������ �����´ٴ� ��.)
		 aDog.name = "Happy";
		 //aDog.IDN = "33232"; private�� ���� ������ ������ ��쿡�� ���� �Ұ�����.
		 //aDog.nickName = "������"; ��Ű�� �� ���� �ʵ�� ������ �ٸ� ��Ű�������� ���� �Ұ�
		 
			Animal aa = new Animal();
			//aa.protectedField = "ddd"; �ܺ� ��Ű�������� privateó�� ������.
			
			Rosemary rr = new Rosemary();
			
	}

}
