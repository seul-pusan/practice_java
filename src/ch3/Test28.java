package ch3; //p.132

public class Test28 {
	public static void main(String[] args) {
		int cnt = 0;
		while (true) {
			System.out.println("Finish");
			cnt = cnt + 2;				//cnt의 값이 반복문을 실행할 때마다 2씩 증가
			if (cnt == 10) {
				break;
			}
		}

	}

}
