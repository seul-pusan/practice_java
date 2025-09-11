package ch7;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
	
//	public Person() {
//		System.out.println("Person 생성자 실행!");
//	}

}


// 자식                            상속한다      부모
//  Employee,Professor,Student   <-----    Person

//p.299
// final
// 1. final 제어자: 초기화된 변숫값 수정할 수 없도록 제한. 변수 이름은 반드시 대문자 사용!!!
//초깃값 변경하지 않고 그대로 사용하기 위해, 파이같은 수학적 값 사용 위해, 주민번호/학번과 같은 유일 값 사용 위해
// 2. final 메소드: 오버라이딩할 수 없도록 제한. 
// 3. final 클래스: 클래스를 상속할 수 없도록 제한.