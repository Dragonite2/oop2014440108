import java.util.*;

public class Sweep
{

	public static void main(String[] args) 
	{
		Set<String> strs = new LinkedHashSet<String>(); //"집합" 객체 소환.
		//Hashset : 해쉬함수 순서로 정렬(순서를 알 수 없다.)
		//Treeset : 알파벳 순으로 정렬.
		//LinkedHashSet : 알파벳 역순으로 정렬.
		//기본적인 메소드 add(), remove(), set(), sweep 등
		strs.add("Trump");
		strs.add("김정은");
		strs.add("President");
		strs.add("Joonpyo");
		
		//Sweep하는 방법
		//1. Iterator 사용
		Iterator<String> e = strs.iterator(); //반복자(매우 추상적임.)
		while(e.hasNext()) //끝까지 훑다.
		{
			String str = e.next(); //하나씩 빼냄.
			System.out.println(str);
			//해시 함수의 순서대로 출력.
		}
		//2. for() 반복문 사용
		//for(요소 타입 참조 변수 : collection 변수 [여기서는 참조 변수]) 구문
		for(String str1: strs)
		{
			System.out.println(str1);
		}
	}

}
