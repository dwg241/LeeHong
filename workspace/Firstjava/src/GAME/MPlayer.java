package GAME;

import java.util.Scanner;

public class MPlayer {
	Scanner kb = new Scanner(System.in);
	int Player=1; // 플레이어 말
	int PLap=6; // 바퀴수
	int PDie1; // 플레이어 주사위
	int PDie2;
	int Double=0;
	int result=0; // 게임 결과값
	String RandMark="🏰🏰"; //플레이어 랜드마크 건물
	String Hotel="🏚 🏚";  //플레이어 호텔 건물
	String Me="🚶🏴"; // 플레이어 말
    String You="🕴🏳 ";
	String CRandMark="🏙🏙"; // 컴퓨터 랜드마크 건물
	String CHotel="🏦🏦"; // 컴퓨터 호텔 건물
	int Pri=4; // 감옥 휴식 횟수
	int [] Toll= {0,10,2,2,2,0,3,3,1,4,
			      4,0,5,5,1,6,6,6,0,7,
			      7,0,8,8,0,9,9};
	// 통행료
	int [] Cost= {0,10,1,1,1,0,2,2,1,3,
		      3,0,4,4,1,5,5,5,0,6,
		      6,0,7,7,0,8,8};
	// 건물 매매 가격
	String [] name = {"공백","스타트","한국땅","일본땅","중국땅","보너스1","사우디","이라크","이벤트","남아공","이집트","터미널1"
			          ,"러시아","터키땅","없음","아르헨","브라질","멕시코","보너스2","그리스","독일땅","감옥","프랑스",
			          "영국땅","터미널2","캐나다","미국땅"};
	// 땅 이름
	String [] number = {"공백","01 ","02 ","03 ","04 ","05 ","06 ","07 ","08 ","09 ","10 ","11 ","12 ","13 ","14 "
            ,"15 ","16 ","17 ","18 ","19 ","20 ","21 ","22 ","23 ","24 ","25 ","26 "};
	// 땅 번호
    int angel=0;
    //천사 카드
	
	// 이름 및 돈 관리
	
    
	void PlayerDie(MMap map, MComputer mc) // 플레이어 주사위 던지기
	{
		if(Pri==4) 
		{
		
		if(map.H[Player].equals(You)) 
		{
			map.H[Player]="   ";
			map.CH[Player]=You;
		}	
		else if(map.H[Player].equals(Me)) {
		map.H[Player]="   ";
		}
		else {
		map.CH[Player]="   ";
		}
		
		//int PDie = kb.nextInt();
		int PDie1 =(int)(Math.random()*6+1);
		int P1=0;
		DieShow(PDie1,P1,map);
		int PDie2 = (int)(Math.random()*6+1);
		int P2=9;
		DieShow(PDie2,P2,map);
		System.out.println("주사위1: "+PDie1+" 주사위2: "+PDie2);
		Player=Player+PDie1+PDie2;
	    if(PDie1==PDie2)
	    {
		System.out.println("더블! (한번 더 진행할 수 있습니다. 최대2번)");
		Double++;
		}
	    if(PDie1!=PDie2)
		{
			Double=0;	
        }
		
		if(Double==4) {
		Player=21;
		
		Double=0;
		}
		
		if(Player>26)
		{
		 PLap++;
		 map.Lap1=PLap;
		
		 Player=Player-26;
		 map.Pmoney=map.Pmoney+10;
		 
		 System.out.println(PLap+"바퀴 돌았습니다. 월급 10원을 받습니다.");
		
		}
		
		System.out.println(name[Player]+" 도착");
    	if(map.CH[Player].equals("   ")) {
    	map.CH[Player]=Me;	
    	}
    	else {
    	map.H[Player]=Me;
    	}
    	map.ShowMap();
    	
    	if(PLap==7) {
    		Player=1;
    		System.out.println("LH마블을 완주했습니다!");
    		result=1;
    	
    	}
		}
		if(PLap<7)
    	GameAction(map,mc);  
	    
	    }
	
	
	private void DieShow(int all, int i, MMap map) {
		for(int j=1+i ; j<10+i ;j++) {
			map.D[j]=" ";
		}
			
		if(all==1)
		{
		map.D[5+i]="●"; 	
		}
		if(all==2)
		{
		map.D[3+i]="●";map.D[7+i]="●"; 	
		}
		if(all==3)
		{
		map.D[3+i]="●";map.D[5+i]="●";map.D[7+i]="●"; 	
		}	
		if(all==4)
		{
		map.D[1+i]="●";map.D[3+i]="●";map.D[7+i]="●";map.D[9+i]="●"; 	
		}
		if(all==5)
		{
		map.D[1+i]="●";map.D[3+i]="●";map.D[5+i]="●";map.D[7+i]="●";map.D[9+i]="●"; 	
		}
		if(all==6)
		{
		map.D[1+i]="●";map.D[3+i]="●";map.D[4+i]="●";map.D[6+i]="●";map.D[7+i]="●";map.D[9+i]="●"; 	
		}
	}



