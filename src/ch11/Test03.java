package ch11; //p.545

import java.io.FileInputStream;
import java.io.IOException;

/* tryp-with-resources: 자동으로 자원 해제
try(클래스명 변수명 = new 클래스명()){
	//실행문
} catch (Exception e) {
	//예외처리
}
*/
public class Test03 {
	public static void main(String[] args) {
		try (FileInputStream fi = new FileInputStream("a.txt")) {		//fi는 a.txt 파일과 연결하는 객체
			int c = fi.read();		//fi.read()는 a.txt 파일에서 한 글자를 읽어 정수로 반환
			System.out.println((char) c);		//a.txt 에서 읽어들인 문자를 char 타입으로 변경

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
