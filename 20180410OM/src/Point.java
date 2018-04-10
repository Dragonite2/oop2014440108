
public class Point 
{
	//x,y 필드 선언.(x, y)
	private double x;
	private double y;

	//String 객체를 반환
	public String toString()
	{
		return ("(" + this.getX() + ", " + this.getY() + ")");
		//입력 변수란에 toString(this.x)으로 수정하면 오류가 나는데, 그 이유는
		//this.x가 Reference 변수가 아닌 원시(일반)변수이기 때문에.
	}
	
	//x,y에 대한 설정자(mutater), 접근자(accessor) 메소드 선언
	public double getX()
	{
		return x;
	}
	
	public void setX(double x) 
	{
		this.x = x;
	}
	
	public double getY() 
	{
		return y;
	}
	
	public void setY(double y) 
	{
		this.y = y;
	}
	
	//거리 측정 메소드
	public double distance()
	//원점을 기준으로 거리를 재는 메소드이기 때문에 매개변수가 따로 필요없다.
	{
		return Math.sqrt(x*x+y*y); //위의 field x,y
	}
	
	//점과 점 사이의 거리 측정 메소드(관건 : 동일한 이름.)
	//C언어에서는 동일한 함수의 이름이 선언되면 오류가 나지만, Java에서의 메소드는 이야기가 다르다.
	public double distance(Point p)
	{
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()));
		//알고리즘 설명 : this.x()(기준점 - '호출한 객체'의 데이터) - p.getX()(선택점 - '매개변수 객체'의 데이터)
	}
	
	
	
	//좌표 출력 메소드
	public void print()
	//클래스 외부에서도 호출이 가능해야 하기 때문에 public으로 지정.
	//반환값이 없으므로 자료형은 void.
	//메소드 이름은 print, 매개변수 없음.
	{
		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
		//1차 시도로 this.getX(), this.getY() 쓰지 않고 필드 x,y를 사용하여도 같은 결과가 나왔다.
		//물론, this(이 클래스, 이 객체) . 메소드() 형식으로 '이 객체의 메소드 불러들이기'도 말이 된다.
		//같은 원리로 .this.x / this.y 로 대입하여도 프로그램은 정상적으로 동작함.
		//또한 같은 원리로 this 생략한 채로 getX(), getY()만 갖다붙여도 프로그램은 정상적으로 동작한다.
	}
	
	//메소드는 객체에 의해 호출이 된다.
	//이 말을 풀어 써보면 print() 메소드 내부의 this는 pnt1의 경우 pnt1이 호출하여으니 pnt1 자신을,
	//pnt2의 경우 pnt2가 호출하였으니 pnt2를 가리킨다는 말이 된다.
}
