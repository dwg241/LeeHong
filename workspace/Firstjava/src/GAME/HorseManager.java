package GAME;

import java.util.Scanner;

//기능 클래스
public class HorseManager {

	
	
	Scanner sc;
	String name;
	public static HorseManager getInstance() {
		if(m==null) {
			return new HorseManager();
		} else {
			return m;
		}
		
	}
	
	private static HorseManager m = new HorseManager();
	
	private HorseManager() {
	    
		sc = new Scanner(System.in);
	}
	
	
	void machine(int select, ID id) {
	 
		Horeses h= new Horeses();
	    int times=0;
		int Bmoney=0;
		int best=(int)(Math.random()*6+1);
		int worst=(int)(Math.random()*6+1);
		
		while(worst==best) {
		best =(int)(Math.random()*6+1);
		}
	
		
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		for(int i=1 ; i<7;i++) {
		System.out.print(i+"번 레인|");
        System.out.println("馬");
		}
         System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		System.out.println("이달의 馬: "+best+"번    최악의馬: "+worst+"번");
         while(true) {
			times++;
			if(times<4) {
			System.out.println("");
			System.out.println("베팅을 걸지 않으려면 0원을 입력하세요!");
		    
			
			while(true) {
				System.out.println("베팅금액을 입력해주세요!");
				Bmoney = sc.nextInt();
				if(Bmoney<id.money) {
				break;
				}
				System.out.println("보유하고 있는 "+id.money+"원 보다 많습니다.");
			
				}
			
			if(Bmoney!=0) {
			System.out.println("몇번 말에 거시겠습니까!");
			System.out.println("[1] [2] [3] [4] [5] [6]");
			int hores = sc.nextInt();
			sc.nextLine();
			h.insertmoney(hores, Bmoney, times);
			}
			}
			if(times>3) {
		    System.out.println(times+ " Round 진행하고 싶으면 엔터를 누르세요.");
		    String go = sc.nextLine();
		   
			}
			
			h.Start(times,worst,best);
			h.PeopleMoney(times);
			h.Moneychart(times);
			
			if(h.goal==1) {
				for(int i=1 ; i<7 ;i++) 
				{
			    id.money=id.money+h.HoresMoney[i][0]; 
				}
				System.out.println(id.name +"님의 잔액: " +(int)(id.money)+"원");
				if(id.money<0) {
					System.out.println(id.name+ "님은 파산했습니다.");
					System.out.println(id.name+ "님은 100원이 자동충전됩니다.");
					id.money=100;
					return;
					}
				break;
			
			}
			
			}
	
	
	}


	
}

	
		
	
	
	
	
	

	
	
	
	
	
