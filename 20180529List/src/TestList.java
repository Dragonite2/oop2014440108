import java.util.*;

public class TestList 
{

	public static void main(String[] args) 
	{
		//LinkedList<String> list = new LinkedList<String>();
		List<String> list = new LinkedList<String>(); //UpCasting
		//Upcasting 사용이 가장 권장되는 편이다.
		//ArrayList , LinkedList 등 어떤 형태를 넣어도 상관없음.
		//List<String> list = new ArrayList<String>();
		list.add(0, "zero");
		list.add("one"); //번호 지정이 없으면 끝쪽부터 연결함.
		list.add("two");
		
		list.add(1,"돌"); //번호 지정한 대로 요소 지정 후, shift를 시킴.
		
		System.out.println(list);
	}

}
