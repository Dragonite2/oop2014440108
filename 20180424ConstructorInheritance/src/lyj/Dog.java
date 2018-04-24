package lyj;

public class Dog extends Animal
{
	//기본 생성자(Default Constructor)
	//수퍼 클래스의 생성자가 서브 클래스의 생성자가 실행되기 전에 바로 호출되어 실행됨.
	public Dog()
	{
		//super(); 이 경우 있어도 그만 없어도 그만(기본 생성자에 한해)
		//명시적 SuperClass 생성자 호출
		System.out.println("Dog 기본(디폴트) 생성자");
	}

	public Dog(int a)
	{
		//(묵시적 호출의 경우)역시 수행 전 수퍼 클래스의 기본 생성자를 호출 후 생성자를 실행함.
		super(a);
		System.out.println("Dog 정수형 생성자");
	}
}
