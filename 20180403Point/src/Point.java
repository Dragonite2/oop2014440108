
public class Point 
{
	//보통 필드 선언은 Class 맨 앞에 사용함.
	//Field의 Scope(유효 범위)는 Class 내부이다.
	//Class 내 모든 부분에서 접근 가능.
	private double x; //구조체와 비슷함.
	private double y; //x,y는 Field

	public double distance()
	//원점을 기준으로 거리를 재는 메소드이기 때문에 매개변수가 따로 필요없다.
	{
		//반환할 변수 선언.
		double result; //지역 변수 유효 범위(메소드 내)
		result = Math.sqrt(x*x+y*y); //위의 field x,y
		return result;
	}
	
	public void setX(double xx)
	{
		this.x = xx;
		xx = 100.0;
	}
	
	public void setY(double yy)
	{
		this.y = yy;
	}
	
	//위의 2개는 필드의 값을 설정하는 설정자 메소드
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//위의 2개는 필드의 값을 반환하는 접근자 메소드
	
	public Point move(Point p) //매개변수 p의 유효 범위는 메소드 내.
	{
		//temp variable(임시 변수)
		double a; 
		double b;
		
		//포인트 p 만큼 이동.
		a = this.x + p.x;
		b = this.y + p.y;
		//this를 적는 이유? this 뒤의 변수를 "'Field'로 정의하였다"라고 강조하기 위함.
		
		//새로운 포인트 생성
		Point pnt = new Point();
		
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환.
		return pnt;
	}

}
