
public class DeskLampTest {

	public static void main(String[] args) 
	{
		DeskLamp deskLamp = new DeskLamp();
		deskLamp.turnOn();
		System.out.println(deskLamp);
		//�̷��� ��ü ��� �� DeskLamp Ŭ���� ������ toString �޼ҵ尡 ȣ��Ǿ� �����.
		//toString ��ü�� ������ �����. ����� ������ ���, �� ������ �� �� ������ �� ����.
		
		deskLamp.turnOff();
		System.out.println(deskLamp);
	}

}
