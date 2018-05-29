
public class Test 
{

	public static void main(String[] args)
	{
		Box box = new Box();
		String str = new String("Hello");
		
		box.setObject(str); //매개변수가 Object를 받도록 하였으나 String이 들어간 상태.
		//Object는 String의 상위 객체에 해당하기 때문에 Upcasting이 일어났다.
		String str1 = "Mr." + box.getObject(); //묵시적인 Casting 발생
		//Integer i = 1 + box.getObject(); - 이 코드가 불가능한 이유는 box의 data에 String 값이 저장되어 있기 때문.
		//Integer - Reference type , int - primitive type
		Integer i;
		i = 3;
		i = new Integer(5); //Integer Class로 선언 시 보통 객체 생성 형식처럼 선언하는 것이 좋다.
	
		System.out.println(i);
		System.out.println("The box contains " + box.getObject());
		System.out.println("The box contains " + str1);
		
		//primitive 변수도 box의 매개변수로 던질 수 있는 이유 : AutoBoxing
		int j = 32;
		box.setObject(j);
		//System.out.println(box.getObject() + 30); 이건 안됨. 모든 타입의 객체를 받을 수 있지만, 반환할 때 "어떤 형태의 데이터"를 넣었는지 명시해줘야 함.
		System.out.println((Integer) box.getObject() + 68); 
	}

}
