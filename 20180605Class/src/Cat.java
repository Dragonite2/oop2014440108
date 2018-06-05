
public class Cat extends Animal 
{
	public Cat(String name)
	{
		super(name);
	}
	
	@Override
	public void sing()
	{
		System.out.println(this.name + " ¾ß¿Ë");
	}
}
