//��� ������
//1. ���� �� Superclass ����
//2. Ŭ�� ���� �� extends + SuperClass ����

//��� : Field�� Method ��� ������.
public class Dog extends Animal 
{

	public Dog(String name)
	{
		super(name);
	}

	//override �� overriding�̶�� Ī�Ѵ�.
	//���Ǵ� ���� ����� �ź��ϰ� ���� �޼ҵ带 �����ϴ� ��.
	
	//Override �����ϴ� ���� : 
	
	@Override
	public void sing()
	{
		//private�� ������ �ʵ�� ����ڰ� �������� �� ���� ����.
		System.out.println(name + " �۸�");
	}
	
}