	void GameAction(MMap map, MComputer mc) // 지도 칸수 배정 
    {
		// 특수지역/////////////////////////////////////////////////////////////////////
		if(Player==1)
    	{
    	Start(map,mc);
     	}
		else if(Player==8)
    	{
    	Event(map,mc);
     	}
		else if(Player==11)
    	{
    	Terminal(map,mc);
     	}
		else if(Player==24)
    	{
        Terminal(map,mc);
     	}
		else if(Player==5)
    	{
        StarCard(map,mc);
     	}
		else if(Player==18)
    	{
    	StarCard(map,mc);
     	}
		else if(Player==14)
    	{
        Trip(map,mc);
     	}
		else if(Player==21)
    	{
        Prison(map,mc);
     	}
		///나라/////////////////////////
		else 
    	{
        Country(map,mc);
     	}
	
		
    }
	//////특수카드/////////////////////////////////////////////////////////
	
	private void StarCard(MMap map, MComputer mc) {
		int ran = (int)(Math.random()*5+1);
         
		System.out.println(map.Card[ran]+" 당첨!!");
		     if(ran==1){
		    	 map.CH[Player]="   ";
		    	 Player=21; 
		     GameAction(map,mc);
		    	       }
		else if(ran==2){
			map.CH[Player]="   ";
			 Player=14; 
		     GameAction(map,mc);
		}
		else if(ran==3) {
			map.CH[Player]="   "; 
			Player=1; 
		     GameAction(map,mc);
		}
		else if(ran==4)
		{
			System.out.println("20원을 받습니다.");
			map.Pmoney=map.Pmoney+20;
		}
		else if(ran==5)
		{
			System.out.println("해당지역 통행료 5배(후 덜덜)");
			System.out.println("어느지역에 올림픽을 개최할건가요?(*나라 이름을 꼭 3글자로 쳐주세요.)");
			String search= kb.next();
			for(int i=1 ;i<27;i++)
			{
			 if(name[i].equals(search)) {
			    if(map.Sp[i].equals(number[i]))
			    {
			    System.out.println("해당지역은 이벤트 불가지역입니다.");
			    break;
			    }
				 map.Price[map.O]=map.Price[map.O]/5;
				 map.E[map.O]="   ";
				 map.O=i; 
				if(map.O==map.S) {
					map.Price[i]=map.Price[i]*5;
					 map.E[i]="x"+(5*map.N);
					;
					 System.out.println(name[i]+" 통행료가 " +(5*map.N)+"배가 되었습니다.");
				     map.ShowMap(); 
					 break;
				} 
				 map.Price[i]=map.Price[i]*5;
				 map.E[i]="x5 ";
				 System.out.println(name[i]+" 통행료가 5배가 되었습니다.");
				 map.ShowMap();
				 break;
				
			 }
			
		}
		}
		else if(ran==6)
		{
			System.out.println("내가 가지고 있는 지역 랜덤매각");
			
		}
		else if(ran==7)
		{
			System.out.println("내가 가지고 있는 지역 랜덤매각");
			
		}
		else if(ran==8)
		{
			System.out.println("1회 한정 통행료 무료카드입니다.");
			angel=1;
		}
		
	}
	private void Trip(MMap map, MComputer mc) {
		if(map.Pmoney<1) {
			System.out.println("여행을 갈수 없습니다.");
			return;
		}
		
		
		System.out.println("여행을 하시겠습니까? Yes[1] No[2] (여행비 1원)");
		
		int select = kb.nextInt();
		
		if(select==1) {
		map.Pmoney=map.Pmoney-Cost[Player];
		System.out.println("가고싶은 곳을 입력해주세요!(나라이름: 3글자, 특수지역 이름: 이벤트, 보너스1/2, 터미널1/2, 스타트)");
		String search= kb.next();
		for(int i=1 ;i<27;i++)
		{
		 if(name[i].equals(search)) {
			map.CH[Player]="   ";
			Player=i; 
			if(i<14) {
			PLap++;
			map.Lap1=PLap;
			System.out.println(PLap+"바퀴 돌았습니다. 월급 10원을 받습니다. ");
			map.Pmoney=map.Pmoney+10;
			
			}
			GameAction(map,mc);
			if(PLap==7) {
	    		
	    		System.out.println("LH마블을 완주했습니다!");
	    		result=1;
	    	
	    	}
			break;
		    }
		}
		}
		else {
			System.out.println("세계여행 취소!");
		}
		
	}
	private void Prison(MMap map, MComputer mc) {
		Pri--;
		System.out.println("총 3턴을 쉽니다."+Pri+"턴 남음");
		if(Pri==0)
		{
		Pri=4;
		System.out.println("감옥탈출!");
		PlayerDie(map,mc);
		}
		if(Pri<3 && Pri>0)
		{
		System.out.println("더블로 빠져 나가기 [1] 10원 지불 [2]");
		int select=kb.nextInt();
		if(select==1)
		{
	     int Die1=(int)(Math.random()*6+1);
	     int Die2=(int)(Math.random()*6+1);
	     
	    
	    if((Die1+Die2)-(2*Die1)==0) 
	     {
	      System.out.println("1번 주사위: "+Die1+" ,2번 주사위: "+Die2+" 더블! 감옥탈출!"); 
	      
	      
	      if(map.H[Player].equals(You)) 
			{
				map.H[Player]="   ";
				map.CH[Player]=You;
			}	
			else if(map.H[Player].equals(Me)) {
			map.H[Player]="   ";
			}
			else {
			map.CH[Player]="   ";
			}
	      
	      Player=Player+Die1+Die2;
	      if(Player>26)
			{
			 PLap++;
			 map.Lap1=PLap;
			 Player=Player-26;
			 map.Pmoney=map.Pmoney+10;
			 System.out.println(PLap+"바퀴 돌았습니다. 월급 10원을 받습니다.");
			}
	      
	      GameAction( map,  mc);
	      if(PLap==7) {
	    		
	    		System.out.println("LH마블을 완주했습니다!");
	    		result=1;
	    	
	    	}
	     }
	     else {
	    	 System.out.println("1번 주사위: "+Die1+" ,2번 주사위: "+Die2+" 실패!");  
	    }
		}
		if(select==2)
		{
		System.out.println("10원 지불");
		map.Pmoney=map.Pmoney-10;
		Pri=4;
		PlayerDie(map, mc);
	    
		}
		}
		
	}
	
