package quiz;

import java.util.Scanner;

public class Quiz6Exam {

	public static void main(String[] args) {
		
		// 클래스를 변수에 담음
		// 객체생성 - 매개변수를 가진 생성자 호출됨
		Quiz6 b1 = new Quiz6(1, "다시 사랑한다면", "김필", "발라드");   
		Quiz6 b2 = new Quiz6(2, "달", "스트레이", "발라드");
		Quiz6 b3 = new Quiz6(3, "친구로지내다보면", "서동현", "힙합");
		
		
//		b1.show(); // 클래스에 show를 출력함
//		b2.show();
//		b3.show();
		
		
//		Quiz6 mp = new Quiz6();
        boolean onOff = true;
        
//        while(onOff) {
//        	System.out.println("[1]다시사랑한다면  [2]달  [3]친구로지내다보면");
//            switch (new Scanner(System.in).nextInt()) {
//                case 1:
//                	Quiz6 a1 = b1.play();
//                	System.out.print(b1.getTitle());
//                	break;
//                case 2:
//                	Quiz6 a2 = b1.play();
//                	System.out.print(b2.getTitle());
//                	break;
//                case 3:
//                	Quiz6 a3 = b1.play();
//                	System.out.print(b3.getTitle());
//                	break;
//            }
//        }
        
		while (onOff) {
            System.out.println("[1]재생  [2]정지  [3]종료");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                	Quiz6 a1 = b1.play();
                    System.out.print(b1.getTitle());	// 노래제목 출력
                    System.out.println(b1.getPlaytime());	// 재생시간
                    break;
                case 2:
                	b1.stop();
                    System.out.println("정지");
                    break;
                case 3:
                    System.out.println("종료");
                    onOff = false;
                    break;
            }
		}
//		
//		while (onOff) {
//            System.out.println("[1]재생  [2]정지  [3]종료");
//            switch (new Scanner(System.in).nextInt()) {
//                case 1:
//                	Quiz6 a1 = b2.play();
//                    System.out.print(b2.getTitle());
//                    break;
//                case 2:
//                	b2.stop();
//                    System.out.println("정지");
//                    break;
//                case 3:
//                    System.out.println("종료");
//                    onOff = false;
//                    break;
//            }
//		}
//		
//		while (onOff) {
//            System.out.println("[1]재생  [2]정지  [3]종료");
//            switch (new Scanner(System.in).nextInt()) {
//                case 1:
//                	Quiz6 a1 = b3.play();
//                    System.out.print(b3.getTitle());
//                    break;
//                case 2:
//                	b3.stop();
//                    System.out.println("정지");
//                    break;
//                case 3:
//                    System.out.println("종료");
//                    onOff = false;
//                    break;
//            }
//		}
			
	}
}
