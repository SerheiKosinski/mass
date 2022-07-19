package by.epam.tr.mas1;

import java.util.Random;
import java.util.Scanner;

public class mass09 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
		Scanner sc = new Scanner(System.in);
		   System.out.print("Введите количество элементов массива");
		   
		int n = sc.nextInt();
		int mas[] = new int[n];
		

		Random rand = new Random();

		   
		      for (int i = 0; i < mas.length; i++) {
			    mas[i] = rand.nextInt(200);
			    System.out.println("mas["+i+"] "+mas[i]);
		      }
		
		int q;
		int w;
		int k;
		int x;
		int y;
		
		q = 0;
	    w = 0;
	    x = mas[0];
	    y = mas[0];
	    
	    /////////////////////
		for (int i = 0;  i < mas.length; i++) {
	      	if (x < mas[i]) {
			x=mas[i];
			q=i;
			
		}
	}
		///////////////////////
		for (int i = 0;  i < mas.length; i++) {
	      	if (y > mas[i]) {
			y=mas[i];
			w=i;
			
		}
	}
		
		
		System.out.println("Результат");
		////////////////////////
		k=mas[q];
		mas[q]=mas[w];
		mas[w]=k;
		
		////////////////////////////////
		for (int i = 0;  i < mas.length; i++) {
			System.out.println("mas["+i+"] "+ mas[i]);
	}
		
		}

}
