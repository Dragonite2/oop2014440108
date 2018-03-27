
public class RememberC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 C언어 복습
		 
		  변수 = 메모리 저장공간의 이름
		  자료형
		 1. 변수가 가질 수 있는 값의 범위를 정한다.
		 2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 구한다.
		 3. 값을 메모리에 저장하기 위해 필요한 정보(저장 공간의 수, 저장 포맷) 저장
		 
		 변수 선언문 = 변수 이름 + 자료형(변수 사용 전 반드시 변수 선언을 해야 함.)
		
		 */
		int a,b; //변수 선언문 - a라는 이름의 정수형 변수 선언
		//리터럴(상수 - literal) : 소스 코드에서 값을 표현하는 방법.
		//연산자 : 연산을 위한 기호
		//대입 연산자(=) : 우변의 값을 좌변의 저장소로 이동한다.(저장 장소 ← 값)
		//수식(Expression) : 연산자와 피연산자(리터럴, 변수, 수식)들의 조합.
		//모든 수식은 값을 반환(return)한다.
		//부수효과(Side Effect) : 수식이 값을 반환하는 것 이외의 동작을 함.
		
		a = 0x10; //a에 16의(16진수 기준) 값 대입
		a = a * 10 + 20;
		
		//post increment(후위 연산자) : 반환값은 a, 부수효과는 a=a+1
		
		b = a++; //b는 a의 값 180을 반환하며, 이 문장이 끝나면 a에 1이 더해져 나옴.
		
		//위의 변수 선언문은 수식으로 이루어져 있다.
		//a = a에서 좌변의 a는 [저장 장소], 우변의 a는 [값]이다.
		
		System.out.println("a = " + a + " ," + " b = " + b); // 좌측 문자열에 [a]라는 변수를 + 연산자로 집어넣어라.
		a = 10;
		b = ++a;
		//pre increment(전위 연산자) : 반환값 a+1, 부수효과도 a=a+1;
		System.out.println("a = " + a + " ," + " b = " + b);
		System.out.println("Hello " + "there"); //C에서는 'concatenate'라고 함. println 문장의 + 기능
		
		//Java는 부울 자료형과 true/false 리터럴을 사용한다.
		//논리 연산자의 피연산자는 부울 변수 또는 리터럴을 사용해야 함.
		//관계 연산자는 부울 값을 반환한다.
		boolean bb;
		bb = true || false;
		bb = 0>1; //수식 자체 대입 가능.
		System.out.println("bb = " + bb);
		
		final int c = 100; //C언어에서의 const(상수형 선언)와 같은 기능. Java에서 상수를 선언할 때.
			
		System.out.println("c = " + c);
		
		//소수점 자료형 : float, double
		float ff;
		double dd;
		ff = 3.14f; //리터럴 3.14f의 자료형은 float.
		dd = 3.14; //리터럴 3.14의 자료형은 double.
		System.out.println("ff = " + ff + " ," + " dd = " + dd);
		
		int x = 10;
		double y = 100.34;
		x = (int) y; //explicit casting
		// y = x; (implicit casting)
		System.out.println("x = " + x + " ," + " y = " + y);
	}

}
