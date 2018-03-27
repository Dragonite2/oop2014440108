import java.util.Scanner;

public class Nineteen_HW2 {

	public static void main(String[] args) {
		//19. 소수인지 아닌지 판별하는 프로그램.
		int i = 1; //반복문 제어용 변수
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("소수를 판별하겠음. 숫자 입력 : ");
		n = input.nextInt(); //입력받는 숫자.
		
		while(n<=0) //0보다 작은 숫자 무시.
		{
			System.out.println("오류 : 0 이하의 정수는 약수를 구할 수 없음.");
			System.out.println("소수를 판별하겠음. 숫자 입력 : ");
			n = input.nextInt();
		}
		
		for(i=1;i<=n;i++) //1부터 n(입력받은 수)까지 소수를 구하는 반복문.
		{	
			if(n%i == 0) //만약 증가하는 루프 변수로 나눴을 때 맞아떨어지면
				if(i==1 || i ==n) //1이나 자기 자신(n)의 숫자인 경우
					if(n == 1) //1을 예외처리함.
					{
						System.out.println("1은 소수가 아니다.");
						break;
					}
					else
						continue; //건너뛰고 반복문을 실행한다.
				else //만약 나눈 i가 1이나 자기 자신이 아닌 경우
				{
					System.out.println("이 수는 소수가 아니다."); //소수가 아닌 것이다.
					break;
				}
		}
		
		if(i > n) //for문을 탈출한 기점으로 i가 n보다 클 때(즉, 도중에 1과 자기 자신 이외의 인수를 발견하지 않은 경우)
			System.out.println("이 수는 소수이다."); //소수로 판정함.
		
	}

}
