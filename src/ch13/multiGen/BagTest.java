package ch13.multiGen; //p.623
/*
타입 매개변수
1. 멀티 타입 매개변수: 제네릭 클래스 선언시 타입 매개변수 여러 개 선언 가능. 콤마를 구분자로 사용. 객체를 생성할 때도 2개의 타입 인자를 지정해야 함.
	1) 참조변수 선언
	클래스명<타입인자목록> 변수명 = new 클래스명<타입인자목록>(생성자인자목록);
	
	2) 타입 제한
	<T extends superclass>
	
	3) 와일드카드
	
	4) 와일드카드 제한
		- 상위제한: <? extends 슈퍼클래스> -> 슈퍼클래스, 슈퍼클래스를 상속받은 하위 객체만 타입으로 지정 가능
		- 하위제한: <? super 서브클래스> -> 서브클래스, 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정 가능
*/
class Bag<T, N> {
	private T thing;
	private N name;

	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
		System.out.println("N의 타입은 " + name.getClass().getName());
	}
}

class Book {
	public String toString() {
		return "책";
	}
}

class PencilCase {
}

class Notebook {
}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book, String> bag = new Bag<Book, String>(new Book(), "과학");
		bag.showType();

		Book book = bag.getThing();
		String name = bag.getName();

		System.out.println("Thing is : " + book);
		System.out.println("Name is : " + name);
	}

}
