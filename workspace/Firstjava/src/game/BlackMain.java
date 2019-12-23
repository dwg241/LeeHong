package game;

public class BlackMain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//PhoneBookManager manager = new PhoneBookManager();
			RuleManager manager = RuleManager.getInstance();
			System.out.println("==========경마 게임 듀토리얼=========");
			
     		manager.moneyset();
			
		
			
				while (true) {
				System.out.println("===경마 게임에 오신걸 환영합니다!===");
				System.out.println("메뉴를 입력해주세요.");
				System.out.println("1. 게임시작/다시시작");
				System.out.println("2. 프로그램 종료");
				System.out.println("===========================");

				int select = manager.sc.nextInt();
				manager.sc.nextLine();

				switch (select) {
				case 1:
					manager.machine(select);
					break;
				
	            case 2:
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
			
			}

		}

	

