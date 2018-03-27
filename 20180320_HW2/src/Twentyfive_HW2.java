
public class Twentyfive_HW2 {

	public static void main(String[] args) {
		//25. 피라미드 및 역피라미드 (1) / (2)
		
		int i,j;
	     for(i=11;i>=1;i=i-2)
	     {
	      for(j=1;j<=i;j++)
	      {
	       System.out.print("*");                 
	      }
	      System.out.println("");
	     }
	     
	     for(i=3;i<=11;i=i+2)
	     {
	       for(j=1;j<=i;j++)
	       {
	       System.out.print("*");
	       }
	       System.out.println("");
	     }
	     
	     for(i = 5; i > 0; i--)
	     {
	     
	              // 앞에 빈공간 맞춤  
	     
	              // 54321 형태출력 
	              for(j = 0; j <= i; j++) 
	            	  System.out.print(0 + i-j);    
	     
	              // 12345 형태 출력      
	              for(j = 1; j <= i; j++) 
	            	  System.out.print(0 + j); 
	     
	             // 줄바꿈
	            System.out.println("");                                          
	     }
	     
	     for(i = 0; i < 6; i++)
	     {
	     
	              // 앞에 빈공간 맞춤  
	     
	              // 54321 형태출력 
	              for(j = 0; j <= i; j++) 
	            	  System.out.print(0 + i-j);    
	     
	              // 12345 형태 출력      
	              for(j = 1; j <= i; j++) 
	            	  System.out.print(0 + j); 
	     
	             // 줄바꿈
	            System.out.println("");                                          
	     }
	}

		
}
