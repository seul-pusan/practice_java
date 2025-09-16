package ch3; //p.135

// 제어문 중첩 - if문
public class Test30 {
	public static void main(String[] args) {
		int i = 5;
		if ((i % 2) == 0) {
			System.out.println(i + "는 2의 배수"); // 첫번째 조건식의 검사 결과가 거짓이면 두 번째 조건식은 검사조차 하지 않고, 만약 참이면
		}
		if ((i % 3) == 0) {
			System.out.println(i + "는 3의 배수"); // 두 번째 조건식도 검사해서 이후 실행문을 실행할 지 결정.
		}

	}
}
