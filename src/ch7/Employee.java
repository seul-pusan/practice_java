package ch7;

//public class Employee {

//	private String name;
//	private int age;
//	private String dept;
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
//	public String getDept() {
//		return dept;
//	}
//
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//
//}

public class Employee extends Person {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// p.282
//	public String toString() {
////		return name+":"+age+":"+dept; → error reason: Person에서 private로 사용
//		return this.getName() + ":" + this.getAge() + ":" + dept;
//	}

	// p.286
	public String toString() {
		return super.toString() + ":" + dept;
	}
	public Employee() {
		super();
		System.out.println("Employee 생성자 실행!");
	}

	// p.291
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}
}