
public class Test {
	public static void main(String[] args) 
	{
		
		Point p;
		p = new Point(); 
		//Point ��ü ����, Reference p�� ����.
		
		double temp = 1.0;
		
		p.setX(temp);
		System.out.println("temp=" + temp);
		
		p.setY(temp);
		//��������� C����� ����ü ������ ���� �����.
		//'��ü�� �ʵ� ����'.

		
		System.out.println(p.getX());
		System.out.println(p.getY());
		//������ �޼ҵ带 ȣ���Ͽ� x,y �ʵ尪�� ��ȯ��.		

		

		System.out.println(p.distance());
		//distance �Ÿ� �޼ҵ带 ȣ���Ͽ� �Ÿ� ��갪�� ��ȯ��.
	}

}
