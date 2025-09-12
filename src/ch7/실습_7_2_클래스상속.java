package ch7;
/*
 * 출력 결과 예시
 * 
Premium Customer Order:
고객정보 : 고객명:홍길동, 도시:부산, 나이:30
제품명 : 노트북, 단가 : 1200.0, 개수 : 1 ==> 가격 : 1200.0
제품명 : 티셔츠, 단가 : 20.0, 개수 : 2 ==> 가격 : 40.0
총액:1240.0, 할인율:0.1, 할인금액:-124.0
할인 후 총액:1116.0
-------------------------------------------------------
Regular Customer Order:
고객정보 : 고객명:계백, 도시:양산, 나이:25
제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 : 800.0
제품명 : 자켓, 단가 : 80.0, 개수 : 1 ==> 가격 : 80.0
총액:880.0, 할인율:0.03, 할인금액:-26.399999999999977
할인 후 총액:853.6
-------------------------------------------------------
*/

// class Item2
class Item2 {
	private String name;
	private double price;
	private int stockQuantity;

	public Item2(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public void reduceStock(int quantity) {
		stockQuantity -= quantity;
	}

	public void increaseStock(int quantity) {
		stockQuantity += quantity;
	}

	@Override
	public String toString() {
		return "제품명: " + name + ", 단가: " + price + ", 재고량: " + stockQuantity ;
	}

}

// class Electronics
class Electronics extends Item2 {
	private int warranty;

	public Electronics(String name, double price, int stockQuantity, int warranty) {
		super(name, price, stockQuantity);
		this.warranty= warranty;
	}

	@Override public String toString() {
		return super.toString();
	}
}

//class Clothing
class Clothing extends Item2 {

	private String size;
	private String color;

	public Clothing(String name, double price, int stockQuantity, String size, String color) {
		super(name, price, stockQuantity);
		this.size = size;
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

//Customer 추상 클래스 정의
abstract class Customer2 {
	private String cname;
	private String city;
	private int age;

	public Customer2(String cname, String city, int age) {
		this.cname = cname;
		this.city = city;
		this.age = age;
	}

	public String toString() {
		return "고객정보 : 고객명:" + cname + ", 도시:" + city + ", 나이:" + age;
	}

	abstract double getDiscountRate();

	abstract double applyDiscount(double totalAmount);
}

//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer extends Customer2 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer(String name, String city, int age) {
		super(name, city, age);
	}

	@Override
	double getDiscountRate() {
		// 일반 고객 할인 적용
		return REGULARDISCOUNT_RATE;
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount - (totalAmount * REGULARDISCOUNT_RATE);
	}
	
	public String toString() {
		return super.toString();
	}
	
}

//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer extends Customer2 {
	static final double PremiumRDISCOUNT_RATE = 0.1;

	public PremiumCustomer(String name, String city, int age) {
		super(name, city, age);
	}

	@Override
	double getDiscountRate() {
		// 프리미엄 고객 할인 적용
		return PremiumRDISCOUNT_RATE;
	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount - (totalAmount * PremiumRDISCOUNT_RATE);
	}
	
	public String toString() {
		return super.toString();
	}
	
}

//
class Order2 {
	private Customer2 customer;
	private Item2[] items;
	private int[] quantities;
	private int itemCount;

	public Order2(Customer2 customer, int size) {
		this.customer = customer;
		items = new Item2[size];   // 상품 배열
		quantities = new int[size]; // 수량 배열
		itemCount = 0;
	}

	public void addItem(Item2 item, int quantity) {
		items[itemCount] = item;
		quantities[itemCount] = quantity;
		itemCount++;
		item.reduceStock(quantity);

	}

	private double calculateTotal() {
		double total = 0.0;
		for (int i = 0; i < itemCount; i++) {
			total += (items[i].getPrice() * quantities[i]);
		}
		return total;
	}

	private double calculateDiscountedTotal() {
		double total = calculateTotal();
		return customer.applyDiscount(total);
	}

	public void printOrderSummary() {
		System.out.println(customer.toString());
		   for (int i = 0; i < itemCount; i++) {
		        double price = items[i].getPrice() * quantities[i];
		        System.out.println("제품명 : " + items[i].getName() +
		                ", 단가 : " + items[i].getPrice() +
		                ", 개수 : " + quantities[i] +
		                " ==> 가격 : " + price);
		    }
		double total= calculateTotal();
		double discountRate=customer.getDiscountRate();
		double discountedTotal= calculateDiscountedTotal();
		System.out.println("총액:" + total + ", 할인율:" + discountRate +
	            ", 할인금액:" + -(total * discountRate));
		System.out.println("할인 후 총액:" + discountedTotal);
		System.out.println("-".repeat(55));
	}
	/*
	 * 출력 결과 예시
	 * 
	Premium Customer Order:
	고객정보 : 고객명:홍길동, 도시:부산, 나이:30
	제품명 : 노트북, 단가 : 1200.0, 개수 : 1 ==> 가격 : 1200.0
	제품명 : 티셔츠, 단가 : 20.0, 개수 : 2 ==> 가격 : 40.0
	총액:1240.0, 할인율:0.1, 할인금액:-124.0
	할인 후 총액:1116.0
	-------------------------------------------------------
	Regular Customer Order:
	고객정보 : 고객명:계백, 도시:양산, 나이:25
	제품명 : 휴대폰, 단가 : 800.0, 개수 : 1 ==> 가격 : 800.0
	제품명 : 자켓, 단가 : 80.0, 개수 : 1 ==> 가격 : 80.0
	총액:880.0, 할인율:0.03, 할인금액:-26.399999999999977
	할인 후 총액:853.6
	-------------------------------------------------------
	*/
}

public class 실습_7_2_클래스상속 {
	public static void main(String[] args) {
		// 의류 및 전자제품 생성
		Item2 laptop = new Electronics("노트북", 1200.00, 10, 24);
		Electronics phone = new Electronics("휴대폰", 800.00, 30, 12);
		Clothing tshirt = new Clothing("티셔츠", 20.00, 50, "M", "Blue");
		Clothing jacket = new Clothing("자켓", 80.00, 20, "L", "Black");
		
		
		// 주문 전 재고량 재고량
		System.out.println("Before Order StockQuantity");
		System.out.println(laptop.toString());
		System.out.println(phone.toString());
		System.out.println(tshirt.toString());
		System.out.println(jacket.toString());
		System.out.println("-".repeat(55));

		// 고객 생성
		PremiumCustomer premiumCustomer = new PremiumCustomer("홍길동", "부산", 30);
		RegularCustomer regularCustomer = new RegularCustomer("계백", "양산", 25);

		// 주문 생성
		Order2 order1 = new Order2(premiumCustomer, 4);
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);

		Order2 order2 = new Order2(regularCustomer, 4);
		order2.addItem(phone, 1);
		order2.addItem(jacket, 1);

		// 주문 요약 출력
		System.out.println("Premium Customer Order:");
		order1.printOrderSummary();

		System.out.println("Regular Customer Order:");
		order2.printOrderSummary();
		
		// 주문 후 재고량 파악
		System.out.println("After Order StockQuantity");
		System.out.println(laptop.toString());
		System.out.println(phone.toString());
		System.out.println(tshirt.toString());
		System.out.println(jacket.toString());
		System.out.println("-".repeat(55));

	}

}
