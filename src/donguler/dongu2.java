package donguler;

import java.util.Scanner;

public class dongu2 {

	
	 public static void main(String[] args) {
		
		 int kacsayi=0,toplam=0,islem=0;
		 boolean durum=true;
		 	 
		 Scanner sc = new Scanner(System.in);
		 
		 for(;durum;) {
		 System.out.println("0- Toplama ��lemi");
		 System.out.println("1- ��kartma ��lemi");
		 System.out.println("2- �arpma ��lemi");
		 System.out.println("3- B�lme ��lemi");
		 System.out.println("Yapmak istedi�iniz i�lemin numaras�n� giriniz..: ");
		 
		 islem= sc.nextInt();
		 
		 if(islem<=-1 || islem>=4) {
			 
			 System.out.println("0 ile 3 aras� i�lem rakam� girmelisiniz.");
			 
		 }
		 else {
			 durum=false;
		 }
		 }
		 
		
		 
		 System.out.println("ka� say� girmek istiyorsun? ");
		 	 
		 
		 kacsayi = sc.nextInt();
		 for (int i = 0; i < kacsayi; i++) {
		     if(islem==0) {			 
			 System.out.println((i+1)+". Say�y� gir....: ");
			 toplam += sc.nextInt();			
		     }
		     else if (islem==1) {
		    	 System.out.println((i+1)+". Say�y� gir....: ");
				 toplam -= sc.nextInt();			
		    
		    	 
		     }
		}
		 
		System.out.println("Toplam sonu�.....:"+ toplam);
		 
	}
	
}
