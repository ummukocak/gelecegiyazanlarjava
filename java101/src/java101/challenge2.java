package java101;

public class challenge2 {

	public static void main(String[] args) {

		zip();

		}

	private static void zip() {
		String metin="aaaafggg assssvv t";
		metin=metin+" ";//son karakterini yazdırmak için
		int count=1;
		for(int i=1; i<metin.length(); i++) {
			if (metin.charAt(i)==metin.charAt(i-1)) {
				count=count+1;		
			}
			else {
				System.out.print(metin.charAt(i-1));
				if(metin.charAt(i-1)!=' ') {//Boşluk karakterini saydırmamak için.
					System.out.print(count);
				}
				count=1;
			}	
		}	
	}

}