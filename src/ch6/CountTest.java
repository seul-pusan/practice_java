package ch6;//p.231

class Count {
	public static int totalCount;
	int count;
}

public class CountTest {
	public static void main(String[] args) {
		System.out.println("start");
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;

		System.out.println(Count.totalCount + " : " + c1.count); // 3:1
		System.out.println(Count.totalCount + " : " + c2.count); // 3:1
		System.out.println(Count.totalCount + " : " + c3.count); // 3:1
		// totalCount 값은 모든 인스턴스가 공유하므로 증가값이 누적되어 3이 나타남
		// 힙 메모리에 할당된 count 필드값은 각 인스턴스마다 독립적이어서 세 인스턴스의 count 필드값은 모두 1로 변경됨.

//		//클래스 필드 사용: 참조변수 필요없음. main()method 실행되기 전 이미 메모리에 할당되었으므로
//		Count.totalCount++;
//		//Count클래스의 클래스 필드 중 totalCount를 찾아서 값을 1만큼 증가시켜라.
//		//if Count.count 일 경우 오류발생 reason: there is no static declaration
//		//밑의 클래스 필드 생성 필요

//		//클래스 필드 생성 횟수
//		Count c1= new Count();
//		Count c2= new Count();
//		Count c3= new Count();
		// stack memory: c1, c2, c3
		// heap memory: Count{totalCount, count:-}
		// code memory: Count{totalCount:0} reason: :03 static declaration
		// static으로 선언한 필드는 프로그램 시작 전 딱 한번 메모리에 할당되고 각 인스턴스에서 해당 필드 공유. -> class field
		// 선언하지 않으면 클래스의 인스턴스가 힙 메모리에 할당될때마다 새로 할당됨.

	}

}
