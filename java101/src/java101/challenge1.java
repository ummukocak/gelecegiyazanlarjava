package java101;

import java.util.Scanner;

public class challenge1 {

	private static Scanner scan;
	//Konsoldan girilen isimdeki ünlü harfler için 1,2,3,4,5,6,7,8 yazdırma
		public static void main(String[] args) {
			harfindonusumu();
		}
		 public static void harfindonusumu() {
				scan = new Scanner(System.in);
				System.out.println("isim giriniz: ");
				String isim=scan.nextLine();
				for(int i=0; i<isim.length(); i++) {
					if(isim.charAt(i)=='a') {
						isim=isim.replace('a', '1');	
					}
					if(isim.charAt(i)=='e') {
						isim=isim.replace('e', '2');	
					}
					if(isim.charAt(i)=='ı') {
						isim=isim.replace('ı', '3');	
					}
					if(isim.charAt(i)=='i') {
						isim=isim.replace('i', '4');	
					}
					if(isim.charAt(i)=='o') {
						isim=isim.replace('o', '5');	
					}
					if(isim.charAt(i)=='ö') {
						isim=isim.replace('ö', '6');	
					}
					if(isim.charAt(i)=='u') {
						isim=isim.replace('u', '7');		
					}
					if(isim.charAt(i)=='ü') {
						isim=isim.replace('ü', '8');	
					}
			
				}
				System.out.println(isim);
			 
		 }

	}