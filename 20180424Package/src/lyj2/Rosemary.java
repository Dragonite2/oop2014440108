package lyj2;

public class Rosemary extends lyj1.Dog
{
	public Rosemary()
	{
		//Error packageField = "packagerosemary";
		//타 패키지에서 상속을 받을 때, package 멤버는 딸려나오지 않는다.
		//대신, protected는 동일 패키지 내에서만 public이고 타 패키지 사이에서는 private지만 타 패키지에서 상속받을 시 사용이 가능함.
		//신기하게도 protected는 상속받은 클래스 내부에서는 사용이 가능하지만 객체를 생성하여 참조할 수 없다.(public에 비해 범용성이 상당히 꽁기꽁기하다는 뜻임.)
		protectedField = "test"; 
	}
}
