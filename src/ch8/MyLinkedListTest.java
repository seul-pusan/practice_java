package ch8; //p.358

public class MyLinkedListTest {
	public static void main(String[] args) {

		MyLinkedList ml = new MyLinkedList(); // 스택에 참조변수 ml생성. 힙에는 MyLinkedList 인스턴스 생성. 생성됨 인스턴스는 ml변수가 참조
		ml.print();

		ml.add("JAVA");
		ml.add("JSP");
		ml.add("Servlet");
		ml.print();
	}

}
