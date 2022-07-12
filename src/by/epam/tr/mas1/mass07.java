package by.epam.tr.mas1;

public class mass07 {

	public static void main(String[] args) {
		/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
		Подсчитать количество замен.*/
		
		
		int[] mas;
		mas = new int[5];
		mas[0] = 2;
		mas[1] = 3;
		mas[2] = 45;
		mas[3] = 1;
		mas[4] = 671;
		
		int z;
	    z=10;
	    int x;
	    x=0;
	   
	    
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
