package ders9;

public class main {

	public static void main(String[] args) {
	
		int sayi1=200;
		int sayi2=25;
		int sayi3=3;
		int buyuk=sayi1;
		
		if(buyuk<sayi1) {
			buyuk= sayi1;
		}
		if (buyuk<sayi2) {
			buyuk=sayi2;
		}
		if (buyuk<sayi3) {
			buyuk=sayi3;
		}
		System.out.println("Büyük sayı= " +buyuk);
		
	}
}
