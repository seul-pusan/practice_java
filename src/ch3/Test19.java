package ch3; //p.105

public class Test19 {
	public static void main(String[] args) {
		// 점수가 60점 이상이면 "합격"을 출력
		int score = 90;

		String result = ""; // result 변수를 선언하면서 빈문자열로 출력. 즉, 처음엔 빈값으로 시작한다는 의미.

		/*
		 * if (score>=60) { result= "합격"; } System.out.println(result);
		 */

		if (score >= 60) {
			result = "pass";
		} else {
			result = "fail";
		}

		System.out.println(result);

		/*
		 * 위를 간단하게 쓴다면, System.out.println(score>=60 ? "합격":"불합격"); 다만, 삼항연산자 사용시 우선순위가
		 * 낮으므로 다른 연산자와 함께 사용할 때는 괄호()를 사용해 연산자의 우선순위를 높여야함
		 */

	}

}
