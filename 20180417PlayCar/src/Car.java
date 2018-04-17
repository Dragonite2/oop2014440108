
public class Car 
{
	//Fields
	private String color; //색상
	private int speed; //속도

	//Constructor (생성자)
	//메소드 명이 클라스 이름과 동일
	//반환형 없음
	//생성자를 정의하지 않으면 Java는 매개 변수가 없는 생성자를 자동으로 생성한다.
	//다만 생성자를 1개라도 정의한 경우 Java는 그 순간부터 아무 일도 하지 않으며 프로그래머가 이에 대해 따로 정의를 해야 한다.
	
	public static int numberofCars = 0; //Class 유일 변수(정적 변수 - Static Field)
	//모든 객체 통틀어 하나 있는 변수.
	
	public Car(String color, int speed) 
	{
		this.color = color;
		this.speed = speed;
		numberofCars++;
	}
	
	public static void printCar()
	{
		//정적 메소드에서는 정적 변수만 접근할 수 있다.
		//(System.out.println(this.color + " , " + this.speed); 옆의 문장은 Error.
		
		System.out.println(numberofCars);
	}
	//Default 생성자 - 기본값(기본 생성자)
	
	public Car()
	{
		this.color = "White";
		this.speed = 60;
		numberofCars++;
	}
	
	/*
	public Car(String color)
	{
		this("Red",35); //this는 생성자 호출 기능도 있다.
	}
	*/
	
	//methods
	public String toString()
	{
		return ("Color is " + this.color + " Speed is " + this.speed);
	}

	//생성자, 접근자
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
