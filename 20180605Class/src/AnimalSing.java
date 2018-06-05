import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing 
{
	//Animal Ÿ���� �Ű������� �޴� ����Ʈ.
	List<Animal> list; //List �ʵ� ����
	public AnimalSing() //constructor
	{
		list = new ArrayList<Animal>();
	}
	
	//add �޼ҵ�(����Ʈ�� ��� �߰��ϴ� �޼ҵ�)
	public void add(Animal ele)
	{
		list.add(ele);
	}
	
	void sing()
	{
		Animal ele;
		Iterator<Animal> e = list.iterator();
		
		//�������� ���� : if-else �� ������ Ÿ�Կ� ���� ������ ������ �ʿ䰡 ����! �������� ������ �����ϸ� ������ �ڵ�� ȿ���� ���� ���α׷��� ������ �� �ִ�.
		while(e.hasNext())
		{
			ele = e.next(); //Animal.sing�� ��.
			ele.sing();
		}
	}
}
