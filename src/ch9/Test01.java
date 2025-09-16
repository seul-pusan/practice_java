package ch9;//p.397
// Object Class

/*
자바 API(Application Programming Interface)

1. Object Class: 모든 자바 클래스의 상속 구조에서 가장 루트에 있는 클래스
1) 해시 코드
	hashCode(): 힙 메모리에 생성된 인스턴스의 주솟값을 가지고 일련번호를 만들어 반환하는 메서드
	hasCode()가 반환하는 일련번호를 Hash Code라고 함. 서로 다른 인스턴스는 해시 코드값이 같을 수 없음.
2) 클래스 정보
	getClass(): Class 타입의 인스턴스를 생성해 반환. 즉, 클래스에 대한 정보만 담는 객체를 새로 생성해 활용하고자 할 때 사용.
3) 문자열로 표현
	toString(): 인스턴스에 대한 정보를 문자열로 반환하는 메서드
	getClass().getName() + '@' + Integet.toHexString(hashCode())
	- getCalss(): 현재 클래스에 대한 정보를 가진 Class 객체 반환
	- Class의 getName()메서드는 현재 클래스의 이름 반환.
	- hashCode()의 메서드는 현재 인스턴스의 해시 코드값을 반환
	- Integet.toHexString() 메서드는 java.lang.Integer 클래스에서 static으로 선언된 메서드로서 인자로 전달된 int 값을 16진수 문자열로 변환하여 반환.
	- 반환 값들을 @로 연결
4) 같은지 비교
	equals(): 인자로 전달된 객체와 현재 객체가 같은 지를 !해시코드값! 기준으로 판단. 서로 다른 인스턴스들은 해시 코드값이 다르기 때문
*/

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		// p.399
		Class c = obj1.getClass();
		System.out.println(c.getName());

		// p.400
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		/*
		 * 두 명령문 결과 같음. 참조변수를 출력할 때 toString()메서드 명시하지 않으면 컴파일러가 자동으로 toString()메서드를
		 * 호출하는 코드로 변환.
		 */

		/*
		 * // p.402
		 * 
		 * MyObject obj4 = new MyObject(); System.out.println(obj4); MyObject obj5 = new
		 * MyObject();
		 * 
		 * // p.403 if (obj4.equals(obj5)) { System.out.println("Same Object"); } else {
		 * System.out.println("Different Object"); //서로 다른 주소에 위치한 객체들이므로 }
		 * 
		 * if (obj4 == obj5) { System.out.println("Same Object"); } else {
		 * System.out.println("Different Object"); //서로 다른 인스턴스 주솟값을 가지므로 }
		 */
		
		//p.405
		MyObject obj4 = new MyObject(123);
		MyObject obj5 = new MyObject(123);
		if (obj4.equals(obj5)) {
			System.out.println("Same Object");		
		} else {
			System.out.println("Different Object");		
		}

		if (obj4 == obj5) {
			System.out.println("Same Object");
		} else {
			System.out.println("Different Object");		//서로 다른 인스턴스 주솟값을 가지므로
		}
		

	}

}
