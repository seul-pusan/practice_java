package ch5;

/* p.204
method overloading: 같은 기능을 수행하는 메서드를 이름을 같게, 매개변수 구성만 다르게 해서 선언하는 것.
오버라이딩 메서드 호출 시 매개변수 개수는 인자값이 개수와 반드시 일치해야하며, 
매개변수 타입은 인자값의 타입과 일치해야함. 단, 타입이 달라도 인자값의 타입보다 더 큰 타입으로 선언될 시엔 가능.
*/

/* p.208
가변 길이 인자: 메서드 호출 시 자동으로 배열 생성(타입은 선언된 타입으로 지정됨). 배열에 인자값들을 저장한 후 배열로 처리함(크기는 인자의 개수와 동일).
1. 가변 길이 인자를 매개변수와 다른 매개변수를 함께 선언할 때는 가장 마지막에 선언해야 함.(중간에 선언 시 오류 발생)
2. 가변길이 인자를 받는 매개변수는 한 번만 선언 가능
*/
public class Test01 {
	static void test(int... v) {
		System.out.print(v.length + " : ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}

}
