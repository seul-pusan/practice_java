package ch10;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterator => 헬퍼(Helper) 객체: 어떤 작업을 효율적으로 처리하기 위해 유용한 기능들을 제공하는 객체
컬렉션에 저장된 데이터의 위치 정보를 포함한 커서가 있어 인덱스 등을 사용하지 않고도 쉽게 데이터에 접근 가능
컬렉션에 저장된 모든 데이터를 순차적으로 접근하여 사용할 목적으로 사용하는 Iterator를 Collection view라고 함.
컬렉션 뷰에는 Iterator, Enumeration, ListIterator 존재
*/

public class Test02 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=".repeat(40));

		Iterator<String> iter = list.iterator();
		/*
		 * iterator() 메서드는 컬렉션 객체를 Iterator 객체로 변환하여 반환. List와 Set에서 상속하고 있는 Collection
		 * 인터페이스에서 선언한 메서드이므로, List, Set 계열의 모든 컬렉션에서 사용가능. 즉, 필요 시 모든 List, Set 게열의 컬렉션
		 * 객체를 Iterator로 변환하여 사용 가능
		 */
		
		while (iter.hasNext()) {		//hasNext(): 현재 커서 다음에 데이터가 존재하는지 판단. 있다면 true
			System.out.println(iter.next());		//계속 다음 데이터로 이동해 hasNext()가 실행되어 데이터가 없어 false 반환 시 while문을 빠져 나옴
		
		}
	}

}
