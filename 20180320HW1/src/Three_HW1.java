import java.util.Scanner;

public class Three_HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int a, b, c; //�񱳿� ���� 3��
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է�  : ");
		a = input.nextInt(); //Ű���忡�� ���� �Է�
		System.out.println("���� �Է� : ");
		b = input.nextInt(); //Ű���忡�� ���� �Է�
		System.out.println("���� �Է� : ");
		c = input.nextInt(); //Ű���忡�� ���� �Է�
		
		if(a>=b) //���ǹ� 1.
			if(a>=c) //���ǹ� 2
				System.out.println(a);
			else
				System.out.println(c);
		else
			if(b>=c) //���ǹ� 3
				System.out.println(b);
			else
				System.out.println(c);
		
		System.out.println("---���α׷� ����---");
	}

}
