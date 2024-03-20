package bogang0115;

import java.util.Arrays;

public class arrary {

	public static void main(String[] args) {
		
		// quiz0
		// 생성
		int[] a = new int[6];	// 6칸의 배열생성
		
		// 입력
		for(int i = 0; i <= 5; i++) {
			a[i] = i;  	// defalt값이 0인데 i의값을 for문으로 0~부터5까지 값을 넣어줌
		}
		
		
		// 출력
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);			
		}
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		
		System.out.println("quiz1===============================");
		
		// quiz1
		// 생성
		//506인 이유는 555- 50 = 505 인데 배열은 0부터라서 506칸을 만들어줌
		int[] b = new int[506];		
		
		// 입력
		for(int i = 0; i < b.length; i++) {
			b[i] = i + 50;			
		}
		
		
		//출력
		for(int i = 0; i< b.length; i++) {
			System.out.print(b[i] + " ");			
		}
		System.out.println();
		
		System.out.println("quiz2===============================");
		
		// quiz2  로또 6개저장(중복없이)
		// 생성
		int[] lotto = new int[6];	// 6칸배열생성
		
		// 입력
		// (int)Math.random() * 45 
		// Math.random() 범위가 0 ~0.999999999
		// (0 ~ 44.999999999)
		// (int)로 타입변환으로 소수점날림
		for(int i =0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			// i=1 > j가0번째만 확인
			// i=2 > j가0,1번째만 확인
			// i=3 > j가0,1,2번째만 확인
			for(int j = 0; j < i; j++) {	
				if(lotto[i] == lotto[j]) {
					i--;	// 만약 i=2 돌때 중복이면 i--하면 i는 2인 for문을 다시돈다
				}
			}
		}
		Arrays.sort(lotto); // 정렬
		
		
		// 출력
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");			
		}
		System.out.println();
		System.out.println("quiz3======================");
		// quiz3 
		int[] lol = {2, 4, 3, 5, 1};
		
		System.out.println(lol[4]);
		
		System.out.println();
		System.out.println("quiz4======================");
		// quiz4
		String[] movie = {"범죄도시3", "엘리멘탈", "가디언즈 오브 갤럭시","미션 임파서블","콘크리트 유토피아"};
		
		// movie[0] 는 0번째 문자의 길이
		// movie[1] 는 1번째 문자의 길이
		// movie.length : movie 배열의 칸 수
		
//		System.out.println(movie[0].length());	
//		System.out.println(movie[1].length());
//		System.out.println(movie[2].length());
//		System.out.println(movie[3].length());
//		System.out.println(movie[4].length());
		
	
		
		int max = 0;
		
		// 그전 배열의 길이보다 클 때 
		// for문을 돌면서 max값(배열의길이) 보다 movie의 길이가 클 때 max의 값을 바꿔줌
		for(int i =0; i < movie.length; i++) { 
			if(max < movie[i].length()) {
				max = movie[i].length();
			}
		}
		System.out.println(max);
		System.out.println(movie.length);
		
	}

}


