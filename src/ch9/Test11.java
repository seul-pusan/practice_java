package ch9; //p.428

/*
Wrapper Class: java.lang package에 있는 클래스 중 자바의 기본 데이터 타입과 매핑되는 클래스
기본 데이터는 값 자체만 저장되어 있으므로 데이터에 대해 처리할 때 메서드를 사용할 수 없음
따라서 데이터에 대한 처리 기능이 필요할 때는 기본 데이터를 Wrapper 클래스로 생성한 후 해당 클래스에서 제공하는 메서드 활용

기본 데이터 → Wrapper 객체(클래스 타입) : Boxing (valueOf() 메서드 사용하여 생성)
Wrapper 객체 → 기본 데이터(클래스 타입) : Unboxing (데이터타입 데이터타입Value() 메서드 사용하여 변경)
*/

public class Test11 {
	public static void main(String[] args) {
		boolean bool = true;
		byte b= 12;
		char c= 'A';
		double d= 3.14;
		float f= 10.5f;
		int i=123;
		long l=123456789;
		short s= 256;
		
		Boolean obj1= Boolean.valueOf(bool);
		Byte obj2= Byte.valueOf(b);
		Character obj3= Character.valueOf(c);
		Double obj4= Double.valueOf(d);
		Float obj5= Float.valueOf(f);
		Integer obj6= Integer.valueOf(i);
		Long obj7= Long.valueOf(l);
		Short obj8= Short.valueOf(s);
		
		boolean bool1= obj1.booleanValue();
		byte b2= obj2.byteValue();
		char c2= obj3.charValue();
		double d2= obj4.doubleValue();
		float f2= obj5.floatValue();
		int i2= obj6.intValue();
		long l2= obj7.longValue();
		short s2= obj8.shortValue();
	}

}
