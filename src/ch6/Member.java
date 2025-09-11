package ch6;//p.244

public class Member {
	private String name;
	private int age;

	public Member() {
		// public:제어자
		// return type 누락
		// Member: 메서드 이름 대문자로 시작하지 않음
		// (): 매개변수 생략 가능
		// 메서드 이름과 클래스 이름이 같음 => 생성자(Constructor)

		// 생성자 특징
		// 형태는 메서드, 리턴타입 선언x, 소속된 클래스이름과 동일, 필드의 포기화 담당, 인스턴스 생성 시 자동으로 호출됨

		System.out.println("Member() 생성자 실행");

	}

	public Member(String name) {
		System.out.print("Member(Stirng) 생성자 실행 : ");
		System.out.println(name);
	}

	public Member(String name, int age) {
		System.out.print("Member(Stirng, int) 생성자 실행 : ");
		System.out.println(name + " : " + age);
	}

	public void setName(String name) {

	}

	// 이걸 적기 전까지는 :17생성자 실행 안뜸
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member();
		// 인스턴스 생성하는 명령문. 생성자는 인스턴스가 생성될 때 자동으로 한 번만 호출됨.
		// new: 힙에 멤버변수 생성, 생성자 호출. 기본 타입 필드는 0으로, 참조 타입 필드는 null로 초기화됨.
		// 모든 필드 생성이 완료되면 Member(): 호출되는 생성자.
		// 생성자 중 매개변수가 없는 생성자: 기본 생성자(default constructor)
		new Member("Amy");
		new Member("Amy", 23);
		//즉, new 명령문은 첫째 힙에 인스턴스를 생성하고 둘째는 객체 생성 시 지정한 인자값을 받아 처리할 수 있는 생성자 호출.
	}

}
