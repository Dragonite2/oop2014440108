import java.util.Scanner;

public class Six_HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int num, rev; //�Ϲ� �Է� : num, ������ �� : rev(reversed)
		System.out.println("2�ڸ� ���ڸ� �Է��Ͻÿ�.");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		

		
		if(num >= 100 || num < 10) //2�ڸ� ���ڰ� �ƴ� ���
			System.out.println("���� : 2�ڸ� ���� �ƴ�.");
		else
		{
			rev = (num/10) + 10*(num%10);
			System.out.println("������ ���� : " + rev);
		}
		
		System.out.println("---���α׷� ����---");
	}

}
