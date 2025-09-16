package ch7;
/*
 * 출력 결과 예시
 * 
고객명:홍길동
제품명:노트북, 단가:1500.0, 수량:1, 가격:1500.0
제품명:티셔츠, 단가:50.0, 수량:2, 가격:100.0
구매총액:1600.0
---------------------------------------------
할인율:0.03
할인가격:1552.0
시즌할인율:0.01
시즌할인:1536.48
=============================================
고객명:강감찬
제품명:노트북, 단가:1500.0, 수량:1, 가격:1500.0
제품명:티셔츠, 단가:50.0, 수량:2, 가격:100.0
구매총액:1600.0
---------------------------------------------
할인율:0.1
할인가격:1440.0
시즌할인율:0.01
시즌할인:1425.6
=============================================

 */

//Discountable 인터페이스 정의 -시즌 할인율 적용
interface Discountable {
	double getDiscountedPrice(double price);

}

//SeasonalDiscount 클래스: Discountable 인터페이스 구현
class SeasonalDiscount implements Discountable {
	private double seasonalDiscountRate;

	public SeasonalDiscount(double rate) {
	    this.seasonalDiscountRate = rate;
	   }

	public double getDiscountedPrice(double price) {
		return price - (price * seasonalDiscountRate);
	}

	public double getRate() {
		return seasonalDiscountRate;
	}
}

//Item 추상 클래스
abstract class Item3 {
	private String name;
	private double price;
	private int stockQuantity;

	public Item3(String name, double price, int stockQuantity) {
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

	public String toString() {
		return "제품명:" + name + ", 단가:" + price;
	}
}

//Electronics 클래스: Item 클래스 상속
class Electronics3 extends Item3 {
	private int madeYear;

	public Electronics3(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;
	}

	public String toString() {
		return super.toString();
	}
}

//Clothing 클래스: Item 클래스 상속
class Clothing3 extends Item3 {
	private int size;

	public Clothing3(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
	}

	public String toString() {
		return super.toString();
	}
}

//Customer 추상 클래스 정의
abstract class Customer3 {
	private String cname;

	public Customer3(String cname) {
		this.cname = cname;
	}

	abstract double getDiscountRate();

	abstract double applyDiscount(double totalAmount);

	public String toString() {
		return "고객명:" + cname;
	}

}

//RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer3 extends Customer3 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer3(String cname) {
		super(cname);
	}

	@Override
	double applyDiscount(double totalAmount) {
		// 일반 고객은 추가 할인 없음
		return totalAmount - (totalAmount * REGULARDISCOUNT_RATE);
	}

	@Override
	double getDiscountRate() {
		return REGULARDISCOUNT_RATE;
	}

	public String toString() {
		return super.toString();
	}

}

//PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer3 extends Customer3 {
	public PremiumCustomer3(String cname) {
		super(cname);
	}

	static final double PREMIUMDISCOUNT_RATE = 0.1;

	// 생성자

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount - (totalAmount * PREMIUMDISCOUNT_RATE);
	}

	@Override
	double getDiscountRate() {
		return PREMIUMDISCOUNT_RATE;
	}

	public String toString() {
		return super.toString();
	}

}

//Order 클래스
class Order3 {
	private final int N = 20;
	private Customer3 customer;
	private Item3[] items;
	private int[] quantities;
	private String[] orderDates;
	private int count;
	private SeasonalDiscount seasonalDiscount; 

	public Order3(Customer3 customer, double seasonalRate) {
        this.customer = customer;
        items = new Item3[N];
        quantities = new int[N];
        count = 0;
        seasonalDiscount = new SeasonalDiscount(seasonalRate); // 초기화
    }

	public void addItem(Item3 item, int quantity, String date) {
		items[count] = item;
		quantities[count] = quantity;
		count++;
		item.reduceStock(quantity);
	}

	private double calculateTotal() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			total += (items[i].getPrice() * quantities[i]);
		}
		return total;
	}

	private double caculateDiscountedTotal() {
		double total = calculateTotal();
		return customer.applyDiscount(total);
	}

	public void printOrderSummary() {
	    System.out.println(customer.toString());
        for (int i = 0; i < count; i++) {
            double price = items[i].getPrice() * quantities[i];
            System.out.println("제품명:" + items[i].getName()
                    + ", 단가:" + items[i].getPrice()
                    + ", 수량:" + quantities[i]
                    + ", 가격:" + price);
        }
        double total = calculateTotal();
        System.out.println("구매총액:" + total);
        System.out.println("-".repeat(45));
    }

	// 할인된 내역을 출력하는 메소드
	public void printDiscountDetails() {
		double total = calculateTotal();
        double discounted = customer.applyDiscount(total);
        double seasonDiscounted = seasonalDiscount.getDiscountedPrice(discounted);
        System.out.println("할인율:" + customer.getDiscountRate());
        System.out.println("할인가격:" + discounted);
        System.out.println("시즌할인율:" + seasonalDiscount.getRate());
        System.out.println("시즌할인:" + seasonDiscounted);
        System.out.println("=".repeat(45));
	}
}
	/*
	 * 출력 결과 예시
	 * 
	고객명:홍길동
	제품명:노트북, 단가:1500.0, 수량:1, 가격:1500.0
	제품명:티셔츠, 단가:50.0, 수량:2, 가격:100.0
	구매총액:1600.0
	---------------------------------------------
	할인율:0.03
	할인가격:1552.0
	시즌할인율:0.01
	시즌할인:1536.48
	=============================================
	고객명:강감찬
	제품명:노트북, 단가:1500.0, 수량:1, 가격:1500.0
	제품명:티셔츠, 단가:50.0, 수량:2, 가격:100.0
	구매총액:1600.0
	---------------------------------------------
	할인율:0.1
	할인가격:1440.0
	시즌할인율:0.01
	시즌할인:1425.6
	=============================================

	 */


public class 실습_7_3_인터페이스 {
	public static void main(String[] args) {
		// 배열에 전자제품과 의류패션 객체 추가
		Item3 note = new Electronics3("노트북", 1500, 24, 23);
		Item3 clothe = new Clothing3("티셔츠", 50, 50, 95);

		// 고객 생성
		Customer3 regularCustomer = new RegularCustomer3("홍길동");
		Customer3 premiumCustomer = new PremiumCustomer3("강감찬");

		// 주문 생성 및 계산 (RegularCustomer)
		double seasonalDiscountRate = 0.01;
		Order3 regularOrder = new Order3(regularCustomer, seasonalDiscountRate);
		regularOrder.addItem(note, 1, "240901");
		regularOrder.addItem(clothe, 2, "240902");

		regularOrder.printOrderSummary();
		regularOrder.printDiscountDetails(); // 할인된 내역 출력

		// 주문 생성 및 계산 (PremiumCustomer)
		Order3 premiumOrder = new Order3(premiumCustomer, seasonalDiscountRate);
		premiumOrder.addItem(note, 1, "240901");
		premiumOrder.addItem(clothe, 2, "240903");

		premiumOrder.printOrderSummary();
		premiumOrder.printDiscountDetails(); // 할인된 내역 출력
	}

}
