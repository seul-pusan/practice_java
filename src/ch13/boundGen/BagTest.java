package ch13.boundGen; //p.627

/*
타입 매개변수
1. 멀티 타입 매개변수: 제네릭 클래스 선언시 타입 매개변수 여러 개 선언 가능. 콤마를 구분자로 사용. 객체를 생성할 때도 2개의 타입 인자를 지정해야 함.
	1) 참조변수 선언
	클래스명<타입인자목록> 변수명 = new 클래스명<타입인자목록>(생성자인자목록);
	
	2) 타입 제한
	<T extends superclass>
	
	3) 와일드카드
	
	4) 와일드카드 제한
		- 상위제한: <? extends 슈퍼클래스> -> 슈퍼클래스, 슈퍼클래스를 상속받은 하위 객체만 타입으로 지정 가능. 주로 데이터를 꺼낼 때(consume) 사용
		- 하위제한: <? super 서브클래스> -> 서브클래스, 서브클래스가 상속하고 있는 상위 객체만 타입으로 지정 가능. 데이터를 넣을 때(put) 유용
*/
class Bag<T extends Solid> {
	private T thing;
	private String owner;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}

	//p.631
	boolean isSameOwner(Bag<?> obj) {
		if (this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
}

class Solid {
}

class Liquid {
}

class Book extends Solid {
}

class PencilCase extends Solid {
}

class Notebook extends Solid {
}

class Water extends Liquid {
}

class Coffee extends Liquid {
}

public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag1 = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag1.setOwner("김푸름");
		bag2.setOwner("김푸름");
		bag3.setOwner("김푸름");
		

//			Bag<Water> bag4 = new Bag<>(new Water());		//오류 발생: 타입 매개변수에 Solid만 받겠다고 선언했기 때문
//			Bag<Coffee> bag5 = new Bag<>(new Coffee());		//오류 발생
		
		//p.631
		boolean result = bag1.isSameOwner(bag2);
		if(result) System.out.println("소유자 동일");
		else System.out.println("소유자 상이");
	}

}
