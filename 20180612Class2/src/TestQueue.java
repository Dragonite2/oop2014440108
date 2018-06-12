import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException
	{
			Queue<String> strs = new PriorityQueue<String>();
			//알파벳 순으로 지정하는 '우선순위 큐'
			strs.add("Trump");
			strs.add("김정은");
			strs.add("President");
			strs.add("Joonpyo");
			
			while(!strs.isEmpty())
			//strs queue가 비면 반복문 탈출
			{
				System.out.println(strs.remove());
				//요소 제거와 동시에 요소 return
				Thread.sleep(1000); //스레드를 1초간 재운다. 
			}
	}

}
