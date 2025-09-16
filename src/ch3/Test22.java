package ch3; //p.110

public class Test22 {
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op = '*';

		switch (op) {
		case '+':
			System.out.println(a + b);
		case '-':
			System.out.println(a - b);
		case '*':
			System.out.println(a * b);
		case '/':
			System.out.println(a / b);
		}
	}
}

/*
 * switch~case 문은 일치하는 값을 발견하면 해당 case문으로 이동해 명령문을 실행한 다음, 그 아래에 작성된 case문의 명령문을
 * 차례대로 모두 실행. 즉, 조건과 같은 값을 찾으면 해당 case문부터 그 아래에 있는 case문을 조건에 상관없이 모두 실행.
 * 
 * 이때, break;를 만나면 나머지 case문을 실행하지 않고 switch~case문을 빠져나오는 것 확인 가능
 */
