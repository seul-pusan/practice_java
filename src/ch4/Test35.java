package ch4; //p.151

/*
확장 for 문
for(변수선언 : 배열변수명) {
	실행문;
}

주의: 배열의 요소가 담길 변수의 데이터 타입은 배열의 타입과 동일해야 에러가 나지 않음.
*/
public class Test35 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		for (int num:arr) {
			System.out.println(num);
		}
	}

}
