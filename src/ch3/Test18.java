package ch3; //p.98

// Javadoc 주석은 /**  */ 사용
// Javadoc 사용하여 API문서(소스코드 사용 설명서) 작성 가능
/** @author seul */

public class Test18 {

	/**
	 * @param a 합을 구하려는 첫 번째 수
	 * 
	 * @param b 합을 구하려는 첫 번째 수
	 * 
	 * @return a와 b를 합한 결과값
	 */

	public int sum(int a, int b) {
		return a + b;
	}
}

/*
 * 어노테이션 종류
 * 
 * @Override[기존에 있는 내용 재정의]
 * 
 * @Deprecate[]
 * 
 * @author[소스코드 작성자 이름]
 * 
 * @param[매개변수 설명]
 * 
 * @return[반환값 설명]
 * 
 * @see[참조 또는 관련 있는 클래스 표시]
 * 
 * @since[코드가 적용되기 시작한 버전 정보]
 * 
 * @throws[오류 설명]
 * 
 * @version[소스코드 버전 정보]
 */