package by.epam.tr.mas1;

import java.util.Random;
import java.util.Scanner;

public class mass07 {

	public static void main(String[] args) {
		/*���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, ������� ������� Z, ���� ������.
		���������� ���������� �����.*/
		
		
		Scanner sc = new Scanner(System.in);
		   System.out.print("������� ���������� ��������� �������");
		   
		int n = sc.nextInt();
		int mas[] = new int[n];
		

		Random rand = new Random();

		   
		      for (int i = 0; i < mas.length; i++) {
			    mas[i] = rand.nextInt(200);
			    System.out.println(mas[i]);
		      }
		      ///////////////////////////////////////////////////////////
		int z=156;
	    int x=0;
	    
		for (int i = 0;  i < mas.length; i++) {
	      	if (mas[i]> z) {
	      		
			mas[i]=z;
			System.out.println("mas["+i+"] "+ mas[i]);
			x=x+1;
			
		}else {
			System.out.println("mas["+i+"] "+ mas[i]);
		}
	}
		System.out.println("x = "+ x);

	}

}
