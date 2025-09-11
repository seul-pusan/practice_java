package ch7; //p.278

public class LMSTest {
//	public static void main(String[] args) {
//		Employee e = new Employee();
//		Professor p = new Professor();
//		Student s = new Student();
//
//		e.setName("오정임");
//		e.setAge(47);
//		e.setDept("입학처");
//		// e 인스턴스의 toString() 메서드를 실행한 후 리턴된 값을 출력
//
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
//
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("컴퓨터과학");
//
//		System.out.println(e.toString());
//		System.out.println(p.toString());
//		System.out.println(s.toString());
//		
//		//super: 부모 클래스의 원본 메서드를 직접 호출할 수 있게 하는 키워드. super는 부모 클래스를 나타내는 키워드. super.메서드명(인자)로 사용
//	
//
//	}

}

// Method Overriding : 상속받은 메소드의 내용을 재정의하는 것
// ※주의 사항
// 1. 메서드 오버라이딩은 상속한 메서드의 본문만 변경가능
// 2. 메서드 오버라이딩은상속한 메서드의 선언부 변경 불가
// 3. 메서드를 오버라이딩할 때 접근 제한자는 부모의 메서드와 같거나 넓은 범위로만 변경 가능
// 4. 프로그램 실행 시 메서드 호출 순위는 오버라이딩한 메서드가 부모의 메서드보다 높다. 즉, 자식의 메서드가 더 높다.

// 참고) 접근 제한자 범위 private < (default) < protected < public

// 참고) Overriding vs Overloading
// Overriding: 상속받은 메소드의 내용 재정의
// Overloading: 매개변수가 다른 동일한 이름의 메소드를 중복해서 정의하는 것.


//P.290
// 1. 모든 클래스는 생성자가 반드시 존재. → 개발자가 명시하지 않으면 컴파일러가 내용이 비어 있는 기본 생성자 생성
// 2. 자식 클래스의 모든 생성자에는 첫번쨰 줄에 super()문이 자동으로 추가됨. → 단, 생성자에서 super()문을 사용하지 않았을때만 자동으로 추가됨.
// 3. 따라서 자식 클래스의 인스턴스를 생성할 때 부모 클래스의 생성자도 함께 호출됨.
