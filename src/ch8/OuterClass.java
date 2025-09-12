package ch8;

// 내부클래스 종류 
// 1. 인스턴스 멤버 클래스(가장 일반적)
// : 자신이 속한 외부 클래스의 인스턴스를 통해서만 접근 가능하며, static 키워드가 붙지 않음.

// 2. 정적 멤버 클래스
// : static 은 공유에 목적이 있음.
// 따라서 클래스 선언 시 static 으로 선언된 필드, 메서드, 클래스는 main() 메서드가 실행되기 전 메모리에 사용 준비가 완료됨.

// 3. 로컬 클래스
// : 메서드에 사용하기 위해 메서드 내에 선언하는 내부 클래스.
// 즉, 메서드 내부에서만 사용하므로 내부 클래스 선언 시 접근제한자 지정 불가, 메서드 내에서 일반 인스턴스를 생성하듯이 생성
// 필드와 메서드를 static 으로 선언 불가

public class OuterClass {
	// p.368
	// 1. 인스턴스 멤버 클래스
	class InstanceClass {
		int a; // 필드 a

		void method2() { // 메서드 method2()
			System.out.println("Instance Class : " + a);
		}
	}

	// p.372
	// 2. 정적 멤버 클래스
	static class StaticClass {
		int b;
		static int c;

		void method3() {
			System.out.println("Static Class : " + b);
		}

		static void method4() {
			System.out.println("Static Class : " + c);
		}
	}

	// p. 373
	// 3. 로컬클래스
	public void method1() {
		class LocalClass {
			int d;

			void method5() {
				System.out.println("Local Class : " + d);
			}
		}

		LocalClass inner = new LocalClass();
		inner.d = 1004;
		inner.method5();
	}
}
