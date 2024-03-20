package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class quiz0213b {

	public static void main(String[] args) {

//		1~6
//		Lv1. 주사위 2개를 굴려서 나올 수 있는 모든 조합
//		Lv2. 눈금의 합 별로 나올 수 있는 조합
//			합이 2 : [1,1] 
//			합이 3 : [1,2] [2,1]
//		Lv3. Lv2에서 중복없이 출력

//		int[] dice1 = {1,2,3,4,5,6};
//		int[] dice2 = {1,2,3,4,5,6};

//		int dice1;
//		int dice2;

//		System.out.println(Arrays.toString(dice1));

//		for(int i = 0; i < dice1.length; i++) {
////			System.out.println(dice1[i]);
//			if(dice1[i] + dice2[i] == 2) {
//				System.out.println();
//			}
//		}

		int sum = 6;
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				if (d1 + d2 == sum) {
					System.out.print("합이 " + sum + " : ");
					System.out.print("[" + d1 + ", " + d2 + "]");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");
		sum = 7;
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				if (d1 + d2 == sum) {
					System.out.print("합이 " + sum + " : ");
					System.out.print("[" + d1 + ", " + d2 + "]");
				}
			}
			System.out.println();
		}
		System.out.println("==========================");

		for (int i = 2; i <= 12; i++) {
			System.out.print("합이 " + i + " : ");
			for (int d1 = 1; d1 <= 6; d1++) {
				for (int d2 = 1; d2 <= 6; d2++) {
					if (d1 + d2 == i) {
						System.out.print("[" + d1 + ", " + d2 + "]");
					}
				}
			}
			System.out.println();
		}
		
		
		System.out.println("==========================");
//		합이 2인 List
//		합이 3인 List
//		합이 4인 List
//		합이 5인 List 
//		합이 6인 List
		System.out.println("\n------------------");
		int count2 = 1;
		for (int n = 1; n <= 12; n++) {

			System.out.println("합이" + n);

			for (int i = 1; i <= 6; i++) {

				for (int j = 1; j <= 6; j++) {

					if (i + j == n) {
						System.out.print("[" + i + "," + j + "]");
						System.out.print(" ");
					}
					count2++;
				}

			}

			System.out.println();

		}
		System.out.println("총 비교 회수 : " + count2);

		System.out.println("\n------------------");
		// 합이 2인 List
		// 합이 3인 List
		HashMap map = new HashMap();
//		map.put("2", "abc");
//		System.out.println(map.get("2")); // 있으면 값이 나옴
//		System.out.println(map.get("1")); // 없으면 null

		int count3 = 1;
		
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				// 1,1   1,2   1,3...
				// 2,1   2,2   2,3...
				
				int mmm = d1 + d2;
				if(map.get(mmm) == null) {
//					String[] a = new String[1];
//					a[0] = d1 +","+ d2;
					
					ArrayList list = new ArrayList();
					String value = d1 +","+ d2;
					list.add( value );
					
					map.put(mmm, list);
				} else {
//					String[] a = (String[])map.get(sum);
//					new String[a.length + 1]
					// 앞에서 부터 복사 다 하고
					// 맨 끝에 추가 값을 넣기
					
					
					ArrayList list = (ArrayList)map.get(mmm);
					String value = d1 +","+ d2;
					list.add( value );
					
					map.put(mmm, list);
				}
				count3++;
			}
		}
		
		for (int n = 2; n <= 12; n++) {
			System.out.println("합이 "+ n +":"+ map.get(n)); 
		}
		System.out.println("총 비교 회수 : " + count3);
		
		
//		for (int i = 1; i <= 6; i++) {
//			
//			boolean isStop = false;
//			for (int j = 1; j <= 6; j++) {
//				
//				if(j >= 4) {
//					isStop = true;
//					break;
//				}
//			}
//			if(isStop) {
//				break;
//			}
//		}
		
		
		
	}

}
	
