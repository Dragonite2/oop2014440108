
public class Animal 
{
	//Field
	public String name;
	
	//Constructor
	public Animal(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sing()
	{
		System.out.println(name + " Sing");
	}
}
