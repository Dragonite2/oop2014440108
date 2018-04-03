
public class TestString {

	public static void main(String[] args)
	{
		// 변수 비교 예제.
		int a, b;
		a = 3;
		b = 3;
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//x==y 꼴일 경우 boolean 판정을 받게 되어 true 또는 false 값을 뱉게 된다.
		
		System.out.println(a==b);
		//기초형 변수의 경우 값이 같으면 true로 보나,
		System.out.println(str1 == str2);
		//참조형 변수의 경우, '객체의 내용이 같다'는 의미가 아니다!(Reference 변수 str1 str2는 엄연히 다르기 때문.)
		System.out.println(str1.equals(str2));
		//equals 메소드를 소환하여 내용 비교 시, 정상적으로 내용 비교를 하게 된다.
		
		str1 = str2; //str1의 주소값에 str2의 주소값을 덮어씌운다.
		//주의 : 이렇게 되면 기존의 str1의 '주소값'은 더 이상 활용이 불가능하게 됨. 즉, garbage(쓰레기)가 된다.
		//활용이 안 되는 [메모리 공간]은 결국 JVM 내의 [Garbage collector(쓰레기 수집기)]에 의해 제거됨. 이 활동을 '쓰레기 수집'이라고 한다.
		System.out.println(str1 == str2); //이렇게 되면 Reference 변수의 원리에 의해 str1과 str2가 동일하게 된다.
	}

}
