package ch7; //p.302

/*
public class Employee {
	String name;
	int salary;
	public void calcSalary();
}//오류
*/

// 추상클래스: 메서드 본문을 만들지 않겠다고 선언하는 것. 반드시 클래스 선언부에도 명시해야 함.
// 1. 메서드 선언 시 본문을 일부러 구현하지 않을 때 abstract 로 선언 필요
// 2. abstract로 선언한 메서드는 본문을 가질 수 없음
// 3. 추상 메서드를 포함하는 클래스는 선언부에 abstract를 명시해야 함
// 4. 추상 클래스는 하나 이상의 추상 메서드가 있다는 의미.

abstract class Employee2 {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
	// :22추가하는 순간 자식 클래스들에서 오류 발생. 즉, 추상 메서드는 메서드 본문을 구현하지 않았으므로 미완성 메서드이고, 이를 포함하는
	// 추상클래스 역시 미완성 클래스
	// 미완성 클래스를 상속받은 자식 클래스는 미완성 부분을 완성해야 함. 이는 자식 클래스에서 추상 메서드의 본문을 구현함으로써 해결 가능.
	// 즉, 오버라이딩 해주어야 함.
	// 만약, 오버라이딩하고싶지 않다면 자식 클래스도 추상클래스(abstract)를 선언해주면 됨.
	// 그렇게 되면 :74에 오류발생하게 됨. REASON: 추상클래스는 완전하게 설계된 클래스 아니므로 new 명령문으로 인스턴스 생성 불가.
}

class Salesman extends Employee2 {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}



	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급*12*4");
	}
}

class Consultant extends Employee2 {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컴설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급*12*2");
	}
}

abstract class Manager extends Employee2 {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급*12*6");
	}

}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager d = new Director();

		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
		System.out.println();
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
	}

}
