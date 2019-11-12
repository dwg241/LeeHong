package me;


import java.util.Scanner;

public class PhoneBook2 {
public static void main(String[] args) {
		
		Data2 [] data =new Data2 ();
		Scanner kb = new Scanner(System.in);
		String str ="가정현나정현다정현"
				  + "라정현마정현바정현"
				  + "사정현아정현자정현"
				  + "차정현카정현타정현"
				  + "파정현하정현";
		for(int i=0; i<14;++i)
		 {
			data[i]= new Data();
			 int a= 3*i;
			 int b= a+3;
			 data[i].name =str.substring(a,b);
			 System.out.println(data[i].name);
		 }
		 for(int i=0; i<14;++i)
		 {
			data[i]= new Data();
			 int ran = (int)(Math.random()*9999999)+1;
			 data[i].number = "010"+ran;
			 System.out.println(data[i].number);
		 }
		
		 for(int i=0; i<14;++i)
		 {
			data[i]= new Data();
			int ran1 = (int)(Math.random()*99999)+1;
			data[i].birthday = "9"+ran1;
			System.out.println(data[i].birthday);
		 } 
		
		 System.out.println("IoT 전화번호부입니다.");
	
	while(true) {
		
	
		 System.out.println(data[1].name);
		    System.out.println("종료 [0] 검색 [1] 저장[2]");
			int	menu = kb.nextInt();
			
			if(menu==0)
			{
			break;
		    }
			
			if(menu==1) {
				System.out.println("이름을 찾아주세요!");
				String serach = kb.next();
				for(int i=0; i<15;++i)
			   { 
			   
				if( data[i].name!= null )
				{
				
				if(data[i].name.equals(serach))
				{
				System.out.println("이름: "
				+data[i].name+" 전화번호: "
				+data[i].number+ " 생일: " 
				+data[i].birthday);
				break;
			    }
				}
				}
			    }
			if(menu==2) {
				for(int i=0; i<15;++i)
				{
				if(data[i]==null) {
					data[i]= new Data();  //new 하는 이유

				System.out.println("이름을 입력하세요!");
			    String name = kb.next(); //nextline 하면 안되는 이유!!
			    data[i].name =name;
				System.out.println(data[i].name);
				 
				System.out.println("전화번호를 입력하세요!");
			    String number = kb.next(); 
			    data[i].number =number;
				System.out.println(data[i].number);
				 
				System.out.println("생일을 입력하세요!");
			    String birthday = kb.next(); 
			    data[i].birthday =birthday;
				System.out.println(data[i].birthday);
				
				break;
			
					}
				else if(data[14] !=null)
				{
					if(i==14)
					System.out.println("기록이 꽉찼습니다.");
				}
			        }
			        }
		else if(menu!=1 || menu!=2 || menu!=0)
			System.out.println("다시입력하세요!");
		
			    }
		
		
	
	}
}
