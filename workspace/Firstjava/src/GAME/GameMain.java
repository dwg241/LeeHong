package GAME;

import java.util.Scanner;

public class GameMain {
	
	static Scanner kb = new Scanner(System.in);
	static ID id = new ID();
public static void main(String[] args) {
			// TODO Auto-generated method stub      	

				while (true) {
				System.out.println("=== LH랜드에 오신걸 환영합니다!===");
				System.out.println("****먼저 아이디를 생성해주세요.****");
				System.out.println("메뉴를 입력해주세요.");
				System.out.println("1. 아이디 생성");
				System.out.println("2. 블랙잭 게임");
				System.out.println("3. 경주마 게임");
				System.out.println("4. 게임 종료");
				System.out.println("===========================");

				int select1 = kb.nextInt();
				kb.nextLine();

				switch (select1) {
				
				case 1:
					SignUp();
					break;
				case 2:
					BlackJack();
					break;
				
	            case 3:
					HorseRace();
	            	break;
	            case 4:
					System.out.println("프로그램을 종료합니다.");
					return;
				
				}
			    }
			
			    }



private static void SignUp() {
	// TODO Auto-generated method stub

	System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");	
	String name = kb.next();
	System.out.println("초기 금액은 100원에서 시작합니다.");
	int money=100;
	id= new ID(name, money);
	
}


private static void BlackJack() {
			// TODO Auto-generated method stub
			BRuleManager BR = BRuleManager.getInstance();
			while (true) {
					System.out.println("===블랙잭 게임에 오신걸 환영합니다!===");
					System.out.println("메뉴를 입력해주세요.");
					System.out.println("1. 게임시작/다시시작");
					System.out.println("2. 게임메뉴/돌아가기");
					System.out.println("===========================");

					int select2 = BR.sc.nextInt();
					BR.sc.nextLine();

					switch (select2) {
					case 1:
						BR.machine(select2,id);
						break;
					
		            case 2:
						
						return;
					}
			
		}
		}
		      

    private static void HorseRace() {

		     HRuleManager HR = HRuleManager.getInstance();
		
			while (true) {
			System.out.println("=====경마 게임에 오신걸 환영합니다!=====");
			System.out.println(" ***베팅은 3라운드까지 할 수 있습니다.***");
			System.out.println("***라운드별 전체 베팅금액별 베팅 배당금액***");
			System.out.println("전체베팅액 5등: 2.2배     1라운드: 3배");
			System.out.println("전체베팅액 4등: 1.9배     2라운드: 1.5배      ");
			System.out.println("전체베팅액 3등: 1.6배     3라운드: 1.25배 ");
			System.out.println("전체베팅액 2등: 1.3배     이달의 馬: 0.9배");
			System.out.println("전체베팅액 1등: 1배         최악의 馬: 10배");
			System.out.println("");
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 게임시작/다시시작");
			System.out.println("2. 게임메뉴/돌아가기");
			System.out.println("===========================");

			int select = HR.sc.nextInt();
			HR.sc.nextLine();

			switch (select) {
			case 1:
				HR.machine(select,id);
				break;
			
            case 2:
				
				return;
			}
}
	}
}