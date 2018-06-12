import java.util.*;

public class TestMap 
{

	public static void main(String[] args) 
	{
		Map<String, String> map = new LinkedHashMap<String, String>();
		//HashMap : 해시 함수 순서
		//TreeMap : 키의 알파벳 순서
		//LinkedHashMap : 집어넣은 순서
		//추가 : .put(key, value)
		//값 탐색 : .get(key)
		
		map.put("파이리", "불"); //요소 추가
		map.put("꼬부기", "물");
		map.put("피카츄", "전기");
		map.put("아보크", "독");
		
		System.out.println(map.get("파이리")); //key값의 value를 얻어낸다.
		System.out.println(map.get("꼬부기"));
		System.out.println(map.get("피카츄"));
		System.out.println(map.get("아보크"));
		
		//Sweep
		//1. Iterator를 이용한 Sweep
		Set<String> set = map.keySet(); //map.set() 메소드 : map에 저장되어 있는 entry(키, 값) 중 key만 모은 집합. 
		//우변을 보면 "keySet()"으로 직관적으로 봐도 key만 모은 집합인 것을 알 수 있다.
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(String.format("키 : %s, 값 : %s", key,map.get(key)));
		}
		
		//2.for문
		for(String key2 : map.keySet())
			System.out.println(String.format("키 : %s, 값 : %s", key2, map.get(key2)));
		
		//3. Entry Set 만들기
		for(Map.Entry<String,String> elem : map.entrySet())
			System.out.println(String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()));
		

		
	}

}
