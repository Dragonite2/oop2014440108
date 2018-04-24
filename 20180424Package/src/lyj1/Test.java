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
		//tina.privateField = "STing"; 당연히 접근 불가. 클래스 내부에서만 접근 가능한 private의 성질.
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
	}
}
