
public class Twentyfive_HW2 {

	public static void main(String[] args) {
		//25. �Ƕ�̵� �� ���Ƕ�̵� (1) / (2)
		
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
	     
	              // �տ� ����� ����  
	     
	              // 54321 ������� 
	              for(j = 0; j <= i; j++) 
	            	  System.out.print(0 + i-j);    
	     
	              // 12345 ���� ���      
	              for(j = 1; j <= i; j++) 
	            	  System.out.print(0 + j); 
	     
	             // �ٹٲ�
	            System.out.println("");                                          
	     }
	     
	     for(i = 0; i < 6; i++)
	     {
	     
	              // �տ� ����� ����  
	     
	              // 54321 ������� 
	              for(j = 0; j <= i; j++) 
	            	  System.out.print(0 + i-j);    
	     
	              // 12345 ���� ���      
	              for(j = 1; j <= i; j++) 
	            	  System.out.print(0 + j); 
	     
	             // �ٹٲ�
	            System.out.println("");                                          
	     }
	}

		
}
