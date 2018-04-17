
public class TestCar 
{

	public static void main(String[] args) 
	{
		//정적 메소드(static method)
		/*
		일반적으로 메소드를 호출하려면 객체가 생성되어야 한다. 그 [객체]에 한하여 [메소드]를 호출하기 때문.
		다만 일부 메소드는 또 다른 객체 생성 필요 없이 호출할 수 있다.
		즉, 정적 메소드는 객체를 생성하지 않고 사용할 수 있는 메소드라고 할 수 있다.
		
		 */
		
		System.out.println(Math.cos(0)); //Math.cos() 또는 Math.sqrt() 등은 객체를 추가로 생성하지 않고 사용할 수 있는 정적 메소드이다.
		Car myCar = new Car("Space Blue",300);
		System.out.println(myCar.numberofCars); //1이 출력됨
		Car yourCar = new Car(); //생성자를 만들지 않았을 경우 오류가 없지만 생성자가 1개 이상 선언된 경우 추가로 '매개변수 없는 생성자'를 더 만들어야 작동 가능.
		System.out.println(yourCar.numberofCars); //2가 출력됨
		
		System.out.println(Car.numberofCars); //정적 필드는 일반 클라스 이름으로 호출하여도 무관.
		/*
		myCar.setColor("Black");
		myCar.setSpeed(100);
		*/
		System.out.println(myCar);
		Car.printCar(); //정적 메소드는 호출 시 다음과 같이 이탤릭체(기울림체)로 나온다.
		//Static method & Static variable = 일반 클라스 이름으로 호출
	}

}
