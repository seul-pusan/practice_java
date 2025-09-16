package ch4; //p/145

/*배열 이름: 배열의 시작 주소
인덱스: 순번을 나타내는 위치 정보
요소: 배열에 속한 각 데이터

배열 변수 선언: 데이터타입[] 변수명; or 데이터타입변수명[] = new 데이터타입[요소 수]
*/

public class Test32 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 메모리에 int 타입의 값으 5개 저장할 수 있는 배열 생성. 시작 주소를 arr 변수에 저장
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
