import java.util.*;

public class TestList 
{

	public static void main(String[] args) 
	{
		//LinkedList<String> list = new LinkedList<String>();
		List<String> list = new LinkedList<String>(); //UpCasting
		//Upcasting ����� ���� ����Ǵ� ���̴�.
		//ArrayList , LinkedList �� � ���¸� �־ �������.
		//List<String> list = new ArrayList<String>();
		list.add(0, "zero");
		list.add("one"); //��ȣ ������ ������ ���ʺ��� ������.
		list.add("two");
		
		list.add(1,"��"); //��ȣ ������ ��� ��� ���� ��, shift�� ��Ŵ.
		
		System.out.println(list);
	}

}
