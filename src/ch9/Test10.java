package ch9; //p.426

/*Math 클래스가 가지는 필드, 메서는 모두 static으로 선언되었으므로, Math.변수, Math.메서드gudxofh tkdyd. 
생성자가 private 접근 제한자로 선언되었으므로 인스턴스 생성 불가.*/

public class Test10 {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(-12));
		
		System.out.println(Math.ceil(12.5));		//올림(double)
		System.out.println(Math.floor(12.5));		//내림(double)
		System.out.println(Math.round(12.5));		//소수점 첫째자리에서 반올림(*)
		
		System.out.println(Math.max(5, 8));
		System.out.println(Math.min(5, 8));
		
		System.out.println(Math.pow(2, 3));			//a의 b승
		System.out.println(Math.sqrt(4));		//a의 제곱근
	}

}
