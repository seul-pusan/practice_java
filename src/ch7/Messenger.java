package ch7; //p.311

public interface Messenger {
	// 1. field declaration
	// 별도의 선언 없어도 컴파일 시 컴파일러가 필드 선언부에 public, static, final 세 제어자가 자동으로 추가됨
	// 즉, 누구나 접근하여 사용 가능, 인스턴스 생성 없이 사용 가능, 초기화된 값 변경불가
	// final이기 떄문에 필드이름은 대문자로 해야함
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;

	// 2. method declaration
	// 컴파일 시 public abstract가 자동으로 추가됨.
	// 인터페이스에 선언하는 메서드는 실제 내용을 구현할 목적이 아니라 인터페이스 통일을 목적으로 선언하는 것이므로 본문을 구현하지 않음.
	public abstract String getMessage();
	public abstract void setMessage(String msg);

	// 3. default method declaration
	// 인터페이스를 사용하는 모든 클래스에서 공통으로 갖는 기능을 구현할 목적으로 사용
	// public 접근 제한자는 생략해도 컴파일 시 자동으로 추가됨.
	// 하나의 클래스에서 클래스는 단일 상속만 가능하지만, 인터페이스는 여러 개를 구현할 수 있음.
	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다.");
		}
	}
	
	// 4. static method declaration
	// static으로 선언된 메서드는 프로그램 시작 시 메모리에 사용준비 완료. 따라서 인스턴스 생성과 상관없이 바로 사용 가능.
	// public 접근 제한자 생략해도 컴파일 시 자동으로 추가됨.
	public static void getConnection() {
		System.out.println("networkd connection");
	}

	
	// 5. private method declaration
	// 외부에서 접근할 수 없도록 접근 제한. 동일한 인터페이스에서 선언된 default 메서드에서만 사용할 목적으로 본문을 구현하는 메서드
	private void log() {
		System.out.println("start job!");
	}

}


// Java 8 이전: 인터페이스에는 abstract 메서드(선언만)만 가능
// Java 8: default 메서드, static 메서드 도입
// 문제점: default 메서드 안에서 공통적으로 쓰이는 코드를 넣고 싶어도, 중복해서 직접 작성해야 했음

//Ex) interface MyInterface {
//    default void method1() {
//        System.out.println("공통코드 A");
//        System.out.println("method1 내용");
//    }
//
//    default void method2() {
//        System.out.println("공통코드 A");
//        System.out.println("method2 내용");
//    }
//}
//=> 공통코드 A 부분이 계속 반복됨


//Java 9: 인터페이스 내부에서만 쓸 수 있는 메서드를 만들 수 있음. default나 static 메서드 안에서만 호출 가능. 외부 클래스에서는 절대 접근 불가

//Ex) interface MyInterface {
//
//    default void method1() {
//        common();  // private 메서드 호출
//        System.out.println("method1 내용");
//    }
//
//    default void method2() {
//        common();  // private 메서드 호출
//        System.out.println("method2 내용");
//    }
//
//    // 공통 코드 → 외부에 보이고 싶지 않음
//    private void common() {
//        System.out.println("공통코드 A");
//    }
//}












// 인터페이스 상속
// 제어자 class 클래스명 extends 부모클래스명 implements 인터페이스명 {}
//클래스에서 인터페이스 상속 시 implements 사용해 선언