//상속 결정법
//1. 생성 시 Superclass 지정
//2. 클라스 생성 시 extends + SuperClass 지정

//상속 : Field와 Method 모두 가져옴.
public class Dog extends Animal 
{

	public Dog(String name)
	{
		super(name);
	}

	//override 및 overriding이라고 칭한다.
	//정의는 완전 상속을 거부하고 새로 메소드를 정의하는 것.
	
	//Override 선언하는 이유 : 
	
	@Override
	public void sing()
	{
		//private로 지정한 필드는 상속자가 물려받을 수 없는 듯함.
		System.out.println(name + " 멍멍");
	}
	
}
