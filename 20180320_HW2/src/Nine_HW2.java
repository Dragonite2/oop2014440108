import java.util.Scanner;

public class Nine_HW2 {

	public static void main(String[] args) {
		//9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.
		//요약하면 1~9의 범위 내 특정 수의 구구단을 출력하는 프로그램이다.
		int n; //입력을 받을 변수
		int i = 1; //루프 제어용 변수
		System.out.println("출력할 구구단의 단 수는?(1~9)");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		while(n<1 || n>9) //유효 범위 벗어난 숫자를 입력할 경우 재출력을 유도.
		{
			System.out.println("오류 : 범위를 벗어난 숫자.");
			System.out.println("출력할 구구단의 단 수는?(1~9)");
			n = input.nextInt();
		}
		
		for(i=1;i<10;i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}
		
	}

}
