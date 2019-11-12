package me;


import java.util.Scanner;

public class BoardLee {
	public static void main(String[] args) 
	{
		String[] s = new String[20];
		Scanner kb = new Scanner(System.in);
		String m;
		String t;
		String result;
		s[0]="";
		while(true) {
		System.out.println(" ______IoT 4����� ������ �Խ����Դϴ�______");
	   for(int i=0;i<5;i++) {
		   System.out.println("|                                  |");
	   }
	    System.out.println("|        �ϰ���� ��ȣ�� �Է��ϼ���              |");
		System.out.println("|    1��:�۾��� 2��:�����ϱ� 3��:�߱�����    |");
		//for(int i=0;i<20;++i) {
		//	if(s[i]!=null) {
				
			
		System.out.println("       "+s[0]);
	//	break;
		//
		//	}
		//	}
		for(int i=0;i<7;i++) {
			System.out.println("|                                  |");
			if(i==6) {
				System.out.println("_____________________________________");
			}
		}
		
		
		 m=kb.nextLine();
		 if("4".equals(m))
			 break;
		
		 if("1".equals(m)) {
			 for(int i=0;i<20;++i) {
					if(s[i] == null) {
			 System.out.println("���� ���ÿ�");
			 t=kb.nextLine();
			 result=t;
			 s[i]=t;
			 break;
					}
			 }
			 
	 }
		 
		}
		kb.close();
}

	
}