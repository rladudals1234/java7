package j0130_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C03 {

	public static void main(String[] args) {
		// set 순서X, 중복X
//		HashSet set = new HashSet();
//		set.add(3);
//		set.add(1);		//int->Integer->Object
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);		//입력한 순서가 아닌 맘대로
//		
//		System.out.println(set);
//
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			int a = (int)it.next();
//			System.out.println(a);
//		}
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List list2 = new ArrayList();
		list2.add(6);
		list.add(list2);
		
		//HashMap<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		//입력 - put()
		map.put("name", "홍길동");
		map.put("boardList", list);
		map.put("memberList", list2);
		//출력 - get()
		System.out.println(map.get("name"));	//key값 읽어오기
		System.out.println(map.get("boardList"));
		
		//전체출력 - map은 list를 상속하지 않기 때문에 Iterator 사룔할 수 없음.
		//map -> set으로 변경해서 Iterator 사용함.
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
