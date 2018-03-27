import java.util.Scanner;

public class TwentyOne_HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21. 자신 이하의 소수의 합을 구함.
		int num; //입력받을 수
		int sum = 0; //합
		Scanner input = new Scanner(System.in);
		System.out.println("특정 수를 입력하시오.");
		num = input.nextInt();
		
		int i = 2; // i : 나눌 대상
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
		
		System.out.println("숫자 이하 소수들의 합  : " + sum);

	}

}
