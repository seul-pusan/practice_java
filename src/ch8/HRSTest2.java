package ch8; //p.351

// 다형성이 적용된 변수 사용 전 원래 타입을 파악해 활용하는 방법
public class HRSTest2 {
//instanceof 연산자: 타입확인
	public static void calcTax(Employee e) {
		if (e instanceof Salesman) {
			System.out.println("Salesman");
		} else if (e instanceof Manager) {
			System.out.println("Manager");
		} else if (e instanceof Consultant) {
			System.out.println("Consultant");
		} else {
			System.out.println("Employee");
		}
	}

	public static void main(String[] args) {
		// 세개의 클래스의 인스턴스 생성 후 참조변수에 각각의 주솟값 지정
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();

		//메서드 호출로 각각의 인스턴스의 주솟값 전달
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}
// 1. 매개변수의 ㅌ아비을 부모 타입으로 선언
// 2. instanceof 연산자를 사용해 타입 검사
// 3. 타입 변경 후 차별적인 작업 진행