	private void Terminal(MMap map, MComputer mc) {
	System.out.println("터미널을 사용하시겠습니까?");
	System.out.println("Yes[1] NO[2]");
	int select=kb.nextInt();
	if(select==1) {	
	switch (Player) {
	case 24:
		System.out.println("이동완료");
		map.CH[Player]="   ";
		Player=11;
		map.CH[Player]=Me;
		map.ShowMap();
		break;
		
    case 11:
    	System.out.println("이동완료");
    	map.CH[Player]="   ";
    	Player=24;
 		map.CH[Player]=Me;
 		map.ShowMap();
 		break;
	}	
	}
	}
	private void Event(MMap map, MComputer mc) {
		if(map.Pmoney<1) {
			System.out.println("이벤트를 할 수 없습니다.");
			return;
		}
		
		
		
		map.N++;
		if(map.N>5)
		{
			map.N=5;	
		}
		System.out.println("이벤트 발동을 하시겠습니까? 1원 (이벤트 발동시 해당지역 통행료"+map.N+"배)");
		System.out.println("Yes[1] NO[2]");
		int select=kb.nextInt();
		if(select==1) {
			map.Pmoney=map.Pmoney-Cost[Player];
			System.out.println("어느지역에 이벤트를 할건가요?(*나라 이름을 꼭 3글자로 쳐주세요.)");
		String search= kb.next();
		
		
		for(int i=1 ;i<27;i++)
		{
		 if(name[i].equals(search)) {
		    if(map.Sp[i].equals(number[i]))
		    {
		    System.out.println("해당지역은 이벤트 불가지역입니다.");
		    break;
		    }
			 map.Price[map.S]=map.Price[map.S]/(map.N-1);
			 map.E[map.S]="   ";
			 map.S=i; 
			 map.Price[i]=map.Price[i]*map.N;
			 if(map.O==map.S) {
					map.Price[i]=map.Price[i]*5;
					 map.E[i]="x"+(5*map.N);
					;
					 System.out.println(name[i]+" 통행료가 " +(5*map.N)+"배가 되었습니다.");
				     map.ShowMap(); 
					 break;
				} 
			 
			 
			 map.E[i]="x"+map.N+" ";
			System.out.println(name[i]+" 통행료가 " +map.N+"배가 되었습니다.");
		   
			break;
			
		 }
		}

		map.ShowMap();
		} 
		if(select==2) {
			System.out.println("이벤트 발동 안함!");
		}
	}
	private void Start(MMap map, MComputer mc) {
		System.out.println("건물을 업그레이드 하고 싶은 지역이 있습니까?");
		System.out.println("Yes[1] NO[2]");
		int select=kb.nextInt();
		if(select==1) {
		System.out.println("어느지역을 업그레이드 할건가요?(*나라 이름을 꼭 3글자로 쳐주세요.)");
		String search2= kb.next();

		for(int i=1 ;i<27;i++)
		{
		if(name[i].equals(search2)) {
			map.Sp[i]=RandMark;
			 map.Price[Player]=Toll[Player]*2; 
		   	 if(map.S==Player) map.Price[Player]=map.Price[Player]*map.N;
		     if(map.O==Player) map.Price[Player]=map.Price[Player]*5;
			System.out.println(name[i]+"에 랜드마크 건설!");
		    map.ShowMap();
			break;
		 }
		}
		}
		if(select==2)
		{
		System.out.println("업그레이드를 안합니다.");
		}
	}
	
	
	
