package GAME;

import java.util.Scanner;

public class GameMain {
	
 static Scanner kb = new Scanner(System.in);
 static ID id = null;
	
public static void main(String[] args) {
			// TODO Auto-generated method stub      	
	            System.out.println("^^^돈 1000원 이상을 모으면 게임 엔딩을 볼 수 있습니다.^^^");
				while (true) {
				
				System.out.println("=== LH랜드에 오신걸 환영합니다!===");
				System.out.println("****먼저 아이디를 생성해주세요.****");
				System.out.println("메뉴를 입력해주세요.");
				System.out.println("1. 아이디 생성");
				System.out.println("2. 블랙잭 게임");
				System.out.println("3. 경주마 게임");
				System.out.println("4. LH마블 게임");
				System.out.println("5. 엔딩 보기");
				System.out.println("0. 게임 종료");
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
	            	Mable();
	            	break;
	            case 5:	
	                
	            	Ending();
	            case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				
				}
			    }
			
			    }

private static void Ending() {
	if(id.money>1000){
		System.out.println("당신은 도박왕입니다.");
	}
	
}

private static void SignUp() {
	// TODO Auto-generated method stub

	System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");
	System.out.println("아이디는 두글자로 해주세요!");	
	String name = kb.next();
	System.out.println("1 🎅 2 🤴  3 👸  4 👳  5 👼" );
	System.out.println("캐릭터를 선정해주세요!(번호를 입력하시면 됩니다.)");
	int select =kb.nextInt();
	if(select==1) 
	{
	String acter =" 🎅 ";
	name =acter+name;
	}
	if(select==2) 
	{
	String acter =" 🤴";
	name =acter+name;
	}
	if(select==3) 
	{
	String acter =" 👸";
	name =acter+name;
	}
	if(select==4) 
	{
	String acter =" 👳 ";
	name =acter+name;
	}
	if(select==5) 
	{
	String acter =" 👼";
	name =acter+name;
	}
	if(select==2080) //히든 번호 
	{
	System.out.println("히든캐릭터!");
	String acter ="✨🐱‍🏍✨";
	name =acter+name;
	System.out.println("아이디 완성!"+name);
	System.out.println("초기 금액은 150원에서 시작합니다.(딱 한번 보너스 50원!)");
	int money=150;
	id= new ID(name, money);
	}
	if(select!=2080) {
	System.out.println("아이디 완성!"+name);
	System.out.println("초기 금액은 100원에서 시작합니다.");
	int money=100;
	id= new ID(name, money);
	}
}

