package ch8; // p.376
// 익명클래스: 일회용처럼 딱 한번만 인스턴스를 생성하여 사용하고 더는 사용하지 않을 때
// 클래스 이름이 필요 없으므로 참조변수의 타입과 new 명령문에서 사용하는 객체 이름을 상속받는 객체(인터페이스 or 클래스) 지정
// 선언과 동시에 힙에 인스턴스가 생성된 수 test 변수에 생성된 인스턴스의 주솟값을 저장. 
// 

public interface Messenger {
	
	String getMessage();
	void setMessage(String msg);

}
