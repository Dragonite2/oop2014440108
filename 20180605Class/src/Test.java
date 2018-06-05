
public class Test 
{

	public static void main(String[] args) 
	{
		Animal aDog = new Dog("Tina");
		Animal aCat = new Cat("망고");
		//Upcasting
		
		aDog.sing();
		//aDog.playFetch(); Dog 객체가 생성되었지만 실질적으로 참조하는 클래스는 Animal 클래스기 때문에 접근 불가. aDog라는 참조변수는 Dog의 playFetch 메소드를 볼 수 없다.
		aCat.sing();
		
		
		((Dog) aDog).playFetch(); //Downcasting. Super Class를 가리키던 객체를 다시 Sub Class를 가리키도록 함.
		// ((Cat) aDog).playFetch(); 불가능함
		// ((Dog) aCat).playFetch(); //컴파일 에러는 발생하지 않지만, 실행 도중 런타임 에러가 발생.
		/*
	
		Exception in thread "main" java.lang.ClassCastException: Cat cannot be cast to Dog
	at Test.main(Test.java:17)

		컴파일 전까지 오류를 발생시키지 않지만, 실행 도중 참조 객체에 근거하여 오류가 있다고 판단되면 런타임 오류를 발생시킴.
		
		*/
		// ((Cat) aCat).playFetch(); 불가능함
		
		Dog dog = (Dog) aDog; //이런 식으로 영구적인 DownCasting이 가능함.
		dog.playFetch();
		
		//위의 ((Dog) aDog)는 일시적인 DownCasting이지만, 위의 Downcasting은 메모리 공간을 할당하여 영구적인 Downcasting 역할을 수행하는 기능을 하고 있다.
		/* 결론 : Downcasting은 매우 조심하여 사용하여야 한다. */
	}

}
