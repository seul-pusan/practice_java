package ch7;

//public class Student {
//	private String name;
//	private int age;
//	private String major;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
//
//}

public class Student extends Person {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// p.282
//	public String toString() {
////		return name+":"+age+":"+major; → error reason: Person에서 private로 사용
//		return this.getName() + ":" + this.getAge() + ":" + major;
//	}

	// p.286
	public String toString() {
		return super.toString() + ":" + major;
	}
	
	public Student() {
		super();
		System.out.println("Student 생성자 실행!");
	}

	// p.291
	// Student s= new Student("김유빈", 20, "컴퓨터 과학")은 error.reason: 각 클래스에는 기본 생성자만
	// 있으므로 인자로 전달한 값을 받을 수 없음.
	// 이런 형태로 인스턴스를 생성하려면 다음처럼 인자값을 받는 매개변수가 선언된 생성자 필요
	public Student(String name, int age, String major) {
		super.setAge(age);
		super.setName(name);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행!");
	}
}