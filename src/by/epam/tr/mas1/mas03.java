package by.epam.tr.mas1;

import java.util.Scanner;

public class mas03 {

	public static void main(String[] args) {
		// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
		//отрицательное
		
		
		int n = 4;
		int[] mas = new int[n];
		
		Scanner sc = new Scanner(System.in);
		
		   for (int i = 0; i < mas.length; i++) {
		    System.out.print("mas[" + i + "]=");
		      while (!sc.hasNextInt()) {
		        sc.nextLine();
		        System.out.print("mas[" + i + "]=");
		  }
		      
		mas[i] = sc.nextInt();
		
		}
		
	       
				      if (mas[0] > 0) {
				    	  System.out.println("раьше положительное");
				      } else {
				    	  System.out.println("раньше отрицательное");
				      }
				   
	}

}
