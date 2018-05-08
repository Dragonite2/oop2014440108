import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		//Animal aaa = new Animal();
		Dog tina = new Dog();
		tina.sing();
		tina = new Dog(); //연결이 끊어지고 새 객체와 연결이 되며 연결이 끊어진 객체는 쓰레기 수집장으로 고고싱함.
		tina.eat(); //여기까지는 수퍼 클래스와 서브 클래스 간의 상속 활용과 별 다른 점이 없다.

		Animal aaa = (Animal) new Dog();
		//기존의 Animal 수퍼 클래스와의 연결을 끊고 Dog 클래스와 연결된 객체 생성
		//우변의 클래스가 좌변의 클래스의 서브 클래스인 경우 참조 변수의 타입이 클래스 이름과 달라도 무관.
		//좌변 ← 우변
		
		//Animal aaa = new Dog();와 동일한 기능.
		//이를 Upcasting 이라고 한다.
		aaa.sing(); //그 결과 Dog에서 재정의된(Override) 메소드를 사용함.
		//aaa.eat()는 사용하지 못한다!
		
		aaa = new Cat();
		aaa.sing();
		
		/*
		 int a;
		 a = (int)3.14;
		 형변환(Casting)의 대표적 예시.
		*/

		
		/*
		 다형성(Polymorphism)
		 1. 하나의 클래스로부터 여러 서브 클래스를 만들 경우
		 2. 모든 서브 클래스는 수퍼 클래스의 메소드를 Overriding 한다.
		 3. 
		 SuperClass SuperRefVar = new SubClass();
		 SuperRefVar.overidedMethod() → 수퍼 클래스의 메소드가 아닌 객체의 클래스가 구현한 메소드를 실현함.ㅣ 
		 */
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog"))
			aaa = new Dog();
		else
			aaa = new Cat();
		
		aaa.sing(); //동적 바인딩(Dynamic Binding) : 프로그램 수행 시 호출할 메소드를 결정한다.
		
		//추상 클래스화 시킨 경우에는 아래와 같이 객체 생성이 불가능함.
		//aaa = new Animal();
		
		
	}

}
