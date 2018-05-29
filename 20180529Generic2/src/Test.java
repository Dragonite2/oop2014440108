
public class Test 
{

	public static void main(String[] args)
	{
			Box<String> box  = new Box<String>(); //String을 저장하는 Box
			String str = new String("Hello");
			
			box.set(str);
			System.out.println("The box has " + box.get());
			
			Box <Integer> ibox = new Box<Integer>(); //integer를 저장하는 Box
			Integer i = new Integer(10);
			
			ibox.set(i);
			System.out.println(100 + ibox.get());
	}

}