// 게임 팩 
private static void Mable() {
	// TODO Auto-generated method stub
	MableManager MM = MableManager.getInstance();
	
	while (true) {
		if(id.End==0) {
		System.out.println("");
		System.out.println("************************************게임설명***********************************");
		System.out.println("┏━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━┓");
		System.out.println("┃[01]     ┃[02]     ┃[03]     ┃[04] 중국땅┃[05]     ┃[06] 사우디┃[07] 이라크┃[08]    ┃");
		System.out.println("┃🕴🏳 🚶🏴         ┃         ┃         ┃         ┃         ┃         ┃         ┃        ┃");
		System.out.println("┃Start+10₩┃White 01₩┃White 01₩┃White 01₩┃Star Card┃Green 02₩┃Green 02₩┃Event 1₩┃");
		System.out.println("┣━━━━━━━━━╋━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━╋━━━━━━━━┫");
		System.out.println("┃[26]미국땅  ┃                                                ┏━┓    ┏━┓ ┃[09]남아공┃");
		System.out.println("┃         ┃   ┏━━┓       ┏━━┓    ┏━━┓              ┏━┓     ┃ ┃    ┃ ┃ ┃        ┃");  
		System.out.println("┃Gray  08₩┃   ┃  ┃       ┃  ┃    ┃  ┃    ┏━━━━━━━┓ ┃ ┃     ┃ ┗━━━━┛ ┃ ┃Red  03₩┃");
		System.out.println("┣━━━━━━━━━┫   ┃  ┃       ┃  ┗━━━━┛  ┃    ┃ ┏━━━┓ ┃ ┃ ┗━┓   ┃ ┏━━━━┓ ┃ ┣━━━━━━━━┫");
		System.out.println("┃[25]캐나다  ┃   ┃  ┃       ┃  ┏━━━━┓  ┃    ┃ ┃   ┃ ┃ ┃ ┏━┛   ┃ ┗━━━━┛ ┃ ┃[10]이집트┃");
		System.out.println("┃         ┃   ┃  ┗━━━━━┓ ┃  ┃    ┃  ┃    ┃ ┗━━━┛ ┃ ┃ ┃     ┗━━━━━━━━┛ ┃        ┃");  
		System.out.println("┃Gray  08₩┃   ┗━━━━━━━━┛ ┗━━┛    ┗━━┛    ┗━━━━━━━┛ ┃ ┃    ┏━━━━━━━━━━┓┃Red  03₩┃");			
		System.out.println("┣━━━━━━━━━┫----------------------------------------┗━┛----┗━━━━━━━━━━┛┣━━━━━━━━┫");
		System.out.println("┃[24]     ┃                                                 ┏━━━━━━━┓ ┃[11]    ┃");
		System.out.println("┃         ┃  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ┗━━━━━┓ ┃-┃        ┃");  
		System.out.println("┃Terminal ┃                                                 ┏━━━━━┛ ┃ ┃Terminal┃");			
		System.out.println("┣━━━━━━━━━┫-------------------------------------------------┃ ┏━━━━━┛-┣━━━━━━━━┫");
		System.out.println("┃[23]영국땅  ┃                                                 ┃ ┗━━━━━┓ ┃[12]러시아┃");
		System.out.println("┃         ┃ Win: 3color, More money, bankruptcy             ┗━━━━━━━┛ ┃        ┃");  
		System.out.println("┃Brown 07₩┃                                      ┏━━━━━━━━━━━━━━━┓    ┃Blue 04₩┃");			
		System.out.println("┣━━━━━━━━━┫                                      ┃✨✨✨✨✨✨✨✨ ┃    ┣━━━━━━━━┫");
		System.out.println("┃[22]프랑스  ┃                                      ┃✨  Star Card ✨  ┃    ┃[13]터키땅┃");
		System.out.println("┃         ┃                                      ┃✨✨✨✨✨✨✨✨ ┃    ┃        ┃");  
		System.out.println("┃Brown 07₩┃   Made by JeongHyun Lee              ┗━━━━━━━━━━━━━━━┛    ┃Blue 04₩┃");			
		System.out.println("┣━━━━━━━━━╋━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━╋━━━━━━━━┫");
		System.out.println("┃[21]     ┃[20]독일땅  ┃[19]그리스  ┃[18]     ┃[17]멕시코  ┃[16]브라질  ┃[15]아르헨  ┃[14]    ┃");
		System.out.println("┃         ┃         ┃         ┃         ┃         ┃         ┃         ┃        ┃");  
		System.out.println("┃Prison   ┃Pink  06₩┃Pink  06₩┃Star Card┃Black 05₩┃Black 05₩┃Black 05₩┃ Trip 1₩┃");			
		System.out.println("┗━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━┛");
		System.out.println("플레이어 말:🚶🏴 컴퓨터 말:🕴🏳" );
		System.out.println("Player: 호텔-🏚🏚 랜드마크-🏰🏰");
		System.out.println("Computer: 호텔-🏦🏦  랜드마크-🏙🏙");
		System.out.println("LH마블 머니는 50원에서 게임이 시작 됩니다.");
		System.out.println("***************************승리배당***************************");
		System.out.println("1.컬러독점: 보유재산 x2 2.상대방 파산: 보유금액 +파산금액 3.7바퀴 완주: 보유재산 확보");
		System.out.println("");
		}
		
		System.out.println("===LH마블 게임에 오신걸 환영합니다!===");
		System.out.println("메뉴를 입력해주세요.");
		System.out.println("1. 게임시작/다시시작");
		System.out.println("2. 게임메뉴/돌아가기");
		System.out.println("===========================");

		int select2 = MM.sc.nextInt();
		MM.sc.nextLine();

		switch (select2) {
		case 1:
			MM.machine(select2,id);
			break;
		
        case 2:
			
			return;
		}

}
}

private static void BlackJack() {
			// TODO Auto-generated method stub
			BlackManager BM = BlackManager.getInstance();
			System.out.println(id.name+"님의 보유금액: "+(int)(id.money)+"원");
			while (true) {
					System.out.println("===블랙잭 게임에 오신걸 환영합니다!===");
					System.out.println("메뉴를 입력해주세요.");
					System.out.println("1. 게임시작/다시시작");
					System.out.println("2. 게임메뉴/돌아가기");
					System.out.println("===========================");

					int select2 = BM.sc.nextInt();
					BM.sc.nextLine();

					switch (select2) {
					case 1:
						BM.machine(select2,id);
						break;
					
		            case 2:
						
						return;
					}
			
		}
		}		      

private static void HorseRace() {

		    HorseManager HM = HorseManager.getInstance();
		    System.out.println(id.name+"님의 보유금액: "+(int)(id.money)+"원");
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

			int select = HM.sc.nextInt();
			HM.sc.nextLine();

			switch (select) {
			case 1:
				HM.machine(select,id);
				break;
			
            case 2:
				
				return;
			}
}
	}
}