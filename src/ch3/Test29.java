package ch3; //p.134

public class Test29 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {	//2. true인 값만 i++
			if ((i % 2) == 0)			//1. i를 2로 나눈 나머지값이 0이면 true
				continue;
			System.out.println(i);
		}
	}

}
