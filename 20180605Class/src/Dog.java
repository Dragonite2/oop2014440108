
public class Dog extends Animal 
{
	public Dog(String name)
	{
		super(name);
	}
	
	@Override
	public void sing()
	{
		System.out.println(this.name + " �۸�");
	}
	
	public void playFetch()
	{
		System.out.println("����� ����");
	}
}
