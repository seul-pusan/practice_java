package ch13; //p.612

/*
제네릭= 매개변수 타입(parameter type): 소스에서 데이터 타입을 프로그래밍할 때 결정하는 것이 아니고, 실행할 때 결정하게 하는 것.
즉, 데이터 타입을 매개변수로 지정하는것.
타입 매개변수: 실행 시 인자로 전달하는 타입을 변수의 타입으로 지정하는 것. 클래스, 인터페잇, 메서드에서 사용할 수 있음. 타입 매개변수로 전달되는 값을 타입 인자라고 함.

장점: 불필요한 타입 변경을 없애, 엄격한 타입 검사를 통해 안전성 높여줌

1. 제네릭 클래스
	1) 선언
	class 클래스명<타입매개변수> {
		}
		
	2) 인스턴스 생성: 동적으로 코드를 재사용 가능. 타입인자 생략 시 컴파일러가 자동으로 생성자의 인자로 전달되는 객체의 타입으로 지정
	new 클래스명<타입인자> ();
	
	3) 참조
	클래스명<타입 인자>

*/
class Bag<T> { // 클래스 이름 다음에 <T>를 붙여 제네릭 클래스로 선언. T라는 타입 매개변수를 가짐. Bag에 선언되는 모든 T는 인스턴스 생성 시
				// 전달되는 타입으로 변경

	private T thing;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() { // 인스턴스 타입 출력 메서드
		System.out.println("T의 타입은 " + thing.getClass().getName()); // thing의 타입 출력
	}
}

class Book {		//Bag이 제네릭이어서 Book, PencilCase, Notebook 같은 일반 클래스도 타입 매개변수 자리(T)에 들어갈 수 있는 것
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		Bag<Book> bag1 = new Bag<>(new Book()); // bag1은 제네릭 타입으로 Book을 포함하는 Bag 객체를 참조하는 변수.
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase()); // new Bag<>은 제네릭 클래스의 인스턴스를 생성하는 명령문. T가 모두 PencilCase로
															// 대체됨.
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag1.showType();
		bag2.showType();
		bag3.showType();

//		bag1 = bag2; // 오류 발생!! => 엄격한 타입 검사를 통해 안전성 높여줌
	}

}
