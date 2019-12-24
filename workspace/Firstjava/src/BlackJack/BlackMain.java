package BlackJack;

public class BlackMain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//PhoneBookManager manager = new PhoneBookManager();
			GameMenu GM = GameMenu.getInstance();
			
		
				while (true) {
				System.out.println("=== LH랜드에 오신걸 환영합니다!===");
				System.out.println("메뉴를 입력해주세요.");
				System.out.println("1. 블랙잭 게임");
				System.out.println("2. 경주마 게임");
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

		public static void main(String[] args) {
			GameMenu
		}

		}

	

