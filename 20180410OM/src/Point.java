
public class Point 
{
	//x,y �ʵ� ����.(x, y)
	private double x;
	private double y;

	//String ��ü�� ��ȯ
	public String toString()
	{
		return ("(" + this.getX() + ", " + this.getY() + ")");
		//�Է� �������� toString(this.x)���� �����ϸ� ������ ���µ�, �� ������
		//this.x�� Reference ������ �ƴ� ����(�Ϲ�)�����̱� ������.
	}
	
	//x,y�� ���� ������(mutater), ������(accessor) �޼ҵ� ����
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
	
	//�Ÿ� ���� �޼ҵ�
	public double distance()
	//������ �������� �Ÿ��� ��� �޼ҵ��̱� ������ �Ű������� ���� �ʿ����.
	{
		return Math.sqrt(x*x+y*y); //���� field x,y
	}
	
	//���� �� ������ �Ÿ� ���� �޼ҵ�(���� : ������ �̸�.)
	//C������ ������ �Լ��� �̸��� ����Ǹ� ������ ������, Java������ �޼ҵ�� �̾߱Ⱑ �ٸ���.
	public double distance(Point p)
	{
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()));
		//�˰��� ���� : this.x()(������ - 'ȣ���� ��ü'�� ������) - p.getX()(������ - '�Ű����� ��ü'�� ������)
	}
	
	
	
	//��ǥ ��� �޼ҵ�
	public void print()
	//Ŭ���� �ܺο����� ȣ���� �����ؾ� �ϱ� ������ public���� ����.
	//��ȯ���� �����Ƿ� �ڷ����� void.
	//�޼ҵ� �̸��� print, �Ű����� ����.
	{
		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
		//1�� �õ��� this.getX(), this.getY() ���� �ʰ� �ʵ� x,y�� ����Ͽ��� ���� ����� ���Դ�.
		//����, this(�� Ŭ����, �� ��ü) . �޼ҵ�() �������� '�� ��ü�� �޼ҵ� �ҷ����̱�'�� ���� �ȴ�.
		//���� ������ .this.x / this.y �� �����Ͽ��� ���α׷��� ���������� ������.
		//���� ���� ������ this ������ ä�� getX(), getY()�� ���ٺٿ��� ���α׷��� ���������� �����Ѵ�.
	}
	
	//�޼ҵ�� ��ü�� ���� ȣ���� �ȴ�.
	//�� ���� Ǯ�� �Ẹ�� print() �޼ҵ� ������ this�� pnt1�� ��� pnt1�� ȣ���Ͽ����� pnt1 �ڽ���,
	//pnt2�� ��� pnt2�� ȣ���Ͽ����� pnt2�� ����Ų�ٴ� ���� �ȴ�.
}
