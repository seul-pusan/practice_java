package ch8;// p. 382

enum Status {
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest01 {
	public static void main(String[] args) {
		Status work = null;
		int n = 2;
		
		switch (n) {
		case 1:
			work = Status.READY; // 변수 n 값에 따라 work변수에 클래스명.상수 형태로 값을 저장.
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}
		
		System.out.println("Working Status: " + work);

	}

}
