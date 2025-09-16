package ch4; //p.148

/*배열 초기화: 변수를 선언하면서 동시에 처음 값을 지정하는 것을 의미.
그런데 new 연산자로 생성한 배열은 자동으로 초기화가 이루어짐*/

public class Test33 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}

/*
 * cf) int[] score;
	score= {10,20,30,40,50}; error
 * 
 * int[] score;
	score new = {10,20,30,40,50}; sucess
 */