	/////////나라 /////////////////////////////////
	
	private void  Country(MMap map, MComputer mc) {
		if(map.Sp[Player].equals(Hotel)) {
			
	   		if(map.Pmoney<Cost[Player]*2){
	   			System.out.println("돈이 부족해서 건물을  지을 수 없습니다.");
	   		    return;
	   		}
			System.out.println("업그레이드 "+Cost[Player]*2+"원. 랜드마크를 짓겠습니까?");
	   		System.out.println("[1]YES [2]NO");
	   		int Select=kb.nextInt();
	   		if(Select==1)
	   		{
	   	    map.Pmoney=map.Pmoney-Cost[Player]*2;
	      	System.out.println(name[Player]+"에 랜드마크 건설.");
	      	 map.Price[Player]=Toll[Player]*2; 
		   	if(map.S==Player) map.Price[Player]=map.Price[Player]*map.N;
			if(map.O==Player) map.Price[Player]=map.Price[Player]*5;
	      	map.Sp[Player]=RandMark;
	        map.ShowMap();
	   		}
	   	    
		}
	   	if(map.Sp[Player].equals(CHotel))
	   	{
	   		int choice=0;
	   		
	   		if(angel==1) {
	   		System.out.println("천사카드를 쓰시 겠습니까? Yes[1] No[2]");
	   		 choice= kb.nextInt();
	   		
	   		}
	   		if(angel==0 || choice==2) {
		   		System.out.println("통행료"+ map.Price[Player]+"원 징수!");
		   		map.Pmoney=map.Pmoney-map.Price[Player];
		   		map.Cmoney=map.Cmoney+map.Price[Player];
		   		
	   		}
	   		if(map.Pmoney<0) {
				System.out.println("파산 했습니다.");
				result=4;
				return;
			}
	   		if(choice==1) {
	            System.out.println(map.Price[Player]+"원 무료");
	        	angel=0;
		   		}
	   		if(map.Pmoney<Cost[Player]*2){
	   			System.out.println("돈이 부족해서 건물을  인수 할 수 없습니다.");
	   		    return;
	   		}
	   	    System.out.println("건물을 인수하시겠습니까?");
	   	    System.out.println("[1]YES [2]NO");
	   	    int select= kb.nextInt();
	   	    if(select==1) {
	   	    	map.Pmoney=map.Pmoney-Cost[Player]*2;
	   	    	map.Cmoney=map.Cmoney+Cost[Player];
	   	    	System.out.println("인수비용 지불"+name[Player]+"에 랜드마크 건설.");
	   	    	map.Sp[Player]=RandMark;
	   	    
	   	    map.Price[Player]=Toll[Player]*2; 
	   	    if(map.S==Player) map.Price[Player]=map.Price[Player]*map.N;
			if(map.O==Player) map.Price[Player]=map.Price[Player]*5;
	   	    ColorN(map);
	   	    }   
	   	      if(map.Pmoney<0) result=4;
	   			map.ShowMap();
	       		}
	   	
	   	if(map.Sp[Player].equals(CRandMark))
	   	{
         	int choice=0;
	   		
	   		if(angel==1) {
	   		System.out.println("천사카드를 쓰시 겠습니까? Yes[1] No[2]");
	   		 choice= kb.nextInt();
	   		if(choice==1) {
            System.out.println(map.Price[Player]+"원 무료");
	   		}
	   		}
	   		if(angel==0 || choice==2) {
		   		System.out.println("통행료"+ map.Price[Player]+"원 징수!");
		   		map.Pmoney=map.Pmoney-map.Price[Player];
		   		map.Cmoney=map.Cmoney+map.Price[Player];
		   		}
	   		if(map.Pmoney<0) {
				System.out.println("파산 했습니다.");
				result=4;
				return;
			}
	   	      
	    }
	   	if(map.Sp[Player].equals(number[Player])){
	   		if(map.Pmoney<Cost[Player]){
	   			System.out.println("돈이 부족해서 건물을  지을 수 없습니다.");
	   		    return;
	   		}
	   		System.out.println(Cost[Player]+"원입니다. 호텔을 건설 하시겠습니까?");
	   		System.out.println("[1]YES [2]NO");
	   		int Select=kb.nextInt();
	   		if(Select==1)
	   		{
	   		map.Pmoney=map.Pmoney-Cost[Player];
	   		System.out.println(name[Player]+"에 호텔건설!");
	   		map.Sp[Player]=Hotel;
	   		map.Price[Player]=Toll[Player];
	   		ColorN(map);
	   		map.ShowMap();
	   		}
	   		}
	   	
		
	}


