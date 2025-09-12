package ch8;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales; // 연간 판매실적 추가 p.353

	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급*12*4");
	}
}

class Consultant extends Employee {
	int num_project; // 컨설팅 참여 수 추가 p.353

	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컴설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급*12*2");
	}
}

class Manager extends Employee {
	int num_team; // 관리 팀 수 추가 p.353

	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급*12*6");
	}
}

//p.328
//public class HRSTest {
//	
//	//ch8
//	public static void calcTax() {
//		// 인자로 전달된 인스턴스의 소득세 계산
//	}
//
//	public static void main(String[] args) {
//		Salesman s = new Salesman(); // Salesman 소득세 계산
//		Consultant c = new Consultant(); // Consultant 소득세 계산
////		Director d = new Director(); // Director 소득세 계산
//
//		s.calcBonus();
//		c.calcBonus();
////		d.calcBonus();
//
//	}
//}

//만약 세율이나 객체를 더 생성하게 되면 이런식으로 구현하는 것은 비효율적이며 안전성에 문제가 있음. => 다형성 적용
//s, c, d는 모두 Employee의 자손이라는 공통점 존제. 따라서 각 객체를 조상의 타입에 대해 사용(선언)하면 자손의 타입마다 매개변수를 달리해서 메서드를 오버로딩할 필요 없음.
//즉, claTax(s), claTax(c), claTax(d)로 호출하면 모두 claTax(Employee e)가 호출되도록 통일됨
//public static void calTax(Employee e) {
//	}
//동적바인딩: 실행시간에 메소드이륙 -> 메소드 body를 결정하는 것을 바인딩(binding)이라 함

//p.332
//public class HRSTest {
//	
//	//ch8
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
//
//	public static void main(String[] args) {
//		Salesman s = new Salesman(); // Salesman 소득세 계산
//		Consultant c = new Consultant(); // Consultant 소득세 계산
//		Director d = new Director(); // Director 소득세 계산
//
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
//	}
//}

// 다형성: 하나의 타입(조상 클래스 타입의 참조변수)으로 여러 타입(자손 클래스 객체)을 참조할 수 있으며, 실제 실행 시점에는 참조변수가 가리키는 객체의 타입에 따라 재정의된 메서드가 호출되는 성질.
// 그럼 Employee는 어떤 클래스도 상속 받지 않는데? 즉, extend 키워드가 선언되지 않음. 이땐, 컴파일 시 자동으로 extend Object 코드가 삽입됨.
// 그렇다면 Object는 어떤 클래스? 자바클래스의 상속 구조에서 최상위 클래스. 결국, 모든 자바 클래스는 Object의 자손임.
// 근데 Object를 만든적이 없는데? JDK에서 Object 클래스 제공함. 

//p.338
//public class HRSTest {
//
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
//
//	public static void main(String[] args) {
//		Salesman s = new Salesman(); // Salesman 소득세 계산
//		Consultant c = new Consultant(); // Consultant 소득세 계산
//		Director d = new Director(); // Director 소득세 계산
//
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		// toString() method도 Object의 자손임.
//
//		if (s.equals(c)) {
//			System.out.println("동일한 객체입니다.");
//		} else {
//			System.out.println("서로 다른 객체입니다.");
//		}
//
//	}
//}
//
//바인딩: 메서드 호출이 실제 어떤 코드와 연결될지 결정하는 것
//정적 바인딩(compile-time binding): 컴파일 시점에 이미 호출할 메서드가 결정됨. (예: private, static, final 메서드 → 오버라이딩 불가)
//동적 바인딩(run-time binding): 실행 시점에 객체의 실제 타입을 보고 어떤 메서드를 실행할지 결정.(다형성의 핵심!)

//p.340
//public class HRSTest {
//
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
//
//	public static void main(String[] args) {
//		Salesman s = new Salesman(); // Salesman 소득세 계산
//		Consultant c = new Consultant(); // Consultant 소득세 계산
//		Director d = new Director(); // Director 소득세 계산
//
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		// toString() method도 Object의 자손임.
//		
//		Salesman s2= s; //새로운 참조변수 s2선언 후 참조변수 s의 값을 s2에 저장. 결국 s도 s2도 같은 인스턴스를 참조
//		System.out.println(s2.toString());
//
//		if (s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//		} else {
//			System.out.println("서로 다른 객체입니다.");
//		}
//
//	}
//}
// Object 클래스의 toString() 메서드는 인스턴스의 고유한 식별자 반환
// equals() 메서드는 두 개의 참조변수가 같은 인스턴스 참조인ㄴ지를 판다. 
// 만약, Object 클래스에서 상속받은 toString(), equals() 메서드의 처리 기능을 변경하고 싶다면 자손 객체에서 오버라이딩하면 됨.

//p.346
public class HRSTest {

	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {
		Salesman s1 = new Salesman(); // Salesman 소득세 계산
		Employee s2 = new Salesman(); // Consultant 소득세 계산
		Object s3 = new Salesman(); // Director 소득세 계산

		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
//		Director m4= new Manager(); //오류발생

		// 배열을 이용해서 타입이 같은 여러 값을 하나도 묶어 저장.
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
//업캐스팅 + 메서드 오버라이딩 + 실행 시점 동적 바인eld
//※ 다형성은 직계존속만 가능. (자손의 타입으로 선업된 참조변수에 부모의 주소를 저장할 수는 없음)
