package ch9; //p.423

/*
StringBuffer와 StringBuilder 모두 문자열을 처리하기 위해 넉넉한 메모리 공간을 확보해서 그 안에 문자열을 저장하고 수정하도록 함
=> buffer라고 부름
String과 다르게 새로운 문자열을 만들 필요가 없음.

StringBuffer는 동시에 접근하는 상황에 대처(막아놓아서) 가능.
StringBilder는 대처 불가. 따라서 그런 가능성이 없으면 이게 더 효율적. StringBuffer는 많은 처리 필요해서
*/

public class Test09 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("날이 좋아서 ");
		System.out.println(sb);
		
		System.out.println(sb.append("날이 적당해서"));
		System.out.println(sb.insert(7, "날이 좋지 않아서 "));
		System.out.println(sb.append(" 모든 날이 좋았다 "));
		
		int start= sb.indexOf(" 모든 날이 좋았다 ");
		int end = sb.length();
		System.out.println(sb.replace(start, end, " 너와 함께 한 시간 모두 눈부셨다"));
	}

}
