
public class Five_HW2 {

	public static void main(String[] args) {
		//		5. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)
		int i; //���� ���� ����
		i = 1;
		int sum = 0;

		
		do
		{
			if(i%3==0)
				sum = sum + i;
			
			i++;
		} while(i<100);
		
		System.out.println(sum);
	}

}
