import java.util.Scanner;

public class Three_HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		
		int a, b, c; //비교용 정수 3개
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력  : ");
		a = input.nextInt(); //키보드에서 숫자 입력
		System.out.println("정수 입력 : ");
		b = input.nextInt(); //키보드에서 숫자 입력
		System.out.println("정수 입력 : ");
		c = input.nextInt(); //키보드에서 숫자 입력
		
		if(a>=b) //조건문 1.
			if(a>=c) //조건문 2
				System.out.println(a);
			else
				System.out.println(c);
		else
			if(b>=c) //조건문 3
				System.out.println(b);
			else
				System.out.println(c);
		
		System.out.println("---프로그램 종료---");
	}

}
