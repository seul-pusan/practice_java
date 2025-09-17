package ch13;

import java.util.Arrays;
import java.util.List;

//p.632
/*
타입 매개변수
1. 멀티 타입 매개변수: 제네릭 클래스 선언시 타입 매개변수 여러 개 선언 가능. 콤마를 구분자로 사용. 객체를 생성할 때도 2개의 타입 인자를 지정해야 함.
	1) 참조변수 선언
	클래스명<타입인자목록> 변수명 = new 클래스명<타입인자목록>(생성자인자목록);
	
	2) 타입 제한
	<T extends superclass>
	
	3) 와일드카드
	제네릭에서 타입을 정확히 모르거나 여러 타입을 다루고 싶을 때 쓰는 문법. ? → 어떤 타입이든 올 수 있다는 뜻. 읽기는 가능하지만 쓰기는 제한적.
	
	4) 와일드카드 제한
		- 상위제한: <? extends 슈퍼클래스> -> 슈퍼클래스, 슈퍼클래스를 상속받은 하위 객체만 타입으로 지정 가능
		- 하위제한: <? super 서브클래스> -> 서브클래스, 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정 가능
*/
public class WildCardTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };

		//List는 제네릭 인터페이스이므로 List<Integer>타입 매개변수를 전달
		List<Integer> iList = Arrays.asList(inum);		//인자로 전달한 배열을 리스트 객체로 변환하여 반환
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);
		
		//sum메서드는 Number을 상속받은 타입만 매개변수로 전달받을 수 있도록 제한. 따라서 sList는 List<String> 타입이므로 받을 수 없음.
		double isum = sum(iList);
		double dsum = sum(dList);
//		double ssum = sum(sList);		//오류 발생

		System.out.println("inum의 합계 : " + isum);
		System.out.println("dnum의 합계 : " + dsum);
//		System.out.println("snum의 합계 : " + ssum);
	}

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();		//v.doubleValue() 메서드는 리스트의 각 요소를 double 타입의 값으로 변환.
		}
		return total;
	}
}
