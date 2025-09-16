package ch6;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
//		suit = null			//참조 끊겨서 스택으로 접근 불가
		suit.setName("mark6");
		suit.setHeight(180);

		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}
