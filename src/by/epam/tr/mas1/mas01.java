package by.epam.tr.mas1;

public class mas01 {

	public static void main(String[] args) {
		//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
		int[] mas;
		mas = new int[5];
		mas[0] = 4;
		mas[1] = 5;
		mas[2] = 45;
		mas[3] = 5;
		mas[4] = 678;
		
		int a;
		int k;
		
		a=0;
		k=5;
		
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i]%k==0) {
				a=mas[i]+a;
			}
		}
		System.out.println("sum = " + a);
		
		System.out.println(mas[0]);
		System.out.println(mas[1]);
		System.out.println(mas[2]);
		System.out.println(mas[3]);
		System.out.println(mas[4]);

		
	}

}
