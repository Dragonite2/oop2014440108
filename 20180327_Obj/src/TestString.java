
public class TestString 
{
	public static void main(String[] args) 
	{	
		int a = 10; //int 자료형의 변수 a 생성 + 값 10을 a에 저장함.
		//원시 변수(primitive variable)
		//String 객체 생성
		String str; //Class String의 객체를 참조할 수 있는 참조 변수(Reference 변수) 생성
		//소문자로 시작하는 int(C언어에서도 존재)와는 달리
		//String은 "대문자"로 시작하는데, 바로 Class의 이름이라는 것을 의미함.
		str = new String("Hello darkness my old friend."); //객체 생성
		
		//메소드 호출 방법 : 참조 변수.메소드()
		int len = str.length(); //String 객체의 길이
		System.out.println("string length is : " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1 : " + str1);
	}

}
