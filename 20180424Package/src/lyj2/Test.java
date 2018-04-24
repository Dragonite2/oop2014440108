package lyj2;
import lyj1.*;
//자바 초기 java.util.Scanner; 같은 원리
//기본 패키지(default package) : java.lang(import 구문 선언하지 않고도 기본적으로 사용)

public class Test 
{
	public static void main(String args[])
	{
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; Error : age is a private field
		
		 Dog aDog = new Dog(); 
		 //기본적인 방식으로 객체 선언 시 완전히 다른 패키지기 때문에 접근 불가.(해당 패키지에 없는 클래스)
		 //다른 패키지의 클래스 접근 방법
		 //1. 아래처럼 패키지 이름.클래스 이름 식으로 객체 선언(일부 클래스 설계도만 참고 시)
		 //lyj1.Dog aDog = new lyj1.Dog(); 
		 //2. 위처럼 import 명령어 사용 후 일반적인 객체 생성 방식 사용(패키지 이름.* : 패키지 내 모든 클래스를 가져온다는 뜻.)
		 aDog.name = "Happy";
		 //aDog.IDN = "33232"; private로 접근 범위가 지정된 경우에는 역시 불가능함.
		 //aDog.nickName = "보신탕"; 패키지 내 범위 필드기 때문에 다른 패키지에서는 접근 불가
		 
			Animal aa = new Animal();
			//aa.protectedField = "ddd"; 외부 패키지에서는 private처럼 접근함.
			
			Rosemary rr = new Rosemary();
			
	}

}
