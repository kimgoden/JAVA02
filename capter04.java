package project03;

import java.util.Scanner;

public class capter04 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 해주세요");
		int x = sc.nextInt();
		if(x>0) {
			System.out.println("양수 입니다");
			}
		else if(x==0) {
			System.out.println("0입니다.");
		}
		else {
			System.out.println("음수 입니다");
			
		}
}
}