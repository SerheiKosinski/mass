package by.epam.tr.mas1;

import java.util.Random;

public class mas01 {

	public static void main(String[] args) {
		//  � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
		
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
		
		int a;
		int k;
		
		a=0;
		k=5;
		
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i]%k==0) {
				a=mas[i]+a;
			}
		}
		System.out.println();
		System.out.println("sum = " + a);
		
			
	}

}
