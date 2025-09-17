package ch13; //p.649

/*
< 어노테이션 = 메타데이터 >
- 실행하고 상관없이 주석문처럼 추가하는 부가적인 정보. 서로 다른 이름으로 구성된 정보들을 가지는 하나의 단위
- 컴파일러를 비롯해 개발에 사용되는 여러 도구에 정보를 제공할 목적으로 사용.(소스코드에 추가하는 정보)

1. 개요
	1) 선언:; @interface 어노테이션명 {
				데이터타입 변수명();}
	2) 사용; @어노테이션명(변수명 = 값, 변수명 = 값)
	3) 유지정책: 유지 범위 값에 따라 서로 다른 범위로 사용 가능. 지역변수에 선언된 어노테이션은 바이트코다(.class)파일에서 유지되지 않음.
			유지 정책 적용해 선언하려면 자바에서 기본적으로 제공하는 @Retention 어노테이션을 지정. 사용은 @Retention(RetentionPolicy.열거상수)
2. 정보추출: 프로그램 실행 시 어노테이션 정보를 사용할 때는 리플렉션을 사용해 정보 추출.
		=> 리플렉션: 클래스의 정보(선언된 클래스, 메서드, 변수에 대한 정보)를 처리할 수 있게 해주는 기능.
	1) 리플렉션을 위한 Class 객체: 리플렉션 사용 시 가장 먼저 생성해야 함. 
		- getClass()메서드 사용
		- 객체이름.class
		만약 일반 클래스라면, 클레스에 대한 정보를 갖는 Class 객체가 생성되고, 어노테이션이라면 어노테이션에 대한 정보를 갖는 Class 객체가 생성됨
					Method getMethod(String): 인자로 지정된 이름의 메서드를 Method 객체로 반환
					boolean isAnnotationPresent(Class): 매개변수로 전달받은 어노테이션의 적용 여부 판단
					Annotation getAnnotation(Class): 매개변수로 전달받은 어노테이션을 Annotation 객체로 반환
					Annotation[] getAnnotations(): 적용한 모든 어노테이션을 Annotation 객체로 반환	
					
	2) 여러개의 어노테이션 선언 및 활용
	3) 어노테이션 적용 여부 판단
3. 기본값 지정: 어노테이션은 데이터의 집합이므로 데이터값을 지정해야 함. 지정하지 않고 기본값을 지정하여 사용가능한데, 이를 default라 함.
	1) defalut 키워드; @interface 어노테이션명 {
							데이터타입 변수명() defalut 값;}
	2) value: 어노테이션에 하나의 값만 지정할 때는 값만 지정할 수 있는데 이때 반드시 value 이름으로 선언된 변수 필요
4. 표준 어노테이션
 	1) java.lang.annotation
 		- @Retention:현재 선언하는 어노테이션의 유지 번위 설정
 		- @Docummented: 현재 선언하는 어노테이션을 자바 문서를 작성할 떄 포함할 것인지 설정. 별도의 값을 지정할 필요 없음.
 		- @Target: 현재 선언하는 어노테이션의 적용 대상 설정. 값은 ElementType 열거형 클래스에서 정의된 상수 사용. 클래스, 인터페이스, 열거형 클래스를 선언하는 부분에서 사용할 수 있는 어노테이션.
 					ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, MODULE, PACKAGE, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE
 		- @Inderited: 상위 객체에 선언된 어노테이션에 @Inderited가 설정되면 하위 객체에서도 상속받아 사용할 수 있음. 값 지정 필요 없음.
 	2) java.lang
 		- @Override: 매서드에만 적용할 수 있는 어노테이션. 메서드가 오버라이딩되었음을 나타냄. 값을 지정할 필요 없음. 만일 오버라이딩 메서드가 아닌데 사용하면 컴파일 오류 발생
 		- @Deprecated: 더 이상 사용하지 않거나 사용하지 않을 것을 권장
 		- @FunctionalInterface: 인터페이스를 선언할 때 사용하는 어노테이션으로 얘가 지정된 인터페이스를 함수형 인터페이스라고 함. 즉, 하나의 추상 메서드만 가지는 인터페이스를 의미. 반드시 지정해야하는 것은 아님.
 		- @SafeVarargs: 메서드와 새성자에 사용 가능. 가변길이 인자를 사용해 발생하는 경고를 무시하려는 목적으로 사용. 반드시 접근자를 static/final/private 중 하나도 선언해야 함.
 		- @SuppressWarning: 컴파일러의 경고를 무시하고자 할 때 지정.
*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str() default "guest";

	int val() default 1004;
}

public class AnnoTest4 {

	@MyAnno
	public static void test() {
		AnnoTest4 obj = new AnnoTest4();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " : " + anno.val());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		test();
	}
}
