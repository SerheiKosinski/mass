package by.epam.tr.mas1;

public class mas05 {

	public static void main(String[] args) {
		// ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ �� ������ ����� ���� ������������������.
		//���� ����� ����� ���, �� ������� ��������� �� ���� �����.
		int[] mas;
		mas = new int[5];
		mas[0] = 1;
		mas[1] = 1;
		mas[2] = 45;
		mas[3] = 1;
		mas[4] = 671;
		
		
	    int x;
	    x=0;
	   
	    
		for (int i = 0;  i < mas.length; i++) {
	      	if (mas[i] %2 == 0) {
			
			x=x+1;
			
		}
	}
		int[] s = new int[x];
		
		     for (int i = 0, j = 0; i < mas.length; i++) {
		        if (mas[i] %2 == 0) {
		               s[j++] = mas[i];
		               }                
	           }
		     for (int i = 0; i < mas.length; i++) {
		            System.out.printf("[%d]", mas[i]);
		            }
		     
		            System.out.println();
		       for (int i = 0; i < s.length; i++) {
		    	   if (x!=0 ) {
		         System.out.printf("{%d}", s[i]);
		    	   }
		       }
		    	   if(x==0){
		  System.out.println("no");
		    	   }
	
	}
}
