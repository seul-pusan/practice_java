package ch9; //p.413

/*
2. String Class
유일하게 new가 아닌 큰따옴표로 객체 생성 가능. 그러나 new 명령문으로 생성하면 무조건 힙 메모리에 인스턴스가 새로 생성되고, 새로 생성된 주솟값이 참조변수에 저장되지만,
큰따옴표를 사용해 생성하면 힙 메모리에 String 인스턴스를 무조건 생성하는 것이 아니라 힙 메모리의 고유한 영역인 String Pool을 찾아감.
String Pool에서 생성하려는 문자열과 똑같은 문자열을 가진 String 인스턴스가 있다면, 새로 생성하지 않고 기존 인스턴스의 주솟값을 반화(없다면 새로운 String 인스턴스 생성)

1) 문자열 비교
	- equals(): 같으면 true, 다르면 false 반환
	- equalsIgnoreCase(): 대소문자 구분하지 않고 철자만 같은지 비교
2) 문자열 출력
	- toString(): 참조변수를 출력할 때 
3) 문자열 정보 <Test03.java>
	- length():문자열의 전체 길이 반환
	- charAt(): 인자값으로 전달받은 인덱스의 문자 반환
4) 문자열 공백 <Test04.java>
	- trim(): 문자열의 양끝에 있는 공백 제거
	- isEmpty(): 문자열의 길이가 0인지 판단. 즉, String에 지정된 문자열이 있는지 판단
5) 문자열 검색 <Test05.java>
	- indexOf(): 인자로 지정된 문자 또는 문자열이 시작되는 인덱스를 구할 때 사용. 문자열의 처음부터 검색
	- lastIndexOf(): 문자열의 끝에서부터 검색
	=> 없을 시 -1반환
	- statsWith(): 인자로 전달받은 문자열이 대상 문자열로 시작하는지 판단할 때 사용
	- endsWith(): 문자열로 끝나는지 판단
6) 문자열 편집 <Test06.java>
	String은 원본이 변경 불가하다. 따라서 문자열을 수정할 때마다 새로운 문자열이 만들어짐
	즉, 문자열 편집 메서드를 사용해 문자열을 편집한 후, 편집한 문자열을 참조변수에 저장해야 계속 유지할 수 있다. 이는 메모리 낭비를 초래하기도 함
	- concat(): 새로운 문자열 추가
	- replace(): 기존 문자열을 변경
	- toLowerCase(): 대문자를 소문자로
	- toUpperCase():소문자를 대문자로
7) 문자열 추출 <Test07.java>
	- split(): 인자로 구분자를 기정하면 지정된 구분자로 문자열을 자른 후 String[]배열로 반환.첫 번째 인자는 분리는 구분자, 두번째 인자는 분리하는 문자열의 개수
	- substring(): 문자열에서 원하는 문자열 일부분만 추출할 때 사용. 시작, 끝. !주의사항) 두 번째 인자로 전달한 인덱스 바로 앞까지만 추출하므로 끝 인덱스를 전달할 때 +1만큼 더해서 지정해야 함.
8) 문자열 반환 <Test08.java>
	- valueOf(): 기본타입과 참조 타입의 데이터를 String 으로 변환해줌. 대부분의 타입을 인자로 받을 수 있게 오버로딩되어 있고, static으로 선언되어 있어 String.valueOf() 향태로 사용 가능.
*/

public class Test04 {
	public static void main(String[] args) {
		String s1 = "    Amy    ";
		int len1 = s1.length();

		String s2 = s1.trim();		//문자열 앞뒤 공백 제거. 이때, String의 원본은 변경되지 않으므로 참조변수에 저장
		int len2 = s2.length();

		System.out.println(len1);
		System.out.println(len2);
		
		s1="";		// null string
		System.out.println(s1.length());
//		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());

	}

}
