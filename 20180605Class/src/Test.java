
public class Test 
{

	public static void main(String[] args) 
	{
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("����");
		//Upcasting
		
		aDog.sing();
		//aDog.playFetch(); Dog ��ü�� �����Ǿ����� ���������� �����ϴ� Ŭ������ Animal Ŭ������ ������ ���� �Ұ�. aDog��� ���������� Dog�� playFetch �޼ҵ带 �� �� ����.
		aCat.sing();
		
		
		((Dog) aDog).playFetch(); //Downcasting. Super Class�� ����Ű�� ��ü�� �ٽ� Sub Class�� ����Ű���� ��.
		// ((Cat) aDog).playFetch(); �Ұ�����
		// ((Dog) aCat).playFetch(); //������ ������ �߻����� ������, ���� ���� ��Ÿ�� ������ �߻�.
		/*
	
		Exception in thread "main" java.lang.ClassCastException: Cat cannot be cast to Dog
	at Test.main(Test.java:17)

		������ ������ ������ �߻���Ű�� ������, ���� ���� ���� ��ü�� �ٰ��Ͽ� ������ �ִٰ� �ǴܵǸ� ��Ÿ�� ������ �߻���Ŵ.
		
		*/
		// ((Cat) aCat).playFetch(); �Ұ�����
		
		Dog dog = (Dog) aDog; //�̷� ������ �������� DownCasting�� ������.
		dog.playFetch();
		
		//���� ((Dog) aDog)�� �Ͻ����� DownCasting������, ���� Downcasting�� �޸� ������ �Ҵ��Ͽ� �������� Downcasting ������ �����ϴ� ����� �ϰ� �ִ�.
		/* ��� : Downcasting�� �ſ� �����Ͽ� ����Ͽ��� �Ѵ�. */
	}

}
