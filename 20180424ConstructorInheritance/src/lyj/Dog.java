package lyj;

public class Dog extends Animal
{
	//�⺻ ������(Default Constructor)
	//���� Ŭ������ �����ڰ� ���� Ŭ������ �����ڰ� ����Ǳ� ���� �ٷ� ȣ��Ǿ� �����.
	public Dog()
	{
		//super(); �� ��� �־ �׸� ��� �׸�(�⺻ �����ڿ� ����)
		//����� SuperClass ������ ȣ��
		System.out.println("Dog �⺻(����Ʈ) ������");
	}

	public Dog(int a)
	{
		//(������ ȣ���� ���)���� ���� �� ���� Ŭ������ �⺻ �����ڸ� ȣ�� �� �����ڸ� ������.
		super(a);
		System.out.println("Dog ������ ������");
	}
}
