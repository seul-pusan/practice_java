package ch6;//p.265

//소스코드를 더 쉽게 이해할 수 있고 쉽게 수정할 수 있도록 변경하는 것: 리팩토링(refactoring)
public class Member2 {
	private String name;
	private int age;

	public Member2() {
		this("guest");
	}

	public Member2(String name) {
		this(name, 0);
	}

	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " : " + age;
	}

	public static void main(String[] args) {
		Member2 m1 = new Member2();
		Member2 m2 = new Member2("Amy");
		Member2 m3 = new Member2("Amy", 23);

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}

//생성자 호출 시 주의사항
//호출문 this()는 생성자에서만 사용할 수 있고, 생성자 내에서 가장 첫번째 줄에 위치해야함. 

//JVM이 메모리에서 변수를 검색하는 순서: 현재 실행 중인 메서드의 스택 영역을 검색. 스택에서 찾지 못하면 this가 참조하는 인스턴스의 필드 검색.
//즉, 새로운 메서드 실행 시 스택에 새로운 프레임 생성되고 this변수가 자동으로 선언됨. this변수에는 메서드를 호출한 이스턴스의 주솟값이 저장됨. 