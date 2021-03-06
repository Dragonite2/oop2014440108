import java.util.Scanner;

public class Five_HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		
		System.out.println("choose one of the following.");
		System.out.println("1. apple");
		System.out.println("2. orange");
		System.out.println("3. banana");
		System.out.println("4. peach");
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		/*
		기존의 방식으로 조건문 구현 시.
		switch(s)
		{
			case "apple":
				System.out.println("you chose an apple.");
				break;
			case "orange":
				System.out.println("you chose an orange.");
				break;
			case "banana":
				System.out.println("you choose a banana.");
				break;
			case "peach":
				System.out.println("you chose a peach.");
				break;
			default:
				System.out.println("error : invalid value.(유효하지 않은 선택입니다.)");
		
		}
		*/
		
		//대소문자 구분 없이 구현 시.
		if(s.equalsIgnoreCase("apple"))
			System.out.println("you chose an apple.");
		else if(s.equalsIgnoreCase("orange"))
			System.out.println("you chose an orange.");
		else if(s.equalsIgnoreCase("banana"))
			System.out.println("you chose a banana");		
		else if(s.equalsIgnoreCase("peach"))
			System.out.println("you chose a peach.");
		else
			System.out.println("Error : invalid value.(유효하지 않은 선택입니다.)");
		
		System.out.println("---프로그램 종료---");
	
	}

}
