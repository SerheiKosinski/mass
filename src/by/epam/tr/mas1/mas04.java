package by.epam.tr.mas1;

public class mas04 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
		
		int[] mas;
		mas = new int[5];
		mas[0] = 1;
		mas[1] = 2;
		mas[2] = 3;
		mas[3] = 5;
		mas[4] = 7;
		
		int c;
		int k;
		int i;
		i = 0;
		k = 0;
		c = 0;	
			k = mas[i];
		   for ( i = 1; i < mas.length ; i++) {
			   
		       if (k < mas[i]) {
		             c=c+1;
		             k=mas[i];
		             }
		       }
		   
		   if (c == 4) {
			   System.out.println("возрастает ");
		   }
		 	   
		       }

}
