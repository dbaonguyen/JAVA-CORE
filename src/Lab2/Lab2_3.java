package Lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		int csc,csm,csth,tientra,tiendm,tienvuot;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chi so cu: ");
		csc = sc.nextInt();
		System.out.println("Nhap chi so moi: ");
		csm = sc.nextInt();
		
		csth = csm - csc;
		tiendm = 1230 * 50;
		if (csm < csc) {
			System.out.println("Chi so moi phai lon hon chi so cu");
		} else {
			if (csth <= 50) {
				tientra = csth * 1480;
			} 
			else if (csth > 50 && csth < 100) {
				
				tientra = (50 * 1480) + (csth-50) * 1700;
			} else {
				tientra = (50 * 1480) + (50 * 1700) + (csth - 100) * 1900;
			}
			tienvuot = tientra - tiendm;
			
			System.out.println("Chi so cu la: " + csc + ", chi so moi la: " + csm + ", tien dinh muc la: "+ tiendm + ", tien vuot dinh muc la: " + tienvuot + " ,tien ban phai tra la: "+tientra);

		}
		
		
	}

}
