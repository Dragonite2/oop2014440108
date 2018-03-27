import java.util.Scanner;

public class Eleven_HW2 {

	public static void main(String[] args) {
		//11. 0을 입력하기 전까지 해당 수의 인수를 출력하는 프로그램.
		
		int n; //입력을 받을 변수
		int i=1; //1부터 n까지.
		System.out.println("숫자 입력.(프로그램 종료를 원할 경우 0을 입력바람.)");
		Scanner input = new Scanner(System.in); //객체 선언
		n = input.nextInt(); //입력을 받는다.
		
		while(n != 0) //입력받는 숫자 n이 0이 아닐 동안
		{		
			if(n<0) //한번 음수를 검사하여 다시 입력을 받도록 유도함.
			{
				System.out.println("오류 : 음수 계산 불가.");
				System.out.println("숫자 입력.");
				n = input.nextInt();
				continue;
			}
			
			System.out.print("인수들의 모음 : ");
			for(i=1;i<=n;i++) //인수 출력 알고리즘에 의해 인수를 뱉는다.
			{
				if(n%i == 0)
					/*
					if(i == 1 || i == n)
						continue;
					else
					*/ 
					//만약 자기 자신이나 1을 제외해야 한다면 다음과 같은 코드를 삽입하면 된다.(이렇게 되면 소수는 출력이 안됨.)
					System.out.print(i + " ");
			
				if(i == n)
					System.out.println(""); //공백 한번 주기 위함.
			}
		
			System.out.println("숫자 입력."); //마찬가지로 문장을 한 번 더 띄움.
			n = input.nextInt();

		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
