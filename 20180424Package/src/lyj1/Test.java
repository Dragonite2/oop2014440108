package lyj1;

public class Test {
	public static void main(String args[])
	{
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		//tina.IDN = "30942394"; Error : IDN is a private field
		tina.nickName = "tt";
		tina.publicField = "U2";
		//tina.privateField = "STing"; �翬�� ���� �Ұ�. Ŭ���� ���ο����� ���� ������ private�� ����.
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
	}
}
