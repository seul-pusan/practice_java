package ch8;
//chatGPT example

class Animal {
	void sound() {
		System.out.println("동물이 소리를 낸다");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍!");

	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야용!");
	}

}

public class Polymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal d = new Dog(); // 업캐스팅
		Animal c = new Cat(); // 업캐스팅

		a.sound();
		d.sound();
		c.sound();

	}

}
