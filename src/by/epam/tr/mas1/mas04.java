package by.epam.tr.mas1;

import java.util.Random;

public class mas04 {

	public static void main(String[] args) {
		// ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� �� ��� ������������.
		
		int n = 10;
		int [] mas = new int[n];
		  Random rand = new Random();
		   for (int i = 0; i < mas.length; i++) {
			   mas[i] = rand.nextInt(100);
		 }
		   
		System.out.print("�������� ������:\t\t ");
		   for (int i = 0; i < mas.length; i++) {
		System.out.printf("%4d ", mas[i]);
		
		  }
		
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
		   
		   if (c == n) {
			   System.out.println("���������� ");
		   }else {
			   System.out.println("�� ���������� ");
		  
		   }
		 	   
		       }

}
