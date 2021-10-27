package project03;

public class capter03 {
	public static void main(String [] args) {
		
		int age = 27;
		
		if (age>60) {
		System.out.println("무료");
		}
		else if (age>=20) {
			System.out.println("성인 요금");
		}
		else if (age>=13) {
			System.out.println("청소년 요금");
		}
		else if (age>=8) {
			System.out.println("어린이 요금");
		}
		else  {
			System.out.println("무료");
		}
		System.out.println("프로그램을 종료합니다.");
		
}
}