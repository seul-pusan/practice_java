package ch8;

public class OuterClassTest {
	public static void main(String[] args) {

		// p.370
		// 1. 인스턴스 멤버 클래스
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		inner01.a = 123;
		inner01.method2();

		// p.372
		// 2. 정적 멤버 클래스
		// 외부클래스명.내부클래스명 생성 후 참조변수를 선언해 참조
		// 참조변수의 타입 역시 외부클래스명.내부클래스명.
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		inner02.b = 456;
		inner02.method3();

		// 외부 클래스명.내부클래스명.멤버 형태로 접근가능
		OuterClass.StaticClass.c = 789;
		OuterClass.StaticClass.method4();

		// p. 373
		// 3. 로컬클래스
		// 로컬클래스 사용하려면 로컬클래스가 선언된 메서드를 사용할 수 있도록 외부 클래스를 생성해야 함.
		outer.method1();
	}

}
