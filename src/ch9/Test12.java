package ch9; //p.430

/*
기본 데이터 → 참조 데이터 : 박싱
참조 데이터 → 기본 데이터 : 언박싱
컴파일 시 처리 코드가 자동으로 생성되어 처리되는 것 : 오토박싱
*/
public class Test12 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer obj1 = n1;

		Integer obj2 = Integer.valueOf("20");
		int n2 = obj2;

		Integer obj3 = 30;
		int n3 = obj3 + 40;

		System.out.println(n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);

	}
}
