import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing 
{
	//Animal 타입을 매개변수로 받는 리스트.
	List<Animal> list; //List 필드 선언
	public AnimalSing() //constructor
	{
		list = new ArrayList<Animal>();
	}
	
	//add 메소드(리스트에 요소 추가하는 메소드)
	public void add(Animal ele)
	{
		list.add(ele);
	}
	
	void sing()
	{
		Animal ele;
		Iterator<Animal> e = list.iterator();
		
		//다형성의 장점 : if-else 등 각자의 타입에 따라 일일히 대응할 필요가 없다! 다형성의 원리를 응용하면 간단한 코드로 효율이 좋은 프로그램을 구현할 수 있다.
		while(e.hasNext())
		{
			ele = e.next(); //Animal.sing이 됨.
			ele.sing();
		}
	}
}
