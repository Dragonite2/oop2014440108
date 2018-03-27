import java.util.Scanner;

public class Fifteen_HW2 {

	public static void main(String[] args) {
		//15.15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		int randnum = (int)(Math.random() * 100) + 1;//임의의 무작위 수. 1~100까지의 범위의 수를 생성한다.
		int count = 1; //10번 넘어가면 패배하는 플래그를 세우기 위한 변수
		int user; //사용자가 입력하는 숫자
		
		System.out.println("1부터 100까지 랜덤한 숫자가 나오면, 10번의 기회 내에 맞혀보는 게임!");
		Scanner input = new Scanner(System.in); //객체 생성
		
		while(count<=10)
		{
			user = input.nextInt(); //10번의 기회 동안 입력을 받는다.
			if(user > 100 || user < 0)
			{
				//체크하여, 2자리 수가 아닌 범위 외 숫자를 입력 시.
				System.out.println("유효하지 않은 범위.");
				continue; //정상적으로 집계하지 않고 초기화함.
			}
			
			if(user == randnum) //만약 반복문의 기회 내 답이 맞았다면
				break; //반복문을 바로 탈출한다.
			
			else //틀렸다면
			{
				//메시지와 함께 힌트를 준다.
			System.out.println(count + "회 틀리셨습니다.");
			if(user < randnum)
				System.out.println("Hint : 입력한 숫자보다 큽니다.");
			else
				System.out.println("Hint : 입력한 숫자보다 작습니다.");
			}
			
			count++; //집계치에 1 올린다.
		}
		
		//이후부터 집계 변수 count를 통해 퀴즈가 맞았는지 틀렸는지 체크하기 위한 코드이다.
		if(count != 11)
			if(count == 1) //단 한 번에 맞힌 경우, 축하 메시지를 따로 보냄.
				System.out.println("축하합니다! 1%의 확률을 뚫고 맞히셨군요.");
			else //그게 아닌 경우(정상적인 경우)
				System.out.println("축하합니다! 당신은 10번의 기회 중 퀴즈를 맞히셨습니다.");
		else //반복문을 탈출한 기점으로 count가 11일 때.(즉, 10번의 기회를 다 쓰고도 실패했을 때.)
			System.out.println("꽝! 당신은 안타깝게도 퀴즈에 실패하셨습니다.");
		
	}

}
