package ch13.nonGen; //p.620

class Bag {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		Bag bag1 = new Bag(new Book());
		Bag bag2 = new Bag(new Book());
		Bag bag3 = new Bag(new Book());

		Book book = (Book) bag1.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();

		bag1 = bag2; // 오류 발생 X
	}

}
