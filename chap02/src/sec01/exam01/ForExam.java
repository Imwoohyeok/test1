package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {

		boolean run = true;
		int balace = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {

			System.out.println("1:예금,2:출금,3:잔고확인,4:종료 :");
			
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("예금할 금액은 ?");
				int money = scan.nextInt();
				
				if(money < 0) {
					System.out.println("금액을 확인하세요");
				} else {
					balace += money;
				}
			} else if(menu == 2) {
				System.out.println("출금할 금액은 ?");
				int money = scan.nextInt();
				
				if(balace < money) {
					System.out.println("잔액이 부족합니다");
				} else {
					balace -= money;
				}
				
			} else if(menu == 3) {
				System.out.println("잔액 : "+ balace);
			} else if(menu == 4) {
				run = false;
			} else {
				System.out.println("메뉴를 확인하세요");
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}












