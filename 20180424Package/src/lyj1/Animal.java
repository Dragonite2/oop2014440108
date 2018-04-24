package lyj1;

public class Animal 
{
	public String publicField;
	private String privateField;
	
	//protected : 패키지 여부와 상관없이 상속됨
	//동일 패키지 내에서 public
	//타 패키지 내에서 private(다만, protected라도 상속은 가능하다.)
	//private가 상속 자체가 안된다는 점과 대조적.
	String packageField;
	protected String protectedField;
	
	public Animal() //접근 지정자 없이 생성자를 만들 수는 있지만 다른 패키지에서 접근할 수 없음.
	{
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}
	
}
