package BlackJack;

import java.util.Scanner;

//기능 클래스
public class RuleManager {

	Player[] pBook ;
	
	
	int cnt;
	
	Scanner sc;
	String name;
	public static RuleManager getInstance() {
		if(m==null) {
			return new RuleManager();
		} else {
			return m;
		}
		
	}
	
	private static RuleManager m = new RuleManager();
	
	private RuleManager() {
	    pBook = new Player[5];
		sc = new Scanner(System.in);
	}
	

	 void moneyset() {
         
		int start1=0;
		int start2=0;
		Player wallet=null;
		wallet = new Player(start1,start2);
		System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");	
	    name=sc.nextLine();
		System.out.println("초기 금액은 100원에서 시작합니다.");
		int money = 100;
		wallet.insertmoney(money);
	    pBook[1]=wallet;
		
	}
	
	
	
	void machine(int select) {
		
		
		Player pi=null;
		
		int count=2;
		int Sum=0;
		int result;
		int Card1=1;
		int Card2=1;
		
		while(Card1 ==Card2) {

	
		  Card1=(int)(Math.random()*52+1);
		  Card2=(int)(Math.random()*52+1);
		}
		
		pi = new Player(Card1 ,Card2);
		 System.out.println("");
		 System.out.println("베팅금액을 입력해주세요!");
		int Bmoney = sc.nextInt();
	    pi.showBasicInfor(Card1,Card2);
	    if(pi.Sum2==21) 
	    {
	    	
			System.out.println("블랙잭 win");
			 pBook[1].money=pBook[1].money+2*Bmoney;
			 System.out.println( name +"님의 금액: "+ pBook[1].money+"원");
			 return;
	    }

		while(true) {
			System.out.println("");
					System.out.println("HIT [1] STOP [2]");
		    int menu = sc.nextInt();
		
		
		if(menu==1) {
	
			
		    pi.NewCard(count);
		    pi.show(count,Card1,Card2);
		    count++;
		    
			
		    result= pi.gameresult();
		   
		    if(result==1)
		    {
		    System.out.println("lose");
		
		    pBook[1].money=pBook[1].money-Bmoney;
		    System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
		    if(pBook[1].money<0) {
				System.out.println(name+ "님은 파산했습니다.");
				System.out.println(name+ "님은 100원이 자동충전됩니다.");
				pBook[1].money=100;
				return;
				}
		    break;
		    }
		    
		    if(result==2)
		    {
		    System.out.println("블랙잭 Win");
		    pBook[1].money=pBook[1].money+2*Bmoney;
		    System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
		    
		    break;
		    }
		    
	    }
		if(menu==2){
			Dealer di = new Dealer();
			if(pi.Sum2>pi.Sum) {
				di.dealergame(pi.Sum2,pi,count);
				result=di.result;
			}
			else{
				di.dealergame(pi.Sum,pi,count);
				result=di.result;
			}
			
			
		    if(result==1)
		    {
		    di.show(count);
		    System.out.println("");
		    System.out.println("lose");
		    pBook[1].money=pBook[1].money-Bmoney;
			System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
			 if(pBook[1].money<0) {
					System.out.println(name+ "님은 파산했습니다.");
					System.out.println(name+ "님은 100원이 자동충전됩니다.");
					pBook[1].money=100;
					return;
					}
			break;
		    }
		    
		    if(result==2)
		    {
		    di.show(count);
		    System.out.println("");
		    System.out.println("Win");
		    pBook[1].money=pBook[1].money+Bmoney;
			System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
		    break;
		    }
		}
		}
	}

	
}

	
		
	
	
	
	
	

	
	
	
	
	
