package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		// list.isEmpty()
		// 없으면 true
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add(1); // 추가
		// isEmpty가 있으면 false
		System.out.println(list.isEmpty());
		
		int a = (int)list.get(0);
		System.out.println(a); // 1
		
//		IndexOutOfBoundsException
//		int b = (int)list.get(10);
		
		// 초기화
		list = new ArrayList();
		
		Map map = new HashMap();
		map.put("key", "value");
		map.put("key2", "value2");
		
		String key = (String)map.get("key");
		
		// 키가 없으면 null
		// 반대로 null이면
		//		진짜 null을 넣었거나
		//		키를 put하지 않았다
		System.out.println(map.get("key3"));
		
		
		String title;	// 제목
		String artist;	// 가수
		String pt;		// 재생시간
		String contend;	// 가사
		
		map.put("title", 11);
		map.put("artist", 11);
		map.put("pt", 11);
		map.put("contend", 11);
		list.add(map);
		
		Map map2 = new HashMap();
		map.put("title", 11);
		map.put("artist", 11);
		map.put("pt", 11);
		map.put("contend", 11);
		list.add(map2);
		
	}

}
