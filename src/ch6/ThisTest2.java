package ch6;//258

public class ThisTest2 {
	private String name;

	public void setName(String name) {
		name = name; // :에서 setName()메서드가 종료되기 때문에 프레임에서 삭제됨. 따라서 선언한 지역변수도 삭제됨. 따라서 인자값 "Amy"를 갖는 name 변수도 메모리에서 삭제됨
		this.name=name; //따라서 현재 실행중인 메서드가 속한 인스턴스의 name필드를 가리키므로 매개변수로 전달받은 문자열을 name필드에 저장 가능.
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2();
		exam.setName("Amy");

		System.out.println(exam.getName());
	}

}
