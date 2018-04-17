
public class Car 
{
	//Fields
	private String color; //����
	private int speed; //�ӵ�

	//Constructor (������)
	//�޼ҵ� ���� Ŭ�� �̸��� ����
	//��ȯ�� ����
	//�����ڸ� �������� ������ Java�� �Ű� ������ ���� �����ڸ� �ڵ����� �����Ѵ�.
	//�ٸ� �����ڸ� 1���� ������ ��� Java�� �� �������� �ƹ� �ϵ� ���� ������ ���α׷��Ӱ� �̿� ���� ���� ���Ǹ� �ؾ� �Ѵ�.
	
	public static int numberofCars = 0; //Class ���� ����(���� ���� - Static Field)
	//��� ��ü ��Ʋ�� �ϳ� �ִ� ����.
	
	public Car(String color, int speed) 
	{
		this.color = color;
		this.speed = speed;
		numberofCars++;
	}
	
	public static void printCar()
	{
		//���� �޼ҵ忡���� ���� ������ ������ �� �ִ�.
		//(System.out.println(this.color + " , " + this.speed); ���� ������ Error.
		
		System.out.println(numberofCars);
	}
	//Default ������ - �⺻��(�⺻ ������)
	
	public Car()
	{
		this.color = "White";
		this.speed = 60;
		numberofCars++;
	}
	
	/*
	public Car(String color)
	{
		this("Red",35); //this�� ������ ȣ�� ��ɵ� �ִ�.
	}
	*/
	
	//methods
	public String toString()
	{
		return ("Color is " + this.color + " Speed is " + this.speed);
	}

	//������, ������
	public String getColor() {
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	
	
}
