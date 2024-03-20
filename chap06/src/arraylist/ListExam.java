package arraylist;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		
		// 추가된 순서를 0부터 시작하는 index로 자료 관리
		ArrayList list = new ArrayList();
		
		// 추가
		list.add("임우혁");
		list.add(1);
//		System.out.println(list);
		
		// 가져오기
		String name = (String) list.get(0);	 // 임우혁
		int num = (int) list.get(1);		 // 1
		
		// 크기 계산
		int length = list.size();	// 배열의 길이 
		
//		System.out.println(length);
		
	}

}
