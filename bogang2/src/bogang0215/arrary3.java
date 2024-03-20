package bogang0215;

import java.util.Scanner;

public class arrary3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하시오 >> ");
		int sc = scan.nextInt();
		
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		
		// 입력받은 수/ 50000;
		// ....
		// count 지페 세기
		int count; 
		
		for(int i = 0; i<unit.length; i++) {	
			count = sc / unit[i];
			System.out.println(unit[i] + "원 짜리 : " + count);
			sc = sc -(unit[i]*count);
		}
		

//		int oman = sc / 50000;
//		System.out.println("50000원 짜리 : " + oman);
//		sc = sc -(50000*oman);
//		
//		
//		int lman = sc / 10000;
//		System.out.println("10000원 짜리 : " + lman);
//		sc = sc -(10000*lman);
//		
//		
//		int lc = sc / 1000;
//		System.out.println("1000원 짜리 : " + lc);
//		sc = sc -(1000*lc);
//	
//		
//		int oback = sc / 500;
//		System.out.println("500원 짜리 : " + oback);
//		sc = sc -(500*oback);
//		
//		
//		int lback = sc / 100;
//		System.out.println("100원 짜리 : " + lback);
//		sc = sc -(100*lback);
//		
//		
//		int osib = sc / 50;
//		System.out.println("50원 짜리 : " + osib);
//		sc = sc -(50*osib);
//		
//		
//		int sib = sc / 10;
//		System.out.println("10원 짜리 : " + sib);
//		sc = sc -(10*sib);
//		
//		
//		int l = sc / 1;
//		System.out.println("1원 짜리 : " + l);
//		sc = sc -(1*l);
		
		
		
	}

}
