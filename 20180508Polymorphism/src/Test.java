import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		//Animal aaa = new Animal();
		Dog tina = new Dog();
		tina.sing();
		tina = new Dog(); //������ �������� �� ��ü�� ������ �Ǹ� ������ ������ ��ü�� ������ ���������� ������.
		tina.eat(); //��������� ���� Ŭ������ ���� Ŭ���� ���� ��� Ȱ��� �� �ٸ� ���� ����.

		Animal aaa = (Animal) new Dog();
		//������ Animal ���� Ŭ�������� ������ ���� Dog Ŭ������ ����� ��ü ����
		//�캯�� Ŭ������ �º��� Ŭ������ ���� Ŭ������ ��� ���� ������ Ÿ���� Ŭ���� �̸��� �޶� ����.
		//�º� �� �캯
		
		//Animal aaa = new Dog();�� ������ ���.
		//�̸� Upcasting �̶�� �Ѵ�.
		aaa.sing(); //�� ��� Dog���� �����ǵ�(Override) �޼ҵ带 �����.
		//aaa.eat()�� ������� ���Ѵ�!
		
		aaa = new Cat();
		aaa.sing();
		
		/*
		 int a;
		 a = (int)3.14;
		 ����ȯ(Casting)�� ��ǥ�� ����.
		*/

		
		/*
		 ������(Polymorphism)
		 1. �ϳ��� Ŭ�����κ��� ���� ���� Ŭ������ ���� ���
		 2. ��� ���� Ŭ������ ���� Ŭ������ �޼ҵ带 Overriding �Ѵ�.
		 3. 
		 SuperClass SuperRefVar = new SubClass();
		 SuperRefVar.overidedMethod() �� ���� Ŭ������ �޼ҵ尡 �ƴ� ��ü�� Ŭ������ ������ �޼ҵ带 ������.�� 
		 */
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog"))
			aaa = new Dog();
		else
			aaa = new Cat();
		
		aaa.sing(); //���� ���ε�(Dynamic Binding) : ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		
		//�߻� Ŭ����ȭ ��Ų ��쿡�� �Ʒ��� ���� ��ü ������ �Ұ�����.
		//aaa = new Animal();
		
		
	}

}
