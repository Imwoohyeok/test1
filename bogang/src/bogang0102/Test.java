package bogang0102;

public class Test {

	public static void main(String[] args) {
		String s = "12345"; // 1 + 2 + 3 + 4 + 5
		
		/*
		 * 문자열을 정수로 변환하기
		 * 
		 * 1. 일단 문자열은 for문을 돌려서 한 글자씩 (char)형으로 변환합니다.
		 * 2. 변환된 한 글자의 char형 글자를 int형으로 변환합니다.
		 * 
		 */
		
		// char형은 내부적으로 아스키코드 표를 참고해서 저장을 합니다.
		// 1-> 49를 가지고
		// 2-> 50을 가지고
		// 3-> 51을 가지고
		// A-> 65 를 가지고 있음 
		
		// 1
		int sum = 0;
		for(int i=0; i < s.length(); i++) {
			// 문자열 0을 빼면 1,2,3,4,5 를 출력됨
			sum += s.charAt(i) - '0'; // char -> int
		}
		
		System.out.println(sum);
	}

}
