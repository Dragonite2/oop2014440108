
public class DeskLampTest {

	public static void main(String[] args) 
	{
		DeskLamp deskLamp = new DeskLamp();
		deskLamp.turnOn();
		System.out.println(deskLamp);
		//이렇게 객체 출력 시 DeskLamp 클래스 내부의 toString 메소드가 호출되어 실행됨.
		//toString 객체가 존재할 경우임. 상속을 이해할 경우, 이 구문을 더 잘 이해할 수 있음.
		
		deskLamp.turnOff();
		System.out.println(deskLamp);
	}

}
