package by.epam.tr.mas1;

public class mass06 {

	public static void main(String[] args) {
		// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
		int[] mas;
		mas = new int[5];
		mas[0] = 22;
		mas[1] = 33;
		mas[2] = 45;
		mas[3] = 45;
		mas[4] = 10;
		
		
	    int x;
	    x = 0;
	    int y;
	    y = 0;
	    x = mas[0];
	    y = mas[0];
	    
		for (int i = 0;  i < mas.length; i++) {
	      	if (x > mas[i]) {
			
			x=mas[i];
			
		}
	}
		
		for (int i = 0;  i < mas.length; i++) {
	      	if (x < mas[i]) {
			
			y=mas[i];
			
		}
	}
		System.out.println(y-x);
	}

}
