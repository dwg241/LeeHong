package GAME;

import java.util.Scanner;

public class MComputer {
	Scanner kb = new Scanner(System.in);
	int Computer=1;
	int CLap;
	int CDie1;
	int CDie2;
	int angel;
	int result;
	int Double;
	String RandMark="🏰🏰"; //플레이어 랜드마크 건물
	String Hotel="🏚🏚";  //플레이어 호텔 건물
	String Me="🕴🏳 "; // 컴퓨터 말
	String You="🚶🏴";
	String CRandMark="🏙🏙"; // 컴퓨터 랜드마크 건물
	String CHotel="🏦🏦"; // 컴퓨터 호텔 건물
	int [] Toll= {0,10,2,2,2,0,3,3,1,4,
			      4,0,5,5,1,6,6,6,0,7,
			      7,0,8,8,0,9,9};
	int [] Cost= {0,10,1,1,1,0,2,2,1,3,
		      3,0,4,4,1,5,5,5,0,6,
		      6,0,7,7,0,8,8};
    int Pri=4;
	String [] name = {"공백","출발점","한국","일본","중국","보너스카드","사우디","이라크","이벤트","남아공","이집트","터미널"
			          ,"러시아","터키","세계여행","아르헨티나","브라질","멕시코","보너스카드","그리스","독일","감옥","프랑스",
			          "영국","터미널","캐나다","미국"};
	String [] number = {"공백","01 ","02 ","03 ","04 ","05 ","06 ","07 ","08 ","09 ","10 ","11 ","12 ","13 ","14 "
            ,"15 ","16 ","17 ","18 ","19 ","20 ","21 ","22 ","23 ","24 ","25 ","26 "};
	
	
	
