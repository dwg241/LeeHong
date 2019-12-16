package game;

import java.util.Scanner;

public class BlackJackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		         RuleManager manager = new RuleManager.getInstance();
		 

				while (true) {
					System.out.println("==========================");
					System.out.println("메뉴를 입력해주세요.");
					System.out.println(Menu.START+ ". 게임시작");
					System.out.println(Menu.REGAME+". 리게임");
					System.out.println(Menu.EXIT+ ". 게임종료");
					System.out.println("==========================");

					
					int select = kb.nextInt();
					

					switch (select) {
					case Menu.START:
						Enter();
						break;
					case Menu.REGAME:
					
						break;
					case Menu.EXIT:

						System.out.println("프로그램을 종료합니다.");
						return;
					}
				}
				

			}

	private static void Enter() {
		// TODO Auto-generated method stub
		
		

			while (true) {
				System.out.println("==========================");
				System.out.println("메뉴를 입력해주세요.");
				System.out.println(1+ ". 돈걸기");
				System.out.println(2+". 카드받기");
				System.out.println(3+ ". 스탑");
				System.out.println(4+ ". 나가기");
				System.out.println("==========================");

				
				int select2 = kb.nextInt();
				

				switch (select2) {
				case 1:
					RuleManager.Betting();
					break;
				case 2:
					RuleManager.Hit(select2);
					break;
				case 3:
					RuleManager.Stop(select2);
				case 4:		
					return;
					
				}
	}

		
	}
}


