import java.util.Scanner;

public class TwentyOne_HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21. �ڽ� ������ �Ҽ��� ���� ����.
		int num; //�Է¹��� ��
		int sum = 0; //��
		Scanner input = new Scanner(System.in);
		System.out.println("Ư�� ���� �Է��Ͻÿ�.");
		num = input.nextInt();
		
		int i = 2; // i : ���� ���
		boolean isPrime = true;

			

		while (i <= num) {
			isPrime = true;

			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
				}

				continue;
			}

			

			if (isPrime == true)
				sum = sum + i;
				i++;
			
		}
		
		System.out.println("���� ���� �Ҽ����� ��  : " + sum);

	}

}
