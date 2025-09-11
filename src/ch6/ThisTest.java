package ch6; //p.252

// this 사용 용도: 클래스의 멤버 가리킬 때, 생성자 호출할 때, 자신의 주솟값을 전달하고 싶을 때
public class ThisTest {
	int i = 1;

	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;

		second(4);
	}

	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}

	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();

		System.out.println();
	}
}

// 매서드가 싱핼될 때마다 스택의 메서드 영역에 자동으로 선언되고 초기화된 this는 현재 실행중인 메서드가 속한 인스턴스를 참조할 때 사ㅛㅇ.
//this.i라고 표현하면 힙 메모리에서 ThisTest 인스턴스의 i 필드를 의미. 따라서 this.i= i+j는 지역변수 i와 j 값이 합을 구해 i필드에 저장하는 명령문.

//메서드가 종료될 때 스택에서는 second()메서드 영역이 모두 삭제됨. 스택에서 메서드 단위의 영역: 프레임(frame)
//메서드 종료 시 스택에서는 해당 메서드 프레임이 삭제됨.