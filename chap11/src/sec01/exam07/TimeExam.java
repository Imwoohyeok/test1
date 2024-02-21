package sec01.exam07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		// 시간잴 때
		long t1 = System.currentTimeMillis();
		System.out.println(t1);
		
//		for(int i = 0; i<1000000; i++) {
//			System.out.print(".");
//		}
//		
//		long t2 = System.currentTimeMillis();
//		System.out.println();
//		System.out.println(t2-t1);
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
	}

}
