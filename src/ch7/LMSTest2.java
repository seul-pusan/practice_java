package ch7; //p.291

public class LMSTest2 {
	//생성자 오버로딩
	
	public static void main(String[] args) {
		Employee e= new Employee("오정임", 47, "입학처");
		Professor p= new Professor("김푸름", 52, "빅데이터");
		Student s= new Student("김유빈", 20, "컴퓨터 과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
