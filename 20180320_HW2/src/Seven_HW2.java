import java.util.Scanner;

public class Seven_HW2 {

	public static void main(String[] args) {
		//7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int n; //�Է��� ���� ����
		int sum = 0; //���� �ʱⰪ�� 0���� ���Ѵ�.
		
		System.out.println("���� �Է�.");
		Scanner input = new Scanner(System.in); //��ü ����
		n = input.nextInt(); //�Է��� �޴´�.
		
		while(n != 0) //�Է¹޴� ���� n�� 0�� �ƴ� ����
		{
			sum = sum + n; //���� sum�̶�� ���� ���� n�� ���� ��� �����Ѵ�.
			System.out.println("���� �Է�."); //���������� ������ �� �� �� ���.
			n = input.nextInt();
			
		}
		
		System.out.println("�Է¹��� ������ �� : " + sum);
	}

}
