
public class TestPoint 
{

	public static void main(String[] args) 
	{
		//Reference 변수 선언.
		Point pnt1 = new Point();
		
		//설정자 메소드를 불러들임.
		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		//Reference 변수 선언.
		Point pnt2 = new Point();
		
		//설정자 메소드를 불러들임.
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
		//pnt.print() → 메소드로 호출하여 출력하도록 유도하기?
		//Point.java 클래스 내부에 주석과 함께 구현한 결과를 포함하였다.
		//pnt1.print();
		//pnt2.print();
		
		//메소드는 객체에 의해 호출이 된다.
		//이 말을 풀어 써보면 print() 메소드 내부의 this는 pnt1의 경우 pnt1이 호출하여으니 pnt1 자신을,
		//pnt2의 경우 pnt2가 호출하였으니 pnt2를 가리킨다는 말이 된다.		
		
		/*
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1);
		
		toString 메소드 적용으로 print 구문을 사용할 때, String 내부의 변수들을 자동으로 String으로 변환하는 과정을 거친다.
		자세히 작동하는 원리는 이후 상속 등의 개념을 익힌 후 이해할 수 있다.
		이 점을 미루어보아 Java는 C언어에 비해 숙달과 조작이 매우 간편하다는 점을 알 수 있다.
		*/
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance()); //원점에서부터 P2까지의 거리 출력
		System.out.println(pnt2.distance(pnt1));
		//동일한 메소드 이름이지만, Java에서는 매개 변수가 일치하지 않으면 다른 메소드로 취급하며 이 특징을 이용해 같은 이름의 메소드를 복수 생성할 수 있다. 
		//이를 Method Overloading 또는 Overloading Method라고 칭함.(중복 메소드)

		
		//System.out.println("("+ pnt.getX() + "," + pnt.getY() + ")");
	}

}
