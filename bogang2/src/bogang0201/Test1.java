package bogang0201;

public class Test1 {

	public static void main(String[] args) {
		String s = "자바 프로그래밍";
		System.out.println(s.charAt(3));	// 3번째 글자 추출
		
		// substring();
		
		System.out.println(s.substring(0,2)); // 0번째부터 2번째이전까지
		System.out.println(s.substring(1));	// 1번째부터 끝까지
		
		System.out.println(s.length()); // 문자열의 길이

	}

}
