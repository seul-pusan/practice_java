package ch4; //p.158

/*
2차원 배열 선언
new 데이터타입[행의 수][열의 수]
열의 수는 지정하지 않아도 되지만 행의 수는 반드시 지정해야 함!
Ex) int[][] arr = new int[5][2];
	int arr[][] = new int[5][2];
	int arr[][] = {{10,20}, {30,40}, {50,60}, {70,80}, {90,100}}
*/

/*
2차원 배열 길이
배열변수명.length
배열변수명[행 인덱스].length
*/

public class Test38 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5]; // 5*5배열
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // 행마다 열의 길이
				arr[i][j] = num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
