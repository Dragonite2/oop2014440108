import java.util.Scanner;

public class Fifteen_HW2 {

	public static void main(String[] args) {
		//15.15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
		int randnum = (int)(Math.random() * 100) + 1;//������ ������ ��. 1~100������ ������ ���� �����Ѵ�.
		int count = 1; //10�� �Ѿ�� �й��ϴ� �÷��׸� ����� ���� ����
		int user; //����ڰ� �Է��ϴ� ����
		
		System.out.println("1���� 100���� ������ ���ڰ� ������, 10���� ��ȸ ���� �������� ����!");
		Scanner input = new Scanner(System.in); //��ü ����
		
		while(count<=10)
		{
			user = input.nextInt(); //10���� ��ȸ ���� �Է��� �޴´�.
			if(user > 100 || user < 0)
			{
				//üũ�Ͽ�, 2�ڸ� ���� �ƴ� ���� �� ���ڸ� �Է� ��.
				System.out.println("��ȿ���� ���� ����.");
				continue; //���������� �������� �ʰ� �ʱ�ȭ��.
			}
			
			if(user == randnum) //���� �ݺ����� ��ȸ �� ���� �¾Ҵٸ�
				break; //�ݺ����� �ٷ� Ż���Ѵ�.
			
			else //Ʋ�ȴٸ�
			{
				//�޽����� �Բ� ��Ʈ�� �ش�.
			System.out.println(count + "ȸ Ʋ���̽��ϴ�.");
			if(user < randnum)
				System.out.println("Hint : �Է��� ���ں��� Ů�ϴ�.");
			else
				System.out.println("Hint : �Է��� ���ں��� �۽��ϴ�.");
			}
			
			count++; //����ġ�� 1 �ø���.
		}
		
		//���ĺ��� ���� ���� count�� ���� ��� �¾Ҵ��� Ʋ�ȴ��� üũ�ϱ� ���� �ڵ��̴�.
		if(count != 11)
			if(count == 1) //�� �� ���� ���� ���, ���� �޽����� ���� ����.
				System.out.println("�����մϴ�! 1%�� Ȯ���� �հ� �����̱���.");
			else //�װ� �ƴ� ���(�������� ���)
				System.out.println("�����մϴ�! ����� 10���� ��ȸ �� ��� �����̽��ϴ�.");
		else //�ݺ����� Ż���� �������� count�� 11�� ��.(��, 10���� ��ȸ�� �� ���� �������� ��.)
			System.out.println("��! ����� ��Ÿ���Ե� ��� �����ϼ̽��ϴ�.");
		
	}

}
