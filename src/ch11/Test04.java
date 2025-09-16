package ch11;

import java.io.FileInputStream;

/*
예외 처리 방법
2. throw 문
- 메서드를 호출하는 곳의 상황에 맞게 동적인 오류 처리를 하기 위해 사용하는 명령문
*/

public class Test04 {
	public static void main(String[] args) {
		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println((char) c);
	}

}
