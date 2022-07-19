package by.epam.tr.mas1;

import java.util.Scanner;

public class mass08 {

	public static void main(String[] args) {
		/* ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем отрицательных,
		положительных и нулевых элементов.*/

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
		
		int z;
	    z=0;
	    int x;
	    x=0;
	    int y;
	    y=0;
	    
		for (int i = 0;  i < mas.length; i++) {
	      	if (mas[i]> 0) {
	      		x=x+1;
	      	}
		}
		for (int i = 0;  i < mas.length; i++) {
	      	if (mas[i]< 0) {
	      		y=y+1;
	      	}
		}
		for (int i = 0;  i < mas.length; i++) {
	      	if (mas[i]==0) {
	      		z=z+1;
	      	}
		}
		System.out.println(" <0 = "+ x);
		System.out.println(" >0 = "+ y);
		System.out.println("==0 = "+ z);

	}

}
