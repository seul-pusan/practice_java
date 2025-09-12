package ch8;

//p. 383
enum Mandarin {
	금귤, 한라봉, 레드향, 천혜향, 황금향;
}

//p. 385
enum Mandarin2 {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	Mandarin2(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class EnumTest02 {
	public static void main(String[] args) {

		// p. 383
		Mandarin ma = Mandarin.한라봉;

		System.out.println("name: " + ma.name());
		System.out.println("location: " + ma.ordinal()); // 열거 상수의 선언된 순서 반환
		System.out.println("황금향과의 상대 위치: " + ma.compareTo(Mandarin.황금향)); // 전달한 상수 기준으로 ma 변수가 가지는 상수가 어느 위치에 있는지
																			// ex)-2: 2번째 앞

		Mandarin ma2 = Mandarin.valueOf("레드향"); // 전달한 문자열과 동일한 열거 상수를 찾아 열거형 클래스 타입으로 반환
		System.out.println(ma2);

		Mandarin list[] = Mandarin.values(); // Mandarin에 선언된 열거 상수 모두를 Mandarin객체로 생성해 배열로 반환
		System.out.println("==귤의 종류==");
		for (Mandarin m2 : list)
			System.out.println(m2);

		System.out.println();
		// p. 385
		Mandarin2 ma3 = Mandarin2.한라봉;
		if (ma3 == Mandarin2.한라봉)
			System.out.println("ma is 한라봉");
		System.out.println(ma3 + " price:" + ma3.getPrice());

		Mandarin2 list2[] = Mandarin2.values();
		System.out.println("==귤의 종류==");
		for (Mandarin2 m3 : list2)
			System.out.println(m3 + ":" + m3.getPrice());
	}

}
