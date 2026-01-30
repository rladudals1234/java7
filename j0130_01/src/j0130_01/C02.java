package j0130_01;

import java.util.ArrayList;

public class C02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);		//삭제되며 번지가 달라져서 마지막 번지부터 삭제
			//첫번째번지 삭제시 뒤에 있는번지들을 앞으로 가져오며 시간이 오래걸림
		}
		
		System.out.println(list);
	}

}
