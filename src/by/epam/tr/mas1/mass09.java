package by.epam.tr.mas1;

public class mass09 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
		int[] mas;
		mas = new int[5];
		mas[0] = 1;
		mas[1] = 11;
		mas[2] = 555;
		mas[3] = 43;
		mas[4] = 2222;
		
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
		
		System.out.println("q"+ q);
		System.out.println("w"+ w);
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
