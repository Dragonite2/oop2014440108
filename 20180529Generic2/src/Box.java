//Generic version 2
public class Box <T>
{
	private T data;
	
	public void set(T data) //mutator
	{
		this.data = data;
	}
	
	public T get() //accessor(getter)
	{
		return data;
	}
}
