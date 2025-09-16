package ch5;

/* p.209
복합선언: 가변 길이 인자뿐만 아니라 다른 일반 인자도 함께 전달받는 메서드
*/
public class Test02 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("김푸름", 90, 95, 92);
		test("김하늘", 80, 98, 95);
	}

}
