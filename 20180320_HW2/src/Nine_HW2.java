import java.util.Scanner;

public class Nine_HW2 {

	public static void main(String[] args) {
		//9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.
		//����ϸ� 1~9�� ���� �� Ư�� ���� �������� ����ϴ� ���α׷��̴�.
		int n; //�Է��� ���� ����
		int i = 1; //���� ����� ����
		System.out.println("����� �������� �� ����?(1~9)");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		while(n<1 || n>9) //��ȿ ���� ��� ���ڸ� �Է��� ��� ������� ����.
		{
			System.out.println("���� : ������ ��� ����.");
			System.out.println("����� �������� �� ����?(1~9)");
			n = input.nextInt();
		}
		
		for(i=1;i<10;i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}
		
	}

}
