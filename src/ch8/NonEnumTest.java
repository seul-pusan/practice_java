package ch8; // p. 379

// 열거형 클래스
// 프로그램 구현 시 고정된 데이터 값을 사용할 때
// 일반적으로 public static final 로 상숫값을 선언하여 사용.


// 위를 짧고 의미 강하게 나타내야 가독성 좋아짐 
// class 대신 enum 사용 → 열거 상수(enumeration constants)
// 열거상수는 자동으로 public static final 선언되므로 별도 지정하지 않아도 됨.

//enum Status {
//	READY, SEND, COMPLETE, CLOSE
//}

//public class NonEnumTest {
//	public static void main(String[] args) {
//		int work = 0;
////		Status work = null;
//		int n = 4;
//
//		switch (n) {
//		case 1:
//			work = Status.READY;
//			break;
//		case 2:
//			work = Status.SEND;
//			break;
//		case 3:
//			work = Status.COMPLETE;
//			break;
//		case 4:
//			work = Status.CLOSE;
//			break;
//		}
//		System.out.println("Working Status: " + work);
//	}
//
//}
