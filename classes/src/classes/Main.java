
package classes;

public class Main {

	public static void main(String[] args) {
		//referans type
		CustomerManager customerMenager=new CustomerManager();
		CustomerManager customerMenager2 = new CustomerManager();
		customerMenager.Add();
		customerMenager.Remove();
		customerMenager.Update();
		
		//value type
		int sayi1= 10;
		int sayi2= 20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,4,5,7};
		int[] sayilar2 = new int[] {9,8,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
