package by.epam.tr.mas1;

public class mass08 {

	public static void main(String[] args) {
		/* ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем отрицательных,
		положительных и нулевых элементов.*/
		int[] mas;
		mas = new int[5];
		mas[0] = 2;
		mas[1] = 3;
		mas[2] = 45;
		mas[3] = 0;
		mas[4] = 671;
		
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
