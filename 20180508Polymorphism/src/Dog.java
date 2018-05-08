
public class Dog extends Animal implements Playable
{
	@Override
	void sing()
	{
		System.out.println("A dog barks");
	}
	
	void eat()
	{
		System.out.println("A dog eats");
	}
	public void walk()
	{
		System.out.println("Walk with a dog");
	}
	public void fetch()
	{
		System.out.println("Play fetch with a dog");
	}
}
