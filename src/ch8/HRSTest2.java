package ch8; //p.351

// 다형성이 적용된 변수 사용 전 원래 타입을 파악해 활용하는 방법
public class HRSTest2 {
//instanceof 연산자: 참조변수가 참조하는 인스턴스의 타입 검사하는 연산자로서 if 문과 함께 사용
// 사용이유: 다형성으로 인해 여러 타입이 전달될 수 있으므로 각각의 인스턴스 타입에 따라 서로 다른 작업을 하기 위해서
// 1. 매개변수의 타입을 부모 타입으로 선언
// 2. instanceof 연산자를 사용해 타입 검사
// 3. 타입 변경 후 차별적인 작업 진행
	public static void calcTax(Employee e) {
		// instanceof 연산자 이용해 매개변수 e에 저장된 인슨턴스 타입을 확인, true일 때 확인 문자열 출력
		if (e instanceof Salesman) {
//			System.out.println("Salesman");
//			System.out.println(e.annual_sales);// error reason: 다형성.

			// 3. 원래 인스턴스의 타입으로 변경(type casting)
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			//위 두 줄을 한줄로 하면
			//((Salesman).e).annual_sales=6500000
			System.out.println("Salesman: " + s.annual_sales);

		} else if (e instanceof Manager) {
//			System.out.println("Manager");
//			System.out.println(e.num_team);

			// 3. 원래 인스턴스의 타입으로 변경(type casting)
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager: " + m.num_team);

		} else if (e instanceof Consultant) {
//			System.out.println("Consultant");
//			System.out.println(e.num_project);

			// 3. 원래 인스턴스의 타입으로 변경(type casting)
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant: " + c.num_project);

		} else {
			System.out.println("Employee");
		}
	}

	public static void main(String[] args) {
		// 세개의 클래스의 인스턴스 생성 후 참조변수에 각각의 주솟값 지정
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();

		// 메서드 호출로 각각의 인스턴스의 주솟값 전달
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}
