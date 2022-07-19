package by.epam.tr.mas1;

import java.util.Scanner;

public class mas05 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
		//Если таких чисел нет, то вывести сообщение об этом факте.
		int n = 10;
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
