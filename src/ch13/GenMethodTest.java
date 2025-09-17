package ch13; //p.635

/*
1. 제네릭 메서드: 메서드 선언부에 타입 매개변수(예: <T>)를 정의해서 사용하는 메서드., 제네릭 클래스뿐 아니라 일반 클래스에서도 선언해서 사용 가능.
	- 타입 매개변수 선언
	<타입매개변수목록> 리턴타임 메서드명(매개변수목록) {...}
2. 제네릭 생성자: 생성자 자체에 제네릭 타입 매개변수를 선언한 경우. 주로 객체 생성 시 입력 값에 따라 타입을 유연하게 지정하고 싶을 때 사용.
	- 생성자 선언부: [접근제어자] [클래스이름] (매개변수 목록) 이 부분이 생성자 선언부. 즉, 생성자의 시그니처(이름 + 매개변수 리스트)
3. 제네릭 인터페이스: 인터페이스 정의 시 타입 매개변수를 포함하는 것. 구현 클래스에서 구체적인 타입을 지정하거나, 구현 클래스도 제네릭으로 남길 수 있음

*/
public class GenMethodTest {

	static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)		//==는 값을 비교하지 않고 객체의 참조를 비교
				return true;
		}
		return false;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "one", "two", "three", "four", "five" };

		boolean b1 = isInclude(3, inum);
		System.out.println("Result : " + b1);

		boolean b2 = isInclude(5.0, dnum);
		System.out.println("Result : " + b2);
		/*
		 * cf) == → 참조(주소) 비교 (원시타입은 값 비교지만, 객체 타입은 주소 비교) equals() → 값 비교 (래퍼 클래스는 내부 값
		 * 비교하도록 오버라이딩 되어 있음)
		 */

//		isInclude("one", snum);
		// T는 Number또는 Number를 상속하는 하위타입만 받겠다고 선언했고, V는 T 또는 T를 상속하는 타입만 받겠다고 선언했으므로 불가

		GenMethodTest.<Integer, Integer>isInclude(3, inum);
		GenMethodTest.<Double, Double>isInclude(5.0, dnum);
//		GenMethodTest.<String, String>isInclude("one", snum);
	}
}