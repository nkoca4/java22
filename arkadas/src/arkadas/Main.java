package arkadas;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int sayi1= 500;
		int sayi2= 1000;
		int tum1= 0;
		int tum2= 0;
		
		for (int i=1; i<sayi1;i++) {
			if(sayi1%i==0) {
				tum1=tum1+i;				
			}
			
		}
		for (int i=1; i<sayi2; i++) {
			if(sayi2%i==0) {
				tum2=tum2+i;	
			}
		}
		if (tum1==sayi2 && tum2==sayi1) {
			System.out.println("Arkadaş Sayılar");}
		else {
			System.out.println("Arkadaş değil.");
		}
			
		}
			
		
	}


