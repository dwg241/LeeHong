package GAME;

import java.util.Scanner;

public class MMap {
	Scanner kb = new Scanner(System.in);

	 String Card [] = {"공백","감옥☠","세계여행✈","출발🎲","올림픽 개최✋","자연재해🌩","강제매각권✋","천사카드💫"};
	// 스타카드 종류
	 String [] Sp = {"공백","01 ","02 ","03 ","04 ","05 ","06 ","07 ","08 ","09 ","10 ","11 ","12 ","13 ","14 "
			            ,"15 ","16 ","17 ","18 ","19 ","20 ","21 ","22 ","23 ","24 ","25 ","26 "};
    // 건물 칸 
	 int N=1; 
	// 이벤트 통행료 발동전 1배 
	 int S=0;
	// 이벤트 통행료  지역 구분 
	 int O=0;
	// 올림픽 지역 구분 
	 int Pmoney=50;
	//플레이어 블루마블 머니
	 int Cmoney=50;
	// 컴퓨터 부르마블 머니
	 int Pcolor;
	// 플레이어 컬러독점 현황
	 int Ccolor;
	// 컴퓨터 컬러독점 현황
	 int Color [] = new int [8];
	
	 String [] space = {"  ","  "};
	// 머니 현황 칸맞춤
	 String [] H = {"공백","🕴🏳 ","   ","   ","   ","   ","   ","   ","   ","   ",
            "   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",
            "   ","   ","   ","   ","   ","   ","   "};
	// 두번쨰 말칸
	 String [] D= {"공백"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
	// 주사위 칸
	 String [] CH = {"공백","   ","   ","   ","   ","   ","   ","   ","   ","   ",
            "   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",
            "   ","   ","   ","   ","   ","   ","   "};
    // 첫번째 말 칸
    int Price [] = {0,10,1,1,1,0,2,2,1,3,
		      3,0,4,4,1,5,5,5,0,6,
		      6,0,7,7,0,8,8};
	// 건물 가격 표시 및 통행료 표시
	 String [] zero = {"공백"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"
			         ," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"
			         ," 0"," 0"," 0"," 0"," 0"," 0"," 0"};
	// 그림 안깨지게 하기 위한 문자
	 String [] E = {"공백","   ","   ","   ","   ","   ","   ","   ","   ","   ",
			              "   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",
			              "   ","   ","   ","   ","   ","   ","   "};
	 // 건물 이벤트 통행료 배수 칸
	 int Lap1;
	 int Lap2;
	 int Lap3;
	 void ShowMap() {
		
		for(int i=1 ; i<27; i++) {
			
			if(Price[i]>9)
			{  
				zero[i]=" ";	
			}
			if(Price[i]>99)
			{  
				zero[i]="";	
			}
			if(Price[i]<10)
			{  
				zero[i]=" 0";	
			}
		    }
		
		if(Pmoney<10)
		{  
			space[0]="   ";	
		}
		if(Pmoney>9||Pmoney<0)
		{  
			space[0]="  ";	
		}
		
		if(Pmoney>99||Pmoney<-9)
		{  
			space[0]=" ";	
		}
		
		if(Pmoney<-99)
		{
		   space[0]="";
		}
		if(Cmoney<10)
		{  
			space[1]="   ";	
		}
		if(Cmoney>9||Cmoney<0)
		{  
			space[1]="  ";	
		}
		
		
		if(Cmoney>99||Cmoney<-9)
		{  
			space[1]=" ";	
		}
		
		if(Cmoney<-99)
		{
		   space[1]="";
		}
		
        Lap3=7-Math.max(Lap1,Lap2);
		// 남은 바퀴수
		
	
		System.out.println("┏━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┓");
		System.out.println("┃"+Sp[1]+"      ┃"+Sp[2]+" 한국땅  ┃"+Sp[3]+" 일본땅  ┃"+Sp[4]+" 중국땅  ┃"+Sp[5]+"      ┃"+Sp[6]+" 사우디  ┃"+Sp[7]+" 이라크  ┃"+Sp[8]+"      ┃");
		System.out.println("┃"+E[1]+H[1]+CH[1]+"┃"+E[2]+H[2]+CH[2]+"┃"+E[3]+H[3]+CH[3]+"┃"+E[4]+H[4]+CH[4]+"┃"+E[5]+H[5]+CH[5]+"┃"+E[6]+H[6]+CH[6]+"┃"+E[7]+H[7]+CH[7]+"┃"+E[8]+H[8]+CH[8]+"┃");
		System.out.println("┃Start+10₩┃White"+zero[2]+Price[2]+"₩┃White"+zero[3]+Price[3]+"₩┃White"+zero[4]+Price[4]+"₩┃Star Card┃Green"+zero[6]+Price[6]+"₩┃Green"+zero[7]+Price[7]+"₩┃Event  1₩┃");
		System.out.println("┣━━━━━━━━━╋━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━╋━━━━━━━━━┫");
		System.out.println("┃"+Sp[26]+" 미국땅  ┃     ┌───────┐   ┌───────┐            ┏━━━━━━━━━━━━━━━┓    ┃"+Sp[9]+" 남아공  ┃");
		System.out.println("┃"+E[26]+H[26]+CH[26]+"┃     │ "+D[1]+" "+D[2]+" "+D[3]+" │   │ "+D[10]+" "+D[11]+" "+D[12]+" │            ┃✨✨✨✨✨✨✨✨ ┃    ┃"+E[9]+H[9]+CH[9]+"┃");  
		System.out.println("┃Gray "+zero[26]+Price[26]+"₩┃     │ "+D[4]+" "+D[5]+" "+D[6]+" │   │ "+D[13]+" "+D[14]+" "+D[15]+" │            ┃✨  Star Card ✨  ┃    ┃Red  "+zero[9]+Price[9]+"₩┃");
		System.out.println("┣━━━━━━━━━┫     │ "+D[7]+" "+D[8]+" "+D[9]+" │   │ "+D[16]+" "+D[17]+" "+D[18]+" │            ┃✨✨✨✨✨✨✨✨ ┃    ┣━━━━━━━━━┫");
		System.out.println("┃"+Sp[25]+" 캐나다  ┃     └───────┘   └───────┘            ┗━━━━━━━━━━━━━━━┛    ┃"+Sp[10]+" 이집트  ┃");
		System.out.println("┃"+E[25]+H[25]+CH[25]+"┃                                                           ┃"+E[10]+H[10]+CH[10]+"┃");  
		System.out.println("┃Gray "+zero[25]+Price[25]+"₩┃                                                           ┃Red  "+zero[10]+Price[10]+"₩┃");			
		System.out.println("┣━━━━━━━━━┫-----------------------------------------------------------┣━━━━━━━━━┫");
		System.out.println("┃"+Sp[24]+"      ┃                                                           ┃"+Sp[11]+"      ┃");
		System.out.println("┃"+E[24]+H[24]+CH[24]+"┃  -   -   -   -   -   -   -   -   -   -   -   -   -   -    ┃"+E[11]+H[11]+CH[11]+"┃");  
		System.out.println("┃Terminal ┃                                                           ┃Terminal ┃");			
		System.out.println("┣━━━━━━━━━┫-----------------------------------------------------------┣━━━━━━━━━┫");
		System.out.println("┃"+Sp[23]+" 영국땅  ┃                                                           ┃"+Sp[12]+" 러시아  ┃");
		System.out.println("┃"+E[23]+H[23]+CH[23]+"┃                                                           ┃"+E[12]+""+H[12]+CH[12]+"┃");  
		System.out.println("┃Brown"+zero[23]+Price[23]+"₩┃                                                           ┃Blue "+zero[12]+Price[12]+"₩┃");			
		System.out.println("┣━━━━━━━━━┫    Rest 바퀴수: "+Lap3+"/7                                         ┣━━━━━━━━━┫");
		System.out.println("┃"+Sp[22]+" 프랑스  ┃    Player  [ money:"+space[0]+Pmoney+"₩  Color monopoly: "+Pcolor+"]              ┃"+Sp[13]+" 터키땅  ┃");
		System.out.println("┃"+E[22]+H[22]+CH[22]+"┃    Computer[ money:"+space[1]+Cmoney+"₩  Color monopoly: "+Ccolor+"]              ┃"+E[13]+H[13]+CH[13]+"┃");  
		System.out.println("┃Brown"+zero[22]+Price[22]+"₩┃                                                           ┃Blue "+zero[13]+Price[13]+"₩┃");			
		System.out.println("┣━━━━━━━━━╋━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━╋━━━━━━━━━┫");
		System.out.println("┃"+Sp[21]+"      ┃"+Sp[20]+" 독일땅  ┃"+Sp[19]+" 그리스  ┃"+Sp[18]+"      ┃"+Sp[17]+" 멕시코  ┃"+Sp[16]+" 브라질  ┃"+Sp[15]+" 아르헨  ┃"+Sp[14]+"      ┃");
		System.out.println("┃"+E[21]+H[21]+CH[21]+"┃"+E[20]+H[20]+CH[20]+"┃"+E[19]+H[19]+CH[19]+"┃"+E[18]+H[18]+CH[18]+"┃"+E[17]+H[17]+CH[17]+"┃"+E[16]+H[16]+CH[16]+"┃"+E[15]+H[15]+CH[15]+"┃"+E[14]+H[14]+H[14]+"┃");  
		System.out.println("┃Prison   ┃Pink "+zero[20]+Price[20]+"₩┃Pink "+zero[19]+Price[19]+"₩┃Star Card┃Black"+zero[17]+Price[17]+"₩┃Black"+zero[16]+Price[16]+"₩┃Black"+zero[15]+Price[15]+"₩┃ Trip  1₩┃");			
		System.out.println("┗━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━┛");
		
	}
	


}

