package ch9;

/*
toString()메서드 오버라이딩
Object클래스의 toString()메서드는 객체에 대한 정보를 클래스명@16인수해시코드 형태로 출력
자바의 모든 객체도 같은 형태의 값을 출력(∵상속)
만약, 객체 정보를 다른 값으로 출력하고 싶다면 toStrin()메서드를 오버라이딩하여 원하는 문자열 반환.
 */
public class MyObject {
//	//p.402
//	public String toString() {
//		return "MyObject";
//	}
	
	//p.405
	int num;
	
	MyObject(int num) { 
		this.num= num;
	}
	
	public String toString() {
		return "MyObject";
	}
	
	public boolean equals(Object obj) {
		boolean result= false;
		MyObject arg= (MyObject)obj; //인자로 전달된 값을 Object타입에서 MyObject타입으로 변경해 arg참조변수에 저장.
		
		if(this.num == arg.num) {
			result=true;
		}
		return result;
	}
}
