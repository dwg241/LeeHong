package horserace;

public class HoresMain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//PhoneBookManager manager = new PhoneBookManager();
			RuleManager manager = RuleManager.getInstance();
			System.out.println("==========경마 게임 듀토리얼=========");
			
     		manager.moneyset();
			
				while (true) {
				System.out.println("=====경마 게임에 오신걸 환영합니다!=====");
				System.out.println(" ***베팅은 3라운드까지 할 수 있습니다.***");
				System.out.println("***라운드별 전체 베팅금액별 베팅 배당금액***");
				System.out.println("전체베팅액 5등: 2.2배     1라운드: 3배");
				System.out.println("전체베팅액 4등: 1.9배     2라운드: 1.5배      ");
				System.out.println("전체베팅액 3등: 1.6배     3라운드: 1.25배 ");
				System.out.println("전체베팅액 2등: 1.3배 ");
				System.out.println("전체베팅액 1등: 1배 ");
				System.out.println("");
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

	

