import java.util.Scanner;

public class Thirteen_HW2 {

	public static void main(String[] args) {
		//13. 1�� 1�� �������� ��¥ ���ϱ�
		
		int month;
		int day;
		//���� ����
		
		int i; //�ݺ��� ���� ����
		int fullday = 0; //�� �� ����. �ʱⰪ�� 0����, 0�� �Ǵ� ���� ������ �߻��Ͽ� ���α׷��� ���� ����Ǵ� ��� �̿ܿ��� ����.
		int er_count = 0; //���� ����� ����. 1 �Ǵ� 1 �̻��� �Ǹ� ������ ���α׷��� ���ᰡ �ȴ�.
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�.");
		month = input.nextInt();
		System.out.println("���� �Է��Ͻÿ�.");
		day = input.nextInt();
		

		switch(month) //��-�� �˻� �˰���. error count ������ ����Ͽ� ���� �߰� �� ������ ���α׷� ������ ���ϰ� ����.
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day<1 || day>31)
				er_count++;
				break;
		case 2:
			if(day<1 || day>28)
				er_count++;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day<1 || day>30)
				er_count++;
				break;
		default : //���� �߸� ������ ���.
				er_count++;
				break;
		}
		
		for(i = 1;i<=month; i++) //1.1���� ���
		{
			if(er_count>=1) //������ ����� ���. �� �������� 0�̸� ������ ���� �ʾ� ������ �����ϴٴ� ��.
			{
				System.out.println("���� : �� �Ǵ� ���� �߸� ������. ��� �Ұ�.");
				break;
			}
			
			else
				//�ش� ���� ��¥����ŭ �����ֱ�.
			{
				if(i == month)
				{
					fullday = fullday + day;
					break;
				}
			
				else
				{
					switch(i)
					{
					case 2:
						fullday = fullday + 28;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						fullday = fullday + 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						fullday = fullday + 30;
						break;
					default : //�߸��� �� ����. ��� �ռ� �����Ͽ��� ���� ���� switch �ڵ��� ����� ū ���Ǵ� ����. ���ʿ� ����� �Ǳ⵵ ���� �����ϹǷ�.
						System.out.println("���� : ���� �߸� ��������.");
						break;
			}
	
		}
			}
			

		}
			if(er_count == 0) //���������� ���α׷��� ����Ǿ��� ���.
			{
				System.out.println("1�� 1�Ϻ��� ��������� �� �� =" + fullday);
				System.out.println("���α׷� ����.");
			}
			else
				System.out.println("������ ���� ���α׷� ������ ����.");
			

			
	}

}
