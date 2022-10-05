package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar= {2,6,4,8,8,4,2};
		int aranacak = 6;
		boolean varMı = false;
		
		for (int sayi : sayilar) {
			
			if (sayi == aranacak) {
				varMı=true;
				break;
			}
			
		}
		String mesaj="";
		
		if (varMı) {
			mesaj = "Aradığınız sayı var";
			mesajVer(mesaj);
		}
		
		else {
			System.out.println("Sayı Dizide Yok " + aranacak);
		}
		 
	}
	
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
	}

}