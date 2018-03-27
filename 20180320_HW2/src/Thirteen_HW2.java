import java.util.Scanner;

public class Thirteen_HW2 {

	public static void main(String[] args) {
		//13. 1월 1일 기준으로 날짜 구하기
		
		int month;
		int day;
		//달일 변수
		
		int i; //반복문 제어 변수
		int fullday = 0; //총 일 변수. 초기값이 0으로, 0이 되는 경우는 오류가 발생하여 프로그램이 강제 종료되는 경우 이외에는 없다.
		int er_count = 0; //오류 검출용 변수. 1 또는 1 이상이 되면 강제로 프로그램이 종료가 된다.
		
		Scanner input = new Scanner(System.in);
		System.out.println("월을 입력하시오.");
		month = input.nextInt();
		System.out.println("일을 입력하시오.");
		day = input.nextInt();
		

		switch(month) //월-일 검사 알고리즘. error count 변수를 사용하여 오류 발견 시 강제로 프로그램 실행을 못하게 막음.
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
		default : //월을 잘못 선택한 경우.
				er_count++;
				break;
		}
		
		for(i = 1;i<=month; i++) //1.1부터 계산
		{
			if(er_count>=1) //오류가 검출된 경우. 이 변수값이 0이면 오류가 뜨지 않아 실행이 가능하다는 뜻.
			{
				System.out.println("오류 : 월 또는 일을 잘못 설정함. 계산 불가.");
				break;
			}
			
			else
				//해당 월의 날짜수만큼 더해주기.
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
					default : //잘못된 월 선택. 사실 앞서 설계하였던 오류 검출 switch 코드의 존재로 큰 의의는 없다. 애초에 출력이 되기도 전에 차단하므로.
						System.out.println("오류 : 월을 잘못 선택했음.");
						break;
			}
	
		}
			}
			

		}
			if(er_count == 0) //정상적으로 프로그램이 종료되었을 경우.
			{
				System.out.println("1월 1일부터 현재까지의 총 일 =" + fullday);
				System.out.println("프로그램 종료.");
			}
			else
				System.out.println("오류로 인한 프로그램 비정상 종료.");
			

			
	}

}
