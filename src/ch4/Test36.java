package ch4;

public class Test36 {
	public static void main(String[] args) {
		char letter = 'A';			// char 타입(문자의 유니코드 값을 저장하는 데이터 타입)의 변수를 letter로 지정하고 초기값을 A로 저장
		char[] alphabet = new char[26];			//

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i);		//연산 결과를 char타입으로 강제로 casting 
		}

		for (char c : alphabet) {		//alphabet 배열 안에 있는 요소들을 하나씩 꺼내서 c라는 변수에 담습니다
			System.out.println(c);
		}
	}

}
