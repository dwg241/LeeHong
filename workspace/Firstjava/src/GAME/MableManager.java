package GAME;

import java.util.Scanner;

//기능 클래스
public class MableManager {

	
	
	
	Scanner sc;
	String name;
	
	int End;
	public static MableManager getInstance() {
		if(m==null) {
			return new MableManager();
		} else {
			return m;
		}
		
	}
	
	private static MableManager m = new MableManager();
	
	private MableManager() {
	    
		sc = new Scanner(System.in);
	}
	
	
	void machine(ID id) {
		MMap map = new MMap();
		MComputer mc = new MComputer();
		MPlayer mp = new MPlayer();

		id.End=0;
		id.money=id.money-50;
		
		String computer="LH";
		System.out.println( id.name +"님의 상대는 "+computer+"입니다.");
		System.out.println( "게임을 시작해주세요!");
		
		while(true) {
			int choice=0;
		{
		// int Die=(int)(Math.random()*6+1);
		while(true) {
			System.out.println(id.name+"의 턴: 주사위 구르기 [1] 게임포기 [2]");
			choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
	    mp.PlayerDie(map,mc);
	    GameResult(id,mp,mc,map);
		
	    if(mp.Double==0) break;
		}
	    
		if(End==1)
	    	{
	    	End=0;
	    	break;
	    	}
	    
	    
	    System.out.println("다음턴을 진행하려면 엔터를 누르세요!");
	    
	    String enter = sc.nextLine();
	    
	    
	    System.out.println(computer+"가 플레이 했습니다.");
	    while(true) {
	    mc.ComputerDie(map,mp);
	    GameResult(id,mp,mc,map);
	    if(mp.Double==0) break;
 
	    }
	    if(End==1) 
	    {
	    End=0;
	    break;
	    }
		
		}
		if(choice==2)
		{
			System.out.println("게임에서 패배 했습니다.");
			break;
		}
		}
 	}


	private void GameResult(ID id, MPlayer mp, MComputer mc, MMap map) {
	    
	    if(mp.result==1)
	    {
	    	for(int i=1 ; i<27 ; i++) {
			    if(map.Sp[i]==mp.Hotel) map.Pmoney=map.Pmoney+mp.Cost[i];
			    if(map.Sp[i]==mp.RandMark) map.Pmoney=map.Pmoney+mp.Cost[i]*2;
			    
			    }
	    	for(int i=1 ; i<27 ; i++) {
			    if(map.Sp[i]==mc.CHotel) map.Cmoney=map.Pmoney+mp.Cost[i];
			    if(map.Sp[i]==mc.CRandMark) map.Cmoney=map.Pmoney+mp.Cost[i]*2;
			    }
	    	if(map.Cmoney>map.Pmoney) System.out.println(id.name+"님 패배하셨습니다.");
	        if(map.Cmoney<=map.Pmoney)
	        {
	        	System.out.println(id.name+"님 승리");
	        	System.out.println(map.Pmoney+"원 획득!");
	        	id.money=id.money+map.Pmoney;
	        }
	    
	    }
	  
	     if(mp.result==3)
	    {
	    System.out.println(id.name+"님 컬러독점 승리^^");
	    for(int i=1 ; i<27 ; i++) {
		    if(map.Sp[i]==mp.Hotel) map.Pmoney=map.Pmoney+mp.Cost[i];
		    if(map.Sp[i]==mp.RandMark) map.Pmoney=map.Pmoney+mp.Cost[i]*2;
		    
		    }
		    System.out.println(map.Pmoney*2+"원 획득!");
		    id.money=id.money+map.Pmoney*2;
		    
	    }
	    if(mp.result==4)
	    {
	    	
	    System.out.println(id.name+"님 파산 패패ㅠㅠ");  
	    
	    }
	    if(mc.result==1)
	    {
	    	for(int i=1 ; i<27 ; i++) {
			    if(map.Sp[i]==mp.Hotel) map.Pmoney=map.Pmoney+mp.Cost[i];
			    if(map.Sp[i]==mp.RandMark) map.Pmoney=map.Pmoney+mp.Cost[i]*2;
			    
			    }
	    	for(int i=1 ; i<27 ; i++) {
			    if(map.Sp[i]==mc.CHotel) map.Cmoney=map.Pmoney+mp.Cost[i];
			    if(map.Sp[i]==mc.CRandMark) map.Cmoney=map.Pmoney+mp.Cost[i]*2;
			    }
	    	if(map.Cmoney>=map.Pmoney) System.out.println(id.name+"님 패배하셨습니다.");
	        if(map.Cmoney<map.Pmoney)
	        {
	        	System.out.println(id.name+"님 승리");
	        	System.out.println(map.Pmoney+"원 획득!");
	        	id.money=id.money+map.Pmoney;
	        }
	    
	    }
	   
	    if(mc.result==3)
	    {
	    System.out.println(id.name+"님 컬러독점 패패 ㅜㅜ");
	  
	    }
	    if(mc.result==4)
	    {
	    System.out.println(id.name+"님 파산 승리^^");
	    for(int i=1 ; i<27 ; i++) {
		    if(map.Sp[i]==mp.Hotel) map.Pmoney=map.Pmoney+mp.Cost[i];
		    if(map.Sp[i]==mp.RandMark) map.Pmoney=map.Pmoney+mp.Cost[i]*2;
		    
		    }
		    System.out.println(map.Pmoney+"원 획득!");
		    id.money=id.money+map.Pmoney;
		    
	    }
	
	    if(mp.result>0||mc.result>0) {
		
	    id.End=1;
		End=1;
	    }
	}


	


	
	
	
	


	
}

	
		
	
	
	
	
	

	
	
	
	
	
