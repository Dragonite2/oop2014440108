import java.util.Scanner;

public class Eleven_HW2 {

	public static void main(String[] args) {
		//11. 0�� �Է��ϱ� ������ �ش� ���� �μ��� ����ϴ� ���α׷�.
		
		int n; //�Է��� ���� ����
		int i=1; //1���� n����.
		System.out.println("���� �Է�.(���α׷� ���Ḧ ���� ��� 0�� �Է¹ٶ�.)");
		Scanner input = new Scanner(System.in); //��ü ����
		n = input.nextInt(); //�Է��� �޴´�.
		
		while(n != 0) //�Է¹޴� ���� n�� 0�� �ƴ� ����
		{		
			if(n<0) //�ѹ� ������ �˻��Ͽ� �ٽ� �Է��� �޵��� ������.
			{
				System.out.println("���� : ���� ��� �Ұ�.");
				System.out.println("���� �Է�.");
				n = input.nextInt();
				continue;
			}
			
			System.out.print("�μ����� ���� : ");
			for(i=1;i<=n;i++) //�μ� ��� �˰��� ���� �μ��� ��´�.
			{
				if(n%i == 0)
					/*
					if(i == 1 || i == n)
						continue;
					else
					*/ 
					//���� �ڱ� �ڽ��̳� 1�� �����ؾ� �Ѵٸ� ������ ���� �ڵ带 �����ϸ� �ȴ�.(�̷��� �Ǹ� �Ҽ��� ����� �ȵ�.)
					System.out.print(i + " ");
			
				if(i == n)
					System.out.println(""); //���� �ѹ� �ֱ� ����.
			}
		
			System.out.println("���� �Է�."); //���������� ������ �� �� �� ���.
			n = input.nextInt();

		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
