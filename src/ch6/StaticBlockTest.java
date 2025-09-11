package ch6;//p.243

public class StaticBlockTest {
	static {
		System.out.println("hello");
		System.out.println("java");
	}
	public static void main(String[] args) {
		System.out.println("world!!");
	}

}

// 정적 코드블록 또한 정적 멤버처럼 main()메서드가 실행되기 전에 딱 한번 실행됨.
//따라서 static으로 선언한 클래스 필드를 초기화하거나 프로그램이 실행될 때 먼저 처리해야 하는 작업을 정적 코드 블록에 작성