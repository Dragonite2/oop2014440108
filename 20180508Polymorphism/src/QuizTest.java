
public class QuizTest {

	public static void main(String[] args) {
		//인터페이스 참조변수
		Drivable myCar = new Car();
		Drivable myBike = new Bicycle();
		
		//메소드 호출
		myCar.acc();
		myCar.brake();
		
		myBike.acc();
		myBike.brake();
		
		

	}

}
