package donguler;

import java.util.Scanner;

public class dongu2 {

	
	 public static void main(String[] args) {
		
		 int kacsayi=0,toplam=0,islem=0;
		 boolean durum=true;
		 	 
		 Scanner sc = new Scanner(System.in);
		 
		 for(;durum;) {
		 System.out.println("0- Toplama Ýþlemi");
		 System.out.println("1- Çýkartma Ýþlemi");
		 System.out.println("2- Çarpma Ýþlemi");
		 System.out.println("3- Bölme Ýþlemi");
		 System.out.println("Yapmak istediðiniz iþlemin numarasýný giriniz..: ");
		 
		 islem= sc.nextInt();
		 
		 if(islem<=-1 || islem>=4) {
			 
			 System.out.println("0 ile 3 arasý iþlem rakamý girmelisiniz.");
			 
		 }
		 else {
			 durum=false;
		 }
		 }
		 
		
		 
		 System.out.println("kaç sayý girmek istiyorsun? ");
		 	 
		 
		 kacsayi = sc.nextInt();
		 for (int i = 0; i < kacsayi; i++) {
		     if(islem==0) {			 
			 System.out.println((i+1)+". Sayýyý gir....: ");
			 toplam += sc.nextInt();			
		     }
		     else if (islem==1) {
		    	 System.out.println((i+1)+". Sayýyý gir....: ");
				 toplam -= sc.nextInt();			
		    
		    	 
		     }
		}
		 
		System.out.println("Toplam sonuç.....:"+ toplam);
		 
	}
	
}
