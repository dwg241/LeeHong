package single;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PhoneBookManager manager = new PhoneBookManager();
		PhoneBookManager manager = PhoneBookManager.getInstance();

		while (true) {
			System.out.println("==========================");
			System.out.println("메뉴를 입력해주세요.");
			System.out.println(Menu.INSERT_UNIV+ ". 대학친구입력");
			System.out.println(Menu.INSERT_COM+". 회사친구입력");
			System.out.println(Menu.SEARCH+". 친구 검색");
			System.out.println(Menu.DELETE+". 친구 삭제");
			System.out.println(Menu.LIST+ ". 친구 전체 리스트");
			System.out.println(Menu.EXIT+ ". 프로그램 종료");
			System.out.println("==========================");

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case Menu.INSERT_UNIV:
				manager.insertInfor(select);
				break;
			case Menu.INSERT_COM:
				manager.insertInfor(select);
				break;
			case Menu.SEARCH:
				manager.searchInfor();
				break;
			case Menu.DELETE:
				manager.deleteInfor();
				break;
			case Menu.LIST:
				manager.showAll();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}