package ders10;

public class main {
	public static void main(String[] args) {
		char grade = 'B';
		

		switch(grade) {
			case 'A':
				System.out.println("Mükemmel: Geçtiniz");
				break;
			case 'B':
			case 'C':
				System.out.println("İyi: Geçtiniz");
				break;
			case 'D':
				System.out.println("Şartlı: Geçtiniz");
				break;
			case 'F':
				System.out.println("Kaldınız");
				break;
		}
		
		
		
	}
	

}
