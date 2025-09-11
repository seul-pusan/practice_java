package ch7; //p.320

public class IPhoneMessenger extends GraphicIOS implements Messenger { // 상속한 인터페이스에서 선언한 getMessage()와 setMessage() 추상 메서드를 구현하지 않아서 error
													// 발생

	public String getMessage() {
		return "iPhone";
	}

	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다: " + msg);
	}

	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열 삭제");
	}
	
	
}
