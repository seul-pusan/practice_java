package ch6;//p.239

public class StaticMethodTest {
	int num = 123;

	public static void main(String[] args) {
		StaticMethodTest.print1();
//		StaticMethodTest.print2(); //error reason: there is no static declaration

		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}

	// static 선언한 메서드: 클래스 메서드
	public static void print1() {
//		int num2=num; //error reason: 
		System.out.println("hello");
	}

	// static으로 선언하지 않은 메서드: 인스턴스 메서드
	public void print2() {
		int num3 = num;
		System.out.println("java");

	}
	// :16에서 error 나지만 :22에서 error 나지 않는 이유
	// print1()은 클래스 메서드이므로 실행 중에 num 필드 생성되어 있지 않음(num은 객체가 있어야만 존재)
	// print2()메서드 호출하기 위해 인스턴스를 생성할 때 선언한 num 필드도 함께 생성되기 떄문에 오류나지 않음

}
