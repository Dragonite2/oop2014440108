
public class TestCar 
{

	public static void main(String[] args) 
	{
		//���� �޼ҵ�(static method)
		/*
		�Ϲ������� �޼ҵ带 ȣ���Ϸ��� ��ü�� �����Ǿ�� �Ѵ�. �� [��ü]�� ���Ͽ� [�޼ҵ�]�� ȣ���ϱ� ����.
		�ٸ� �Ϻ� �޼ҵ�� �� �ٸ� ��ü ���� �ʿ� ���� ȣ���� �� �ִ�.
		��, ���� �޼ҵ�� ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ��� �� �� �ִ�.
		
		 */
		
		System.out.println(Math.cos(0)); //Math.cos() �Ǵ� Math.sqrt() ���� ��ü�� �߰��� �������� �ʰ� ����� �� �ִ� ���� �޼ҵ��̴�.
		Car myCar = new Car("Space Blue",300);
		System.out.println(myCar.numberofCars); //1�� ��µ�
		Car yourCar = new Car(); //�����ڸ� ������ �ʾ��� ��� ������ ������ �����ڰ� 1�� �̻� ����� ��� �߰��� '�Ű����� ���� ������'�� �� ������ �۵� ����.
		System.out.println(yourCar.numberofCars); //2�� ��µ�
		
		System.out.println(Car.numberofCars); //���� �ʵ�� �Ϲ� Ŭ�� �̸����� ȣ���Ͽ��� ����.
		/*
		myCar.setColor("Black");
		myCar.setSpeed(100);
		*/
		System.out.println(myCar);
		Car.printCar(); //���� �޼ҵ�� ȣ�� �� ������ ���� ���Ÿ�ü(��︲ü)�� ���´�.
		//Static method & Static variable = �Ϲ� Ŭ�� �̸����� ȣ��
	}

}