	private void ColorN(MMap map) {
		int a=0;
		if((map.Sp[2]==Hotel||map.Sp[2]==RandMark)&&(map.Sp[3]==Hotel||map.Sp[3]==RandMark)&&(map.Sp[4]==Hotel||map.Sp[4]==RandMark))
		{
			map.Color[0]=1;
		}
		if((map.Sp[15]==Hotel||map.Sp[15]==RandMark)&&(map.Sp[16]==Hotel||map.Sp[16]==RandMark)&&(map.Sp[17]==Hotel||map.Sp[17]==RandMark))
		{
			map.Color[1]=1;
		}
		if((map.Sp[6]==Hotel||map.Sp[6]==RandMark)&&(map.Sp[7]==Hotel||map.Sp[7]==RandMark))
		{
			map.Color[2]=1;
		}
		if((map.Sp[9]==Hotel||map.Sp[9]==RandMark)&&(map.Sp[10]==Hotel||map.Sp[10]==RandMark))
		{
			map.Color[3]=1;
		}
		if((map.Sp[12]==Hotel||map.Sp[12]==RandMark)&&(map.Sp[13]==Hotel||map.Sp[13]==RandMark))
		{
			map.Color[4]=1;
		}
		if((map.Sp[19]==Hotel||map.Sp[19]==RandMark)&&(map.Sp[20]==Hotel||map.Sp[20]==RandMark))
		{
			map.Color[5]=1;
		}
		if((map.Sp[22]==Hotel||map.Sp[22]==RandMark)&&(map.Sp[23]==Hotel||map.Sp[23]==RandMark))
		{
			map.Color[6]=1;
		}
		if((map.Sp[25]==Hotel||map.Sp[25]==RandMark)&&(map.Sp[26]==Hotel||map.Sp[26]==RandMark))
		{
			map.Color[7]=1;
		}
		for(int i=0; i<8; i++) {
			
			if(map.Color[i]==1){
			a++;
			map.Pcolor=a;
			}
		}
		if(map.Pcolor==3) result=3;
		
	}
	

}

		