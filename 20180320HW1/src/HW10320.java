import java.util.Scanner;

public class HW10320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mmlab.uos.ac.kr ����
		//���ǹ� �ǽ� ���� 6�� ������ ��.
		//���� 2 : �ݺ��� �ǽ� ���� 3��(1,3,5��) ������ ��.
		//"Flow Chart" �ʼ������� �׷��� ��.(draw.io ����Ʈ) - WorkSpace �� �ʼ������� ������ �Ǿ�� ��.
		
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.	
		int a, b; //�񱳿� ���� 2��
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է�  : ");
		a = input.nextInt(); //Ű���忡�� ���� �Է�
		System.out.println("���� �Է� : ");
		b = input.nextInt();
		
		if(a >= b)
			System.out.println(a);
		else
			System.out.println(b);
		
		System.out.println("---���α׷� ����---");
		
		
	}

}
