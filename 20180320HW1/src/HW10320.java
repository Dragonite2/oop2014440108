import java.util.Scanner;

public class HW10320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mmlab.uos.ac.kr 참조
		//조건문 실습 예제 6개 구현할 것.
		//숙제 2 : 반복문 실습 예제 3개(1,3,5번) 구현할 것.
		//"Flow Chart" 필수적으로 그려야 함.(draw.io 사이트) - WorkSpace 내 필수적으로 포함이 되어야 함.
		
		//1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.	
		int a, b; //비교용 정수 2개
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력  : ");
		a = input.nextInt(); //키보드에서 숫자 입력
		System.out.println("정수 입력 : ");
		b = input.nextInt();
		
		if(a >= b)
			System.out.println(a);
		else
			System.out.println(b);
		
		System.out.println("---프로그램 종료---");
		
		
	}

}
