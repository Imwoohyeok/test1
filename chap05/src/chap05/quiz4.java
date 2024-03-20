package chap05;

public class quiz4 {

	public static void main(String[] args) {
		int[] a1 = {0,1,2,3,4,5};
		System.out.println(a1.length);
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println(a1[3]);
		System.out.println(a1[4]);
		System.out.println(a1[5]);
//		for (int i = 0; i < ) {
//			
//		}
		
		int a = 5;
		a = a++ + ++a;	// a++ = 5 ++에서 6되고 ++a = 7이 된다.
		System.out.println(a);
		
		System.out.println("==================");
		
		for(int q=2; q<=9; q++) {
			for(int i = 1; i<=9; i++) {
				System.out.print(q + "x" + i + "=" + q*i + " ");
			}
			System.out.println();
		}
		
//		for(int i = 1; i<=9; i++) {
//			System.out.print(3 + "x" + i + "=" + 3*i + " ");
//		}
//		System.out.println();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.print(4 + "x" + i + "=" + 4*i + " ");
//		}
//		System.out.println();
		
		System.out.println("==================");
		
		
	}
	
	
}
