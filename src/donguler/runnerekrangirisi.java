package donguler;

import java.util.Scanner;

public class runnerekrangirisi {

	public static void main(String[] args) {
		
		int sayi1=0, sayi2=0,toplam;
		
		
		System.out.print("ilk say�y� giriniz...: ");
		
		Scanner sc = new Scanner(System.in);
		sayi1=sc.nextInt();
		System.out.println();
		
		System.out.print("ikinci say�y� giriniz...: ");
		sayi2 = sc.nextInt();
		
		toplam = sayi1+sayi2;
		System.out.println("toplama sonucu....:"+toplam);
		
	}

}
