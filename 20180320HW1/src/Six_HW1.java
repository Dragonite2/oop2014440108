import java.util.Scanner;

public class Six_HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		
		int num, rev; //일반 입력 : num, 반전된 수 : rev(reversed)
		System.out.println("2자리 숫자를 입력하시오.");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		

		
		if(num >= 100 || num < 10) //2자리 숫자가 아닌 경우
			System.out.println("오류 : 2자리 수가 아님.");
		else
		{
			rev = (num/10) + 10*(num%10);
			System.out.println("반전된 숫자 : " + rev);
		}
		
		System.out.println("---프로그램 종료---");
	}

}
