package ch3; //p.131

public class Test27 {
	public static void main(String[] args) {

		// for
		for (int i = 10; i < 10; i++) {
			System.out.println("for문 Finish");
		}

		// while
		int j = 10;
		while (j < 10) {
			System.out.println("while문 Finish");
			j++;
		}

		// do while
		int k = 10;
		do {
			System.out.println("do-while문 Finish");
			k++;
		} while (k < 10);
	}

}
