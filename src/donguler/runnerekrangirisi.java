package donguler;

import java.util.Scanner;

public class runnerekrangirisi {

	public static void main(String[] args) {
		
		int sayi1=0, sayi2=0,toplam;
		
		
		System.out.print("ilk sayýyý giriniz...: ");
		
		Scanner sc = new Scanner(System.in);
		sayi1=sc.nextInt();
		System.out.println();
		
		System.out.print("ikinci sayýyý giriniz...: ");
		sayi2 = sc.nextInt();
		
		toplam = sayi1+sayi2;
		System.out.println("toplama sonucu....:"+toplam);
		
	}

}
