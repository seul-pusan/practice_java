package ch3;//109

//점수 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 밖에는 F문자 출력
public class Test20 {
	public static void main(String[] args) {
		int score = 45;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else
			grade = 'F';

		System.out.println(grade);
	}

}
