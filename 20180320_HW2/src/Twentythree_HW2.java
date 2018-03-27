
public class Twentythree_HW2 {

	public static void main(String[] args) {
		// 23. 별모양 프로그램
		
		int i,j;


		//1 - 3 - 5
		//(5)-(3)-(1)
		for(i=0;i<6;i+=2)
		{
			for(j=0;j<5-i;j++)
			{
				System.out.print("*");
			}
			//i = 5 - 3 - 1 - -1(빠져나옴)
			//k = 6-i = 1 - 3 - 5
			
			System.out.print(" ");
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}		
		



	}

}
