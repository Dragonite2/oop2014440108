
public class DeskLamp
{
	//�ʵ� ����(UML ��ǥ�� -��� ǥ�õǾ� ������ private ������ ���� ����.)
	private boolean isOn;
	//���� boolean ������ �������� is�� �����Ͽ� �ޱ��ڰ� �빮�ڷ� ������.
	
	//UML ��ǥ�� ���� ��� �޼ҵ带 �����Ѵ�.
	//�����ڸ� ���� On ����.
	public void turnOn()
	{
		this.isOn = true;
	}
	
	//�����ڸ� ���� Off ����
	public void turnOff()
	{
		this.isOn = false;
	}
	
	//���� ���� ���
	public String toString()
	{	
		if(isOn)
			return ("���� ���´� ���� ����.");
		else
			return ("���� ���´� ���� ����.");
	}
	//��ü�� ����ϵ��� (System.out.println(Obj)) ������ ���
	//���� toString �޼ҵ尡 ȣ���.
}
