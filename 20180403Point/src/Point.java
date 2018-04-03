
public class Point 
{
	//���� �ʵ� ������ Class �� �տ� �����.
	//Field�� Scope(��ȿ ����)�� Class �����̴�.
	//Class �� ��� �κп��� ���� ����.
	private double x; //����ü�� �����.
	private double y; //x,y�� Field

	public double distance()
	//������ �������� �Ÿ��� ��� �޼ҵ��̱� ������ �Ű������� ���� �ʿ����.
	{
		//��ȯ�� ���� ����.
		double result; //���� ���� ��ȿ ����(�޼ҵ� ��)
		result = Math.sqrt(x*x+y*y); //���� field x,y
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
	
	//���� 2���� �ʵ��� ���� �����ϴ� ������ �޼ҵ�
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//���� 2���� �ʵ��� ���� ��ȯ�ϴ� ������ �޼ҵ�
	
	public Point move(Point p) //�Ű����� p�� ��ȿ ������ �޼ҵ� ��.
	{
		//temp variable(�ӽ� ����)
		double a; 
		double b;
		
		//����Ʈ p ��ŭ �̵�.
		a = this.x + p.x;
		b = this.y + p.y;
		//this�� ���� ����? this ���� ������ "'Field'�� �����Ͽ���"��� �����ϱ� ����.
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ.
		return pnt;
	}

}
