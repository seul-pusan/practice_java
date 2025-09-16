package ch3;//p.115

public class Test24 {
	public static void main(String[] args) {
		String nation = "KOR";

		switch (nation) {
		case "KOR":
		case "JPN":
		case "CHN":
			System.out.println("Asia");
			break;

		/*
		 * 만약 위를 if문으로 반환한다면 if (nation == "KOR" | nation == "JPN" | nation == "CHN") {
		 * System.out.println("Aisa"); }
		 */

		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("Europe");
			break;

		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("America");
			break;
		}
	}

}

/*
 * switch~case 문은 조건식으로 변수의 데이터타입이 byte, short, int, char, String으로 정해져 있음. 꼭
 * 변수를 사용하지 않고 어떤 계산식을 사용하더라도 결과값의 타입이 이 중 하나여야 함. long, float, double처럼 실수 타입
 * 불가
 * 
 * String은 Java7부터 지원
 */