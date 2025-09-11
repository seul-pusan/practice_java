package ch7;

import java.time.LocalDate;

class Item {
	private String name;
	private double price;
	private int stockQuantity;

	public Item(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}



	public double getPrice() {

		return price;
	}

	public String getName() {

		return name;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + ", 가격:" + price + ", 재고:" + stockQuantity;
	}
}

class Customer {
	private String cname;
	private String city;
	private int age;

	public Customer(String cname, String city, int age) {
		this.cname = cname;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "고객이름:" + cname + ", 도시:" + city + ", 나이:" + age;
	}
}

class Order {
	private Customer customer;
	private Item[] items;
	private int[] quantities;
	private int count;
	private String orderDates = LocalDate.now().toString();

	public Order(Customer customer, int size) {
		this.customer = customer; // 타입 일치
		items = new Item[size]; // 아이템 배열 생성
		quantities = new int[size]; // 수량 배열 생성

	}

	// 아이템 추가 메소드
	public void addItem(Item item, int orderQuantity) {
		items[count] = item;
		quantities[count] = orderQuantity;
		count++;
	}

	// 총액 계산 메소드
	private double calculateTotal() {
		double total = 0.0;
		for (int i = 0; i < count; i++) {
			total += (items[i].getPrice() + quantities[i]);
		}
		return total;
	}

	// 주문 요약 출력 메소드
	public void printOrderSummary() {
		System.out.println(customer.toString() + ", " + orderDates);
		for (int i = 0; i < count; i++) {
			System.out.println("제품명: " + items[i].getName());
		}
		System.out.println("총액: " + calculateTotal());
		System.out.println("-".repeat(55));
	}

}

public class 실습_7_1_객체생성 {
	public static void main(String[] args) {
		// 아이템 생성
		Item laptop = new Item("노트북", 1200.00, 10);
		Item tshirt = new Item("티셔츠", 20.00, 50);
		Item phone = new Item("휴대폰", 800.00, 30);
		Item headphones = new Item("헤드폰", 150.00, 20);
		Item mouse = new Item("마우스", 30.00, 15);

		// 고객 생성
		Customer boy = new Customer("홍길동", "부산", 21);
		Customer girl = new Customer("계백", "양산", 22);

		// 주문 생성
		Order order1 = new Order(boy, 5); // 최대 5개 아이템
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
		order1.addItem(phone, 1);
		order1.addItem(headphones, 1);
		order1.addItem(mouse, 1);

		Order order2 = new Order(girl, 5); // 최대 5개 아이템
		order2.addItem(laptop, 1);
		order2.addItem(tshirt, 1);
		order2.addItem(phone, 1);
		order2.addItem(headphones, 1);
		order2.addItem(mouse, 1);

		// 주문 요약 출력
		order1.printOrderSummary();
		order2.printOrderSummary();

		
//		 * 출력 결과 예시
//		 * 
//		 * 고객정보 : 이름:홍길동, 도시:부산, 나이:21, 주문일: 2025-09-10 제품명 : 노트북, 단가 : 1200.0, 개수 : 1
//		 * ==> 가격 : 1200.0 제품명 : 티셔츠, 단가 : 20.0, 개수 : 2 ==> 가격 : 40.0 제품명 : 휴대폰, 단가 :
//		 * 800.0, 개수 : 1 ==> 가격 : 800.0 제품명 : 헤드폰, 단가 : 150.0, 개수 : 1 ==> 가격 : 150.0 제품명
//		 * : 마우스, 단가 : 30.0, 개수 : 1 ==> 가격 : 30.0 총액 : 2220.0
//		 * ------------------------------------------------------- 고객정보 : 이름:계백, 도시:양산,
//		 * 나이:22, 주문일: 2025-09-10 제품명 : 노트북, 단가 : 1200.0, 개수 : 1 ==> 가격 : 1200.0 제품명 :
//		 * 티셔츠, 단가 : 20.0, 개수 : 1 ==> 가격 : 20.0 제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 :
//		 * 800.0 제품명 : 헤드폰, 단가 : 150.0, 개수 : 1 ==> 가격 : 150.0 제품명 : 마우스, 단가 : 30.0, 개수 :
//		 * 1 ==> 가격 : 30.0 총액 : 2200.0
//		 * -------------------------------------------------------
		 
	}

}
