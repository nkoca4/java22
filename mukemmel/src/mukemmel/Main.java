package mukemmel;

public class Main {

	public static void main(String[] args) {
		int sayi= 28;
		int tum = 0;
		
		for(int i =1; i<sayi;i++) {
			if (sayi%i ==0) {
				tum=tum+i;
				
			}
		}
		if (sayi==tum) {
			System.out.println("Mükemmel Sayi");
		}
		else {
			System.out.println("Mükemmel sayı değil");
		}

	}

}
