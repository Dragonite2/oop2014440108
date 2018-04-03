
public class Test {
	public static void main(String[] args) 
	{
		
		Point p;
		p = new Point(); 
		//Point 객체 생성, Reference p에 저장.
		
		double temp = 1.0;
		
		p.setX(temp);
		System.out.println("temp=" + temp);
		
		p.setY(temp);
		//여기까지는 C언어의 구조체 참조와 거의 비슷함.
		//'객체의 필드 접근'.

		
		System.out.println(p.getX());
		System.out.println(p.getY());
		//접근자 메소드를 호출하여 x,y 필드값을 반환함.		

		

		System.out.println(p.distance());
		//distance 거리 메소드를 호출하여 거리 계산값을 반환함.
	}

}
