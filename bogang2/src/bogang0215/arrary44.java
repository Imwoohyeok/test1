package bogang0215;

public class arrary44 {
	
	public static void main(String[] args) {
		// [2][3]
		int[][] arr3 = {
			{ 10, 11, 12 },
			{ 20, 21, 22 }
		};
//		for(int i = 0; i<arr3.length; i++) {
//		}
		
		System.out.println("num 배열 길이 : " + arr3.length);	
		
		System.out.println("num[0] 배열 길이 : " + arr3[0].length);	
		System.out.println("num[1] 배열 길이 : " + arr3[1].length);	
		
		System.out.println("arr3[0][0] : " + arr3[0][0]);
		System.out.println("arr3[0][1] : " + arr3[0][1]);
		System.out.println("arr3[0][2] : " + arr3[0][2]);
		
		System.out.println("arr3[1][0] : " + arr3[1][0]);
		System.out.println("arr3[1][1] : " + arr3[1][1]);
		System.out.println("arr3[1][2] : " + arr3[1][2]);
		
		int[][] arr = {
			{95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };
		// [0][0],[0][1]
		// [1][0],[1][1],[1][2]
		// [2][0],[2][1],[2][2],[2][3],[2][4]
		
		int count = 0;
		int sum = 0;
		double avg = 0;
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = sum / (double)count;
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + avg);
		
//		byte (1) < short (2) < int (4) < long (8) < float (4) < double (8) 
		
	}
	
	
	
}
