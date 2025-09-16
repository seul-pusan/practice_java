package ch8; //p.362
// 내부 클래스(Inner Class): 클래스 안에 선언된 클래스

// 외부 클래스(Outer Class): 내부 클래스를 멤버로 포함하는 클래스
// 제어자 class 클래스명 { <- 외부 클래스
//	필드선언;
//	생성자선언
//	메서드선언
//	클래스선언 <- 내부클래스
//}

public class MyLinkedList {
	// Node 타입의 필드 head 사용. 따라서 Node 클래스 선언 필요.
	// 만약 Node 클래스가 오직 MyLinkedList 클래스에서만 사용한다고 가정하면, Node 클래스를 독립적인 클래스로 선언하는 건
	// 비효율적
	// 즉, 특정 클래스에서만 사용할 클래스를 독립적인 클래스로 구현하다보면 관리가 어렵고 유지보수가 어려워짐
	// 따라서 클래스 내에 중첩해서 두 클래스가 서로 멤버들에 쉽게 접근할 수 있고 관계가 명확해짐으로써 관리가 쉬워짐
	// 내부 클래스는 외부 클래스를 컴파일하면서 자동으로 컴파일되며, 외부클래스에 종속적으로 생성됨. → 외부클래스$내부클래스 형식으로 클래스
	// 이름 생성됨
	private Node head = null; // head가 어떤 객체도 가리키지 않도록 null로 초기화

	// 내부 클래스 선언
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	// 실행할 때마다 내부 클래스 Node의 인스턴스 생성
	public void add(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
		// next는 Node를 참조하며, Node의 link는 또 다른 노드를 참조.
		// next.link != null일때 실행. 즉, Node의 link가 더 이상 다른 Node를 참조하지 않을때까지 반복실행.
		// 반복문 완료 시 next는 가장 마지막에 생성된 Node를 참조해 link에 새로 생성된 인스턴스 값 지정.
	}

	// MyLinkedList 인스턴스의 내부 객체인 Node의 data 값을 모두 출력
	public void print() {
		if (head == null) {
			System.out.println("No data");
		} else {
			System.out.println("There is data: ");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
