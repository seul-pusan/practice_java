package ch7;

public class GalaxyMessenger implements Messenger, WorkFile { // 상속한 인터페이스에서 선언한 getMessage()와 setMessage() 추상 메서드를 구현하지 않아서 error 발생

	public String getMessage() {
		return "galaxy";
	}

	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다: " + msg);
	}

	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
	}
	
	public void fileDownload() {
		System.out.println("file download");
	}
	
	public void fileUpload() {
		System.out.println("file uplaod");
	}

}