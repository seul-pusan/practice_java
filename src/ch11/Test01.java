package ch11; //p.532

/*
예외 처리하는 이유: 오류가 발생해도 프로그램이 강제로 중단되지 않도록

자바 예외 API: 
java.lang의 Throwable 클래스: 오류에 관련된 최상위 객체 그 밑에 Exception과 Error로 구분됨
	- Exception: 프로그램 내에서 발생하는 예외. 프로그램 내에서 처리 가능 → 우리가 프로그램 구현시 처리할 수 있는 오류
		- 미확인 예외: RuntimeException과 직간접적으로 관련된 객체들로서 잘못 구현된 프로그램 코드 때문에 발생
		Ex) 배열에서 존재하지 않는 인덱스에 접근, 어떤 수를 0으로 나눌 때 발생하는 오류
		- 확인된 예외: RuntimeException과 관련 없는 객체들로서 프로그램 내에서 통제할 수 없는 조건으로 인해 발생. 이에 대한 예외 처리 구현하지 않으면 컴파일 시 오류 발생
		Ex) 존재하지 않는 외부 파일 사용
		
		대표적 종류
		NullPointerException: 참조변수가 null값을 가지는 상태에서 참조변수를 통해 변수에 접근 또는 메서드를 호출하는 예외가 정의된 객체
		ArithmeticException: 어떤 수를 0으로 나누는 등과 같은 산술 연산에 관련된 예외가 정의된 객체
		
	- Error: JVM 내에서 발생하는 에러. 프로그램 내에서 처리 불가
	
예외 처리 방법
1. try-catch문
- 예외 처리 메서드
- finally 문: catch 문 다음에 선언. try 블록에서 사용했던 자원 해제
- try with resources
*/
public class Test01 {
	public static void main(String[] args) {

		try {
			// p.540
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();

			// p.539
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("잘못된 배열의 인덱스 사용!");
		} catch (NullPointerException e2) {
//			System.out.println("잘못된 참조!");
			// p.542
			e2.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}

		System.out.println("GOOD");
	}

}
