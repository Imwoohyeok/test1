package bogang0115;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		// 0번
		int[] a = {0,1,2,3,4,5};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");			
		}
		System.out.println();
		System.out.println("1번------------------");
		//1번
		int[] o = new int[506]; // 생성
		
		// 입력
		for(int i = 0; i < o.length; i++) {
			o[i] = i + 50;
		}			
		
		for(int i = 0; i < o.length; i++) {
			System.out.print(o[i] + " "); // 출력			
		}
		
		System.out.println();
		System.out.println("2번------------------");
		// 2번
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			// 랜덤값을 lotto배열 값의 하나씩 넣는다
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		
		// 출력
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");			
		}
		// 중복없이 만들기
		// lotto[i]가 lotto[j] 랑 값이 같을 때 i--로 다시 for문 돌리기
		
		
		System.out.println();
		System.out.println("3번------------------");
		// 3번
		int[] lol = {2, 4, 3, 5, 1};
		
		System.out.println(lol[4]);
		
		
		
		System.out.println();
		System.out.println("4번------------------");
		// 4번
		String[] movie = {"범죄도시3",
				"엘리멘탈",
				"가디언즈 오브 갤럭시",
				"미션 임파서블",
				"콘크리트 유토피아"
				};
		// max라는 변수를 만들고
		// max값보다 movie의 길이가 더 클 때
		// max의 값을 바꿔줌
		
		// 입력
		int max = 0;
		for(int i = 0 ; i < movie.length; i++) {
			if(movie[i].length() > max) {
				max = movie[i].length();
			}
		}
		// 출력
		System.out.println(max);
	
		/**
		 * 메모장
		 * St
		 * 
		 * 
		 */
	}

}
