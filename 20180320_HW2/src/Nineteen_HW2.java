import java.util.Scanner;

public class Nineteen_HW2 {

	public static void main(String[] args) {
		//19. �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷�.
		int i = 1; //�ݺ��� ����� ����
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("�Ҽ��� �Ǻ��ϰ���. ���� �Է� : ");
		n = input.nextInt(); //�Է¹޴� ����.
		
		while(n<=0) //0���� ���� ���� ����.
		{
			System.out.println("���� : 0 ������ ������ ����� ���� �� ����.");
			System.out.println("�Ҽ��� �Ǻ��ϰ���. ���� �Է� : ");
			n = input.nextInt();
		}
		
		for(i=1;i<=n;i++) //1���� n(�Է¹��� ��)���� �Ҽ��� ���ϴ� �ݺ���.
		{	
			if(n%i == 0) //���� �����ϴ� ���� ������ ������ �� �¾ƶ�������
				if(i==1 || i ==n) //1�̳� �ڱ� �ڽ�(n)�� ������ ���
					if(n == 1) //1�� ����ó����.
					{
						System.out.println("1�� �Ҽ��� �ƴϴ�.");
						break;
					}
					else
						continue; //�ǳʶٰ� �ݺ����� �����Ѵ�.
				else //���� ���� i�� 1�̳� �ڱ� �ڽ��� �ƴ� ���
				{
					System.out.println("�� ���� �Ҽ��� �ƴϴ�."); //�Ҽ��� �ƴ� ���̴�.
					break;
				}
		}
		
		if(i > n) //for���� Ż���� �������� i�� n���� Ŭ ��(��, ���߿� 1�� �ڱ� �ڽ� �̿��� �μ��� �߰����� ���� ���)
			System.out.println("�� ���� �Ҽ��̴�."); //�Ҽ��� ������.
		
	}

}
