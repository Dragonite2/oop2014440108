package lyj1;

public class Animal 
{
	public String publicField;
	private String privateField;
	
	//protected : ��Ű�� ���ο� ������� ��ӵ�
	//���� ��Ű�� ������ public
	//Ÿ ��Ű�� ������ private(�ٸ�, protected�� ����� �����ϴ�.)
	//private�� ��� ��ü�� �ȵȴٴ� ���� ������.
	String packageField;
	protected String protectedField;
	
	public Animal() //���� ������ ���� �����ڸ� ���� ���� ������ �ٸ� ��Ű������ ������ �� ����.
	{
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
	
}
