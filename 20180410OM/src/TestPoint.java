
public class TestPoint 
{

	public static void main(String[] args) 
	{
		//Reference ���� ����.
		Point pnt1 = new Point();
		
		//������ �޼ҵ带 �ҷ�����.
		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		//Reference ���� ����.
		Point pnt2 = new Point();
		
		//������ �޼ҵ带 �ҷ�����.
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		
		//pnt.print() �� �޼ҵ�� ȣ���Ͽ� ����ϵ��� �����ϱ�?
		//Point.java Ŭ���� ���ο� �ּ��� �Բ� ������ ����� �����Ͽ���.
		//pnt1.print();
		//pnt2.print();
		
		//�޼ҵ�� ��ü�� ���� ȣ���� �ȴ�.
		//�� ���� Ǯ�� �Ẹ�� print() �޼ҵ� ������ this�� pnt1�� ��� pnt1�� ȣ���Ͽ����� pnt1 �ڽ���,
		//pnt2�� ��� pnt2�� ȣ���Ͽ����� pnt2�� ����Ų�ٴ� ���� �ȴ�.		
		
		/*
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1);
		
		toString �޼ҵ� �������� print ������ ����� ��, String ������ �������� �ڵ����� String���� ��ȯ�ϴ� ������ ��ģ��.
		�ڼ��� �۵��ϴ� ������ ���� ��� ���� ������ ���� �� ������ �� �ִ�.
		�� ���� �̷��� Java�� C�� ���� ���ް� ������ �ſ� �����ϴٴ� ���� �� �� �ִ�.
		*/
		
		System.out.println(pnt2);
		System.out.println(pnt2.distance()); //������������ P2������ �Ÿ� ���
		System.out.println(pnt2.distance(pnt1));
		//������ �޼ҵ� �̸�������, Java������ �Ű� ������ ��ġ���� ������ �ٸ� �޼ҵ�� ����ϸ� �� Ư¡�� �̿��� ���� �̸��� �޼ҵ带 ���� ������ �� �ִ�. 
		//�̸� Method Overloading �Ǵ� Overloading Method��� Ī��.(�ߺ� �޼ҵ�)

		
		//System.out.println("("+ pnt.getX() + "," + pnt.getY() + ")");
	}

}
