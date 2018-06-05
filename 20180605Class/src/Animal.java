
public abstract class Animal 
{
	String name;
	//Abstract Class는 Interface와 다르게 필드가 존재할 수 있다. 일반적인 메소드도 가능하고.
	public Animal(String name)
	{
		this.name = name;
	}
	public abstract void sing(); //추상 메소드 선언
}
