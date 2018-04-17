
public abstract class Polygon {
	//Field
	public double height;
	public double width;
	
	//Method
	public abstract double area();
	//이렇게 선언할 경우 Superclass에서 반드시 구현할 필요가 없다.
	//추상 클래스 및 추상 메소드라고 칭함.
	//추상 클래스에서는 필드와 메소드 선언만 가능하며, 이외의 기능은 불가능하다.
	//다만 이 추상 메소드를 구현 받는 클래스들은 메소드 구현을 해줘야 하며, 그렇지 않을 경우 하위 클래스들도 자동으로 추상 클래스가 된다.(객체를 사용할 수 없다.)
	
	//다음 주에 배울 JButton 클래스도 AbstractButton 클래스에서 상속을 받음.
	
}