	void ComputerDie(MMap map, MPlayer mp)
	{
		if(Pri==4) {
		if(map.H[Computer].equals(You)) 
		{
			map.H[Computer]="   ";
			map.CH[Computer]=You;
		}	
		else if(map.H[Computer].equals(Me)) {
		map.H[Computer]="   ";
		}
		else {
		map.CH[Computer]="   ";
		}
		
		int CDie1 = (int)(Math.random()*6+1);
		int C1=0;
		DieShow(CDie1,C1,map);
		int CDie2 = (int)(Math.random()*6+1);
	    int C2=9;
		DieShow(CDie2,C2,map);
		System.out.println("주사위1: "+CDie1+" 주사위2: "+CDie2);
		Computer=Computer+CDie1+CDie2;
		 if(CDie1==CDie2)
		    {
			System.out.println("더블! (한번 더 진행할 수 있습니다. 최대2번)");
			Double++;
			}
		    if(CDie1!=CDie2)
			{
				Double=0;	
	        }
			
			if(Double==4) {
			Computer=21;
			
			Double=0;
			}
		if(Computer>26)
		{
		 CLap++;
		 map.Lap2=CLap;
		 Computer=Computer-26;
		 map.Cmoney=map.Cmoney+10;
		 System.out.println(CLap+"바퀴 돌았습니다. 월급 10원을 받습니다.");
		}
		if(CLap==7) {
    		Computer=1;
    		System.out.println("LH마블을 완주했습니다!");
    		result=1;
    	
    	}
		System.out.println(name[Computer]+" 도착");
		if(map.CH[Computer].equals("   ")) {
	    	map.CH[Computer]=Me;	
	    	}
	    	else {
	    	map.H[Computer]=Me;
	    	}
    	
    	map.ShowMap();
		}
		if(CLap<7) GameAction(map,mp);
    	
	}
	
	
	private void DieShow(int all,int i,MMap map) {
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
	
	
	void GameAction(MMap map, MPlayer mp)
    {
		if(Computer==1)
    	{
    	Start(map,mp);
     	}
		else if(Computer==8)
    	{
    	Event(map,mp);
     	}
		else if(Computer==11)
    	{
    	Terminal(map,mp);
     	}
		else if(Computer==24)
    	{
        Terminal(map,mp);
     	}
		else if(Computer==5)
    	{
        StarCard(map,mp);
     	}
		else if(Computer==18)
    	{
    	StarCard(map,mp);
     	}
		else if(Computer==14)
    	{
        Trip(map,mp);
     	}
		else if(Computer==21)
    	{
        Prison(map,mp);
     	}
		
		///나라/////////////////////////
		else
    	{
    	
         Country(map,mp);
     	}
		
	
  
       	
    }
	private void Prison(MMap map, MPlayer mp) {
		Pri--;
		int select=0;
		System.out.println("총 3턴을 쉽니다."+Pri+"턴 남음");
		if(Pri==0)
		{
		Pri=4;
		System.out.println("감옥탈출!");
		ComputerDie(map,mp);
		}
		if(Pri<3 && Pri>0)
		{
		System.out.println("더블로 빠져 나가기 [1] 10원 지불 [2]");
		
		
		if(Pri==2) {select=1;}	
		
		if(Pri==1) {select=2;}
		
		if(select==1)
		{
	     int Die1=(int)(Math.random()*6+1);
	     int Die2=(int)(Math.random()*6+1);
	     
	    
	    if((Die1+Die2)-(2*Die1)==0) 
	     {
	      System.out.println("1번 주사위: "+Die1+" ,2번 주사위: "+Die2+" 더블! 감옥탈출!"); 
	      map.CH[Computer]="   ";
	      Computer=Computer+Die1+Die2;
	      if(map.H[Computer].equals(You)) 
			{
				map.H[Computer]="   ";
				map.CH[Computer]=You;
			}	
			else if(map.H[Computer].equals(Me)) {
			map.H[Computer]="   ";
			}
			else {
			map.CH[Computer]="   ";
			}
	      if(Computer>26)
			{
			 CLap++;
			 map.Lap2=CLap;
			 Computer=Computer-26;
			 map.Cmoney=map.Cmoney+10;
			 System.out.println(CLap+"바퀴 돌았습니다. 월급 10원을 받습니다.");
			}
	      
	      GameAction(map,mp);
	  	if(CLap==7) {
    		Computer=1;
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
	    ComputerDie(map,mp);
		}
		}
		
	}
	private void Trip(MMap map, MPlayer mp) {
		if(map.Cmoney<1) {
			System.out.println("여행을 갈수 없습니다.");
			return;
		}
		System.out.println("가고싶은 곳을 입력해주세요!(나라이름: 3글자, 특수지역 이름: 이벤트, 보너스1/2, 터미널1/2, 스타트)");
		System.out.println("스타트");
		Computer=1;
		map.CH[Computer]="   ";
		CLap++;
		map.Lap2=CLap;
		map.Cmoney=map.Cmoney+10;
		System.out.println(CLap+"바퀴 돌았습니다. 월급 10원을 받습니다.");
		System.out.println(name[Computer]+" 도착");
		if(map.CH[Computer].equals("   ")) {
	    	map.CH[Computer]=Me;	
	    	}
	    	else {
	    	map.H[Computer]=Me;
	    	}
		GameAction(map,mp);
		if(CLap==7) {
    		Computer=1;
    		System.out.println("LH마블을 완주했습니다!");
    		result=1;
    	
    	}
	}
	private void Start(MMap map, MPlayer mp) {
		System.out.println("건물을 업그레이드 하고 싶은 지역이 있습니까?");
		
		for(int i=1 ;i<27;i++)
		{
			if(map.Sp[i].equals(CHotel)) {
			System.out.println("Yes");
		    map.Sp[i]=CRandMark; 
		    map.Price[Computer]=Toll[Computer]*2; 
		   	if(map.S==Computer) map.Price[Computer]=map.Price[Computer]*map.N;
		    if(map.O==Computer) map.Price[Computer]=map.Price[Computer]*5;
			System.out.println(name[i]+"에 랜드마크 건설!");
		    map.ShowMap();
			break;
		 }
			if(i==26)
			{System.out.println("업그레이드할 건물이 없습니다.");
			}
		}
	}
	private void StarCard(MMap map, MPlayer mp) {
		int ran = (int)(Math.random()*5+1);
        
		System.out.println(map.Card[ran]+" 당첨!!");
		     if(ran==1){
		    map.CH[Computer]="   ";
		    Computer=21; 
		     GameAction(map,mp);
		    	       }
		else if(ran==2){
			map.CH[Computer]="   ";
			Computer=14; 
		     GameAction(map,mp);
		}
		else if(ran==3) {
			map.CH[Computer]="   ";
			Computer=1; 
		     GameAction(map,mp);
		}
		else if(ran==4)
		{
			System.out.println("20원을 받습니다.");
			map.Cmoney=map.Cmoney+20;
		}
		else if(ran==5)
		{
			System.out.println("해당지역 통행료 5배(후 덜덜)");
			System.out.println("어느지역에 올림픽을 개최할건가요?(*나라 이름을 꼭 3글자로 쳐주세요.)");
		
			for(int i=1 ;i<27;i++)
			{
			 if(map.Sp[i].equals(CHotel)||map.Sp[i].equals(CRandMark)) {
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
			if(i==26) System.out.println("올림픽 개최할 지역이 없습니다.");
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
	private void Terminal(MMap map, MPlayer mp) {
		System.out.println("터미널을 사용하시겠습니까?");
		System.out.println("Yes");
	
		switch (Computer) {
		case 24:
			System.out.println("이동완료");
			map.CH[Computer]="   ";
			Computer=11;
			map.CH[Computer]=Me;
	        map.ShowMap();
			break;
			
	    case 11:
	    	System.out.println("이동완료");
	    	map.CH[Computer]="   ";
	    	Computer=24;
	 		map.CH[Computer]=Me;
	 		map.ShowMap();
	 		break;
	
		}
		
	}
	private void Event(MMap map, MPlayer mp) {
		if(map.Cmoney<1) {
			System.out.println("이벤트를 할 수 없습니다.");
			return;
		}
		map.N++;
	    
		if(map.N>5)
		{
		map.N=5;	
		}
		System.out.println("이벤트 발동을 하시겠습니까?(이벤트 발동시 해당지역 통행료"+map.N+"배)");
		
		
		for(int i=1 ;i<27;i++)
		{
		 if(map.Sp[i].equals(CHotel)||map.Sp[i].equals(CRandMark)) {
			System.out.println("Yes");	 
			map.Cmoney=map.Cmoney-Cost[Computer];
		
			map.Price[map.S]=map.Price[map.S]/(map.N-1);
			map.E[map.S]="   ";
			map.S=i; 
			if(map.O==map.S) {
				map.Price[i]=map.Price[i]*5;
				 map.E[i]="x"+(5*map.N);
				
				 System.out.println(name[i]+" 통행료가 " +(5*map.N)+"배가 되었습니다.");
			     map.ShowMap(); 
				 break;
			} 
			
			map.Price[i]=map.Price[i]*map.N;
			map.E[i]="x"+map.N+" ";
		    System.out.println(name[i]+" 통행료가 " +map.N+"배가 되었습니다.");
		    
			break;
		    }
		
		if(i==26) {
			
			System.out.println("이벤트 발동 지역 없음");
		}
		}
		
		map.ShowMap();
		} 
		
	
	private void Country(MMap map, MPlayer mp) {
		
		if(map.Sp[Computer].equals(CHotel)) {
			if(map.Cmoney<Cost[Computer]*2){
	   			System.out.println("돈이 부족해서 건물을  지을 수 없습니다.");
	   		    return;
	   		}
			System.out.println("업그레이드 "+Cost[Computer]*2+"원 . 랜드마크를 짓겠습니까?");
	   		System.out.println("YES");
	   		
	   		map.Cmoney=map.Cmoney-Cost[Computer]*2;
	      		 System.out.println(name[Computer]+"에 랜드마크 건설.");
	      		 map.Sp[Computer]=CRandMark;
	      
	      	    map.Price[Computer]=Toll[Computer]*2; 
			   	if(map.S==Computer) map.Price[Computer]=map.Price[Computer]*map.N;
			    if(map.O==Computer) map.Price[Computer]=map.Price[Computer]*5;
	      		 map.ShowMap();
	   		
	   	}
	   	if(map.Sp[Computer].equals(Hotel))
	   	{
	   		if(angel==0) {
	   		System.out.println("통행료 "+ Toll[Computer]+"원 지불");
	   		map.Cmoney=map.Cmoney-map.Price[Computer];
	   	    map.Pmoney=map.Pmoney+map.Price[Computer];
	   		}
	   		if(map.Cmoney<0) {
				System.out.println("파산 했습니다.");
				result=4;
				return;
			}
	   	    if(angel==1) {
	   			System.out.println("천사카드 사용!");
	   			angel=0;
	   			System.out.println("통행료 무료");
	   		}
	   	 if(map.Cmoney<Cost[Computer]*2){
	   			System.out.println("돈이 부족해서 건물을  인수 할 수 없습니다.");
	   		    return;
	   		}
	   	    System.out.println("건물을 인수하시겠습니까?");
	   	    System.out.println("YES");
	   	   
	   	    	map.Cmoney=map.Cmoney-Cost[Computer]*2;
	   	    	map.Pmoney=map.Pmoney+Cost[Computer];
	   	    	System.out.println("인수비용 지불"+name[Computer]+"에 랜드마크 건설.");
	   	    
	   	         map.Sp[Computer]=CRandMark;
	   			 map.Price[Computer]=Toll[Computer]*2;
	   			if(map.S==Computer) map.Price[Computer]=map.Price[Computer]*map.N;
			    if(map.O==Computer) map.Price[Computer]=map.Price[Computer]*5; 
			    ColorN(map); 
			    map.ShowMap();
	       		}
	   	
	   	
	   	if(map.Sp[Computer].equals(RandMark))
	   	{
	   		if(angel==0) {
	   		System.out.println("통행료 "+map.Price[Computer]+"원지불");
	   		map.Cmoney=map.Cmoney-map.Price[Computer];
	   		map.Pmoney=map.Pmoney+map.Price[Computer];	   			 
	   		}
	   		if(map.Cmoney<0) {
				System.out.println("파산 했습니다.");
				result=4;
				return;
			}
	   		if(angel==1) {
	   			System.out.println("천사카드 사용!");
	   			angel=0;
	   			System.out.println("통행료 무료! ");
	   		}
	   		map.ShowMap();
	       		}
	   	
	   	if(map.Sp[Computer].equals(number[Computer])){
	   		if(map.Cmoney<Cost[Computer]){
	   			System.out.println("돈이 부족해서 건물을  인수 할 수 없습니다.");
	   		    return;
	   		}
	   		System.out.println("1원입니다. 호텔을 짓겠습니까?");
	   		System.out.println("YES");
	   
	   		map.Cmoney=map.Cmoney-Cost[Computer];
	   		System.out.println(name[Computer]+"에 호텔건설!");
	   		map.Sp[Computer]=CHotel;
	   		map.Price[Computer]=Toll[Computer];
	   	    ColorN(map);
	   		map.ShowMap();
	   		
	   		}
		
		
	}

	private void ColorN(MMap map) {
		int a=0;
		if((map.Sp[2]==CHotel||map.Sp[2]==CRandMark)&&(map.Sp[3]==CHotel||map.Sp[3]==CRandMark)&&(map.Sp[4]==CHotel||map.Sp[4]==CRandMark))
		{
			map.Color[0]=2;
		}
		if((map.Sp[15]==CHotel||map.Sp[15]==CRandMark)&&(map.Sp[16]==CHotel||map.Sp[16]==CRandMark)&&(map.Sp[17]==CHotel||map.Sp[17]==CRandMark))
		{
			map.Color[1]=2;
		}
		if((map.Sp[6]==CHotel||map.Sp[6]==CRandMark)&&(map.Sp[7]==CHotel||map.Sp[7]==CRandMark))
		{
			map.Color[2]=2;
		}
		if((map.Sp[9]==CHotel||map.Sp[9]==CRandMark)&&(map.Sp[10]==CHotel||map.Sp[10]==CRandMark))
		{
			map.Color[3]=2;
		}
		if((map.Sp[12]==CHotel||map.Sp[12]==CRandMark)&&(map.Sp[13]==CHotel||map.Sp[13]==CRandMark))
		{
			map.Color[4]=2;
		}
		if((map.Sp[19]==CHotel||map.Sp[19]==CRandMark)&&(map.Sp[20]==CHotel||map.Sp[20]==CRandMark))
		{
			map.Color[5]=2;
		}
		if((map.Sp[22]==CHotel||map.Sp[22]==CRandMark)&&(map.Sp[23]==CHotel||map.Sp[23]==CRandMark))
		{
			map.Color[6]=2;
		}
		if((map.Sp[25]==CHotel||map.Sp[25]==CRandMark)&&(map.Sp[26]==CHotel||map.Sp[26]==CRandMark))
		{
			map.Color[7]=2;
		}
		for(int i=0; i<8; i++) {
			
			if(map.Color[i]==2){
			a++;
			map.Ccolor=a;
			}
		}
		if(map.Pcolor==3) result=3;
		
	}

		
	
}
