package ch7;

//public class Professor {
//	private String name;
//	private int age;
//	private String subject;
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
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//
//}

public class Professor extends Person {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// p.282
//	public String toString() {
////		return name+":"+age+":"+subject; → error reason: Person에서 private로 사용
//		return this.getName() + ":" + this.getAge() + ":" + subject;
//	}
	
	// p.286
	public String toString() {
		return super.toString() + ":" + subject;
	}
	public Professor() {
		super();
		System.out.println("Professor 생성자 실행!");
	}
	
	// p.291
	public Professor(String name, int age, String subject) {
		super.setAge(age);
		super.setName(name);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행!");
	}
}