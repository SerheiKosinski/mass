package by.epam.tr.mas1;

import java.util.Scanner;

public class mass06 {

	public static void main(String[] args) {
		// ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� ����� �������� ���, ���������� ��� ��� �����.
		int n = 8;
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
	    int y;
	    x = mas[0];
	    y = mas[0];
	    
		for (int i = 0;  i < mas.length; i++) {
	      	if (x > mas[i]) {
			
			x=mas[i];
			
		}
	}
		
		for (int i = 0;  i < mas.length; i++) {
	      	if (y < mas[i]) {
			
			y=mas[i];
			
		}
	}
		System.out.println(y-x);
	}

}
