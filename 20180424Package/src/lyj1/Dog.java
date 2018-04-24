package lyj1;

public class Dog extends Animal
{
	public String name;
	private String IDN;
	String nickName; //package 접근 지정: 패키지 내에서만 public, 이외에서는 private
	void print()
	{
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
}
