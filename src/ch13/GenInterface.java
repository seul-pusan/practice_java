package ch13;

interface Maximun<T extends Comparable<T>> {		//제네릭 인터페이스 선언. Comparable을 상속받는 타입만 전달 가능.
	T max();		//Comparable<T> java.lang에 제네릭 인터페이스로서 compareTo(T o)메서드가 선언됨.
}

class NumUtil<T extends Comparable<T>> implements Maximun<T> {		// 제네릭 클래스 선언. 타입 매개변수 T extends Comparable<T>. 제네릭 인터페이스 implements Maximun<T>
	T[] value;

	NumUtil(T[] value) {		//제네릭 생성자 선언. 매개변수로 전달받은 배열을 value필드에서 참조
		this.value = value;
	}

	public T max() {
		T v = value[0];		//변수 v에 value배열의 첫번째 값 저장. 값을 하나씩 비교해 큰 값을 v변수값에 저장.

		for (int i = 0; i < value.length; i++) {
			if (value[i].compareTo(v) > 0)		// compareTo(): 현재 객체와 매개변수로 전달받은 객체의 순서를 비교해 작으면 음수, 같으면 0, 크면 양수를 반환
				v = value[i];
		}
		return v;
	}
}

public class GenInterface {

	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };

		NumUtil<Integer> iutil = new NumUtil<Integer>(inum);		//타입 매개변수를 Integer로 지정하는 제네릭 클래스의 인스턴스 생성
		NumUtil<Double> dutil = new NumUtil<Double>(dnum);
		NumUtil<String> sutil = new NumUtil<String>(snum);

		System.out.println("inum 최대값: " + iutil.max());
		System.out.println("dnum 최대값: " + dutil.max());
		System.out.println("snum 최대값: " + sutil.max());
	}

}
