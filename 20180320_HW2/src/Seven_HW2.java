import java.util.Scanner;

public class Seven_HW2 {

	public static void main(String[] args) {
		//7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int n; //입력을 받을 변수
		int sum = 0; //합의 초기값을 0으로 정한다.
		
		System.out.println("숫자 입력.");
		Scanner input = new Scanner(System.in); //객체 선언
		n = input.nextInt(); //입력을 받는다.
		
		while(n != 0) //입력받는 숫자 n이 0이 아닐 동안
		{
			sum = sum + n; //먼저 sum이라는 변수 내에 n의 값을 계속 저장한다.
			System.out.println("숫자 입력."); //마찬가지로 문장을 한 번 더 띄움.
			n = input.nextInt();
			
		}
		
		System.out.println("입력받은 숫자의 합 : " + sum);
	}

}
