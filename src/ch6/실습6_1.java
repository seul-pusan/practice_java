package ch6;

// 필드 선언
class Student1 {
	private String name;
	private int age;
	private String[] subjects;
	private int[] scores;

	public Student1(String name, int age, String[] subjects, int[] scores) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
	}

	public void printStudent() {
		System.out.println(
				"이름 = " + name + ", 나이 = " + age + '\n'
				+"과목1 = "+ subjects[0] + ", 점수1 = " + scores[0] + '\n'
				+"과목2 = "+ subjects[1] + ", 점수2 = " + scores[1] + '\n'
				+"과목3 = "+ subjects[2] + ", 점수3 = " + scores[2] + '\n'
				+"과목4 = "+ subjects[3] + ", 점수4 = " + scores[3] + '\n'
				+"과목5 = "+ subjects[4] + ", 점수5 = " + scores[4] + '\n'
				);
	}

}

public class 실습6_1 {

	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };

		Student1[] students = { makeStudent("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }),
				makeStudent("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }),
				makeStudent("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }),
				makeStudent("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }),
				makeStudent("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }) };

		showStudents(students);
	}

	private static void showStudents(Student1[] students) {
		for (Student1 s:students) {
			s.printStudent();
		}
		
	}

	private static Student1 makeStudent(String name, int age, String[] subjects, int[] scores) {
		Student1 s = new Student1(name, age, subjects, scores);
		return s;
	}
	
}
