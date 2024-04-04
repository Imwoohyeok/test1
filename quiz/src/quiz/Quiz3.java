package quiz;

public class Quiz3 {

	public static final int LETTER_TYPE_NUMBER = 0; // 비번종류 : 숫자
	public static final int LETTER_TYPE_UPPERCASE = 1; // 비번종류 : 대문자
	public static final int LETTER_TYPE_LOWERCASE = 2; // 비번종류 : 소문자

	public static void main(String[] args) {

//      1. 임시 비번 만들기 8자리
//		1-1 숫자로
//		1-2 소문자만
//		1-3 숫자2개, 대소문자 하나 이상 조합

		// 변수 타입 설정에 대한 테스트
		int temp = 12345678;
		int temp4 = 123456; // 8진수 이유는 앞에 0이 있어서
//      System.out.println("temp4: " + temp4);
		String temp2 = "12345678"; // 적합!!
		String temp3 = "00000000"; // 문자로 하면 8진수로 바뀌지 않음

		String pw = "";

		// 1-1 숫자로
//      int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//      String n = "0123456789";

//      int index = ((int) (Math.random() * 10000)) % 10;
//      int index = (int) (Math.random() * (9+1));	// int라서 8.99999라서 1을 더해줌
//      
//      pw += index;

		// index변수 재활용
//      index = (int) (Math.random() * (9+1));
//      pw += index;

		for (int i = 1; i <= 8; i++) {
			int index = (int) (Math.random() * (9 + 1));
//         System.out.println("index: " + index);
			pw += index;
//         System.out.println("현재 pw: " + pw);
		}

		System.out.println("1-1 숫자 pw: " + pw);
		System.out.println("===========================");
		// 1-2 소문자로
//      pw = new String().valueOf(1234); // valueOf() 괄호 안에 값을 문자열로 바꿔줌
		pw = new String();
		String[] alpha1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
//      String[] alpha2 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
//            "S", "T", "U", "V", "W", "X", "Y", "Z" };
		System.out.println(alpha1.length);

		for (int i = 1; i <= 8; i++) {
			int index = (int) (Math.random() * 26);
//         System.out.println("index: " + index);
			pw += alpha1[index];
//         System.out.println("현재 pw: " + pw);
		}

		System.out.println("1-2 소문자 pw (1): " + pw);

		// 두번째 방법
		// 아스키코드(숫자)를 이용해 문자로 만드는 방법

		pw = "";
		for (int i = 1; i <= 8; i++) {
			// 소문자
			// 97 - 122
			// 122 - 97 + 1
//         0~25 +97
//         int start = 97;
//         int end = 122;
//         int index = (int) (Math.random() * (end - start + 1)) + start;
//         System.out.println("index: " + index);
//         pw += alpha1[index];
//         System.out.println("현재 pw: " + pw);
			int index = getRandomRange(97, 122);
			char alpha2 = (char) index;

			pw += alpha2;

		}
		System.out.println("1-2 소문자 pw (2): " + pw);
		System.out.println("===========================");

		// 1-3 숫자2개, 대소문자 하나 이상 조합
		pw = "";

		// 65 ~ 90 범위의 랜덤값 뽑기
		// Math.random(); 0.0 <= 랜덤값 < 1.0
		// 65 ~ 90 => ( 0 ~ 25 ) + 65

		int start = 65;
		int end = 90;
//       int index = (int) (Math.random() * 26) + 65;	// 26: 개수 65: 처음 값
//       int index = (int) (Math.random() * (end - start + 1)) + start;
		int index = getRandomRange(65, 90);

		// 숫자 2개
		pw += getRandomRange(0, 9);
		pw += getRandomRange(0, 9);

		// 대문자 1개
		char letter = (char) getRandomRange(65, 90);
		pw += letter;

		// 소문자 1개
		letter = (char) getRandomRange(97, 122);
		pw += letter;

		// 숫자 2개
		pw += getRandomRange(0, 9);
		pw += getRandomRange(0, 9);

		// 대문자 1개
		letter = (char) getRandomRange(65, 90);
		pw += letter;

		// 소문자 1개
		letter = (char) getRandomRange(97, 122);
		pw += letter;

		System.out.println("최종: " + pw);

		// 배열에 필수요소 먼저 채우기
		String[] letters = new String[8];

		// 랜덤위치
		int idx = getRandomRange(0, 7);

		// 첫번째 숫자
		int num = getRandomRange(0, 9);

		// 넣기
		letters[idx] = "" + num;

		// 랜덤위치
		idx = getRandomRange(0, 7);

		// 두번째 숫자
		num = getRandomRange(0, 9);

		// 넣기
		letters[idx] = "" + num;

		idx = getRandomRange(0, 7); // 랜덤 위치

		/*
		 * 몇번을 반복할지 모르기 때문에 사용 못함 0.000000000001의 확률도 0은 아니기 때문에
		 */
		// 그 위치에 넣엇던 값이 없다면
//       if(letters[idx] == null) {
//    	   // 두번째 숫자
//    	   num = getRandomRange(0,9);
//    	   
//    	   // 넣기
//           letters[idx] = "" + num;
//       } else {
//    	   // 그 위치에 이미 넣은 값이 있다면
//           letters[idx] = "" + num;		// 랜덤 위치
//           if(letters[idx] == null) {
//        	   // 두번째 숫자
//        	   num = getRandomRange(0,9);
//        	   
//        	   // 넣기
//               letters[idx] = "" + num;
//           } else {
//        	   // 그 위치에 이미 넣은 값이 있다면
//        	   idx = getRandomRange(0,7);		// 랜덤 위치
//           if(letters[idx] == null) {
// 	   			// 두번째 숫자
// 	            num = getRandomRange(0,9);
// 	   
// 	            // 넣기
//              letters[idx] = "" + num;
//           } else {
// 	           // 그 위치에 이미 넣은 값이 있다면
//             letters[idx] = "" + num;		// 랜덤 위치
//           }
//       

		// 위치를 뽑는데 언제까지? 그자리가 null일때 까지 계속 뽑자!!
		// 반복문으로 만들껀데 몇번인지 모르기 때문에
		// while로 선택
//		idx = getRandomRange(0,7);	// 랜덤위치
//		while(letters[idx] != null) {
//			idx = getRandomRange(0,7);
//		}

		do {
			idx = getRandomRange(0, 7); // 랜덤 위치
		} while (letters[idx] != null);
		// while문 이후의 letters[idx]는 비어있는 자리

		// 두번째 숫자
		num = getRandomRange(0, 9);

		// 넣기
		letters[idx] = "" + num;

//		// 빈자리 찾기
//		do {
//			idx = getRandomRange(0, 7); // 랜덤 위치
//		} while (letters[idx] != null);
//
//		// 대문자 뽑기
//		char upper = (char) getRandomRange(65, 90);
//		letters[idx] = "" + upper;
		
		// 위 내용을 함수로 변경
		// 전달인자 letters 얕은복사
//		letters = fillLetter(letters, Quiz3.LETTER_TYPE_NUMBER);
//		letters = fillLetter(letters, Quiz3.LETTER_TYPE_NUMBER);
//		letters = fillLetter(letters, Quiz3.LETTER_TYPE_UPPERCASE);
//		letters = fillLetter(letters, Quiz3.LETTER_TYPE_LOWERCASE);
		fillLetter(letters, Quiz3.LETTER_TYPE_NUMBER);
		fillLetter(letters, Quiz3.LETTER_TYPE_NUMBER);
		fillLetter(letters, Quiz3.LETTER_TYPE_UPPERCASE);
		fillLetter(letters, Quiz3.LETTER_TYPE_LOWERCASE);

		// 빈자리 찾기
		do {
			idx = getRandomRange(0, 7); // 랜덤 위치
		} while (letters[idx] != null);

		// 소문자 뽑기
		char lower = (char) getRandomRange(97, 122);
		letters[idx] = "" + lower;

	}

	static int getRandomRange(int start, int end) {
		int index = (int) (Math.random() * (end - start + 1)) + start;
		return index;
	}

	// 주어진 배열에서
	// 빈자리를 찾아서
	// 주어진 종류를 추가
	// void 를 String[] 을 쓰고 맨 밑에 return letter; 를 주면 된다
	static void fillLetter(String[] letters, int type) {
		int idx = 0;
		// 빈자리 찾기
		do {
//			idx = getRandomRange(0, 7); // 랜덤 위치
			idx = getRandomRange(0, letters.length-1); // 랜덤 위치
		} while (letters[idx] != null);
		
		if(type == Quiz3.LETTER_TYPE_NUMBER) {
			
			letters[idx] = "" + getRandomRange(0, 9);
			
		} else if(type == Quiz3.LETTER_TYPE_UPPERCASE) {
			
			letters[idx] = "" + (char) getRandomRange(65, 90);
			
		} else if (type == Quiz3.LETTER_TYPE_LOWERCASE) {
			
			letters[idx] = "" + (char) getRandomRange(97, 122);
			
		}
//		return letters;
		return;
		
		
		
		// 소문자 뽑기
//		char lower = (char) getRandomRange(97, 122);
//		letters[idx] = "" + lower;
	}
}