package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*p.462
배열 구조 시 데이터 작업할 때 문제점
- 데이터 삽입/삭제 연산 관정에서 데이터들의 위치 이동 작업 필요
- 데이터 개수가 많고 삽입/삭제 작업이 많다면 작업 소요 시간 크게 증가
- 배열 크기 변경 불가능. 처음 크기의 데이터만큼만 저장 가능. (가장 큰 문제점)

Collection Framework (컬렉션 프레임워크): 여러가지 자료구조 알고리즘을 미리 구현하여 데이터를 효율적으로 처리할 수 있도록 제공하는 자바 API
						← List -  ArrayList/Vector/LinkedList
Iterable ← Collection
						← Set -  HastSet/TreeSet
						
						Map -  HashMap/HashTable/TreeMap
*/

/*
//p.464
< List 계열 >
- 저장되는 데이터의 순서가 보장됨.
- 인덱스 또는 데이터의 위치 정보를 포함하므로 저장된 순서를 알 수 있고, 처음 저장된 데이터와 가장 마지막에 저장된 데이터에 대한 처리도 독립적으로 가능.
위치 정보(인덱스 또는 주소)로 처리되므로 같은 값의 데이터를 중복해서 저장 가능.
	ArrayList/Vector: 배열과 동일. 데이터가 저장될 때마다 인덱스 부여됨. 저장은 배열처럼 메모리에 연속적으로 하고, 데이터 접근은 인덱스를 통해 접근. 
					  배열과 동일한 방법으로 추가, 삭제되므로 많은 부하가 생긴다는 단점과 검색 속도가 빠르다는 장점이 존재.
					  데이터 추출 시 get() 메서드 사용
					  배열 크기 변경 가능하지만, 자동으로 변경할 때 변경되는 크기는 지정한 배열의 크기만큼으로 제한됨.
					  ArrayList는 동시 사용 허용하지 않지만, Vector는 동기화 처리(여러 곳에서 동시에 하나의 자원을 사용 시 문제없이 동작하도록 하는 기능)을 지원함.
	LinkedList: 데이터가 저장될 때 이전에 저잔된 데이터와 이후에 저장된 데이터의 정보를 포함.
 */

/*
 //p.467
 제네릭: 컬렉션 객체를 생성할 때 저장되는 데이터의 타입을 미리 지정하는 기능. 데이터가 저장될 때 지정된 타입이 맞는지 검사하고, 데이터를 추출할 때 지정된 타입으로 변환한 후 반환함.
 클래스<데이터타입> 변수 = new 클래스<데이터타입>();ㅣ
 데이터 타입 안 컬렉션에 저장되는 타입을 지정한 것을 타입 매개변수라고 함.
 */
public class Test01 {
	public static void main(String[] args) {
		// p.468
		ArrayList<String> list = new ArrayList<String>(); // new ArrayList<>으로 둬도 가능
		list.add("Seoul");		list.add("Beijing");		list.add("Shanghai");
		list.add("Seoul");		list.add("Tokyo");		list.add("NewYork");

		for (int i = 0; i < list.size(); i++) { // size(): ArrayList에 저장된 데이터 개수 반환
			System.out.println(list.get(i)); // get(): 인자로 전달한 인덱스에 해당하는 데이터를 제네릭으로 선언한 타입으로 변환.
		}

		// p.470
		list.add("London");		list.add("Rome");		list.add("Bangkok");
		list.add("Beijing");		list.add("Tokyo");		list.add("Seoul");
		System.out.println("1: " + list.toString()); // ArrayList 클래스에는 toString()메서드가 오버라이딩 되어 있음.

		// p.471
		// void add (int index, E element)
		list.add(1, "LA"); // list의 1번 인덱스에 LA 삽입
		print(2, list);

		// int indexOf(Object o) / int lastIndexOf(Object o)
		System.out.println("3 : " + list.indexOf("Seoul"));
		System.out.println("4 : " + list.lastIndexOf("Seoul"));

		// boolean remove(Object o)
		list.remove("LA");		//인자로 전달한 데이터 삭제. 삭제 후 오른쪽의 데이터가 왼쪽으로 이동됨.
		print(5, list);

		// E remove(int index)
		list.remove(2);		//remove할 인덱스:2
		print(6, list);

		// boolean contains(Object o)
		System.out.println("7 : " + list.contains("LA"));		//인자로 전달한 데이터가 list에 포함되어 있는지 판단. 없으므로 false 반환

		// Object[] toArray()
		Object obj[] = list.toArray();		//toArray(): ArrayList의 데이터들을 가진 Object 타입의 배열을 생성하여 변환.
		System.out.println("8 : " + Arrays.toString(obj));

		// <T> T[] toArray(T[] a)
		String cities[] = new String[0];		// ArrayList 길이가 배열 길이보다 크면, toArray가 알아서 새 배열을 새로 생성해 반환하므로 new String[0]으로 배열 생성
		cities = list.toArray(cities);			//Object 타입이 아니라 원하는 타입의 배열이 필요할 때는 인자값으로 특정 타입의 배열 전달
		System.out.println("9 : " + Arrays.toString(cities));		//toArray(cities)는 cities가 String 타입이므로 list의 데이터들을 String타입으로 변환해 배열에 저장.

		// void clear()
		list.clear();
		print(10, list);

		// boolean isEmpty()
		System.out.println("11 : " + list.isEmpty());

		list.add("Paris");		list.add("Bangkok");		list.add("LA");

		// Arrays 클래스의 static<T> List<T> asList<T...a>
		List<String> list2 = Arrays.asList("Seoul", "NewYork", "Beijing");		//asList(): 인자로 전달한 데이터를 가지는 list객체를 생성하여 반환
		print(12, list);		//cf) asList<T...a>는 T타입의 인자값을 고정된 개수가 아니라 동적인 개수로 받을 수 있음을 의미

		// boolean addAll(Collection<? extends E> c)
		list.addAll(list2);
		print(13, list);

		// boolean containsAll(Collection<?> c)
		System.out.println("14 : " + list.containsAll(list2));

		// boolean retainsAll(Collection<?> c)
		list.retainAll(list2);		//list2만 남겨놓고 나머지 데이터 모두 삭제
		print(15, list);

		// boolean removeAll(Collection<?> c)
		list.removeAll(list2);
		print(16, list);

	}

	private static void print(int n, ArrayList<String> list) {
		System.out.println(n + " : " + list);		//System.out.println(list)는 System.out.println(list.toString()) 명령문과 동일

	}
}
