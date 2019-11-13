package phone;

import java.util.Scanner;

public class PhoneBookMain3 {
	// 저장공간: 배열생성
	static PhoneInfor[] pBook =new PhoneInfor[100];
	
	static int cnt =0;

	static Scanner kb =new Scanner(System.in);

	public static void main(String[] args) {
		// 저장공간: 배열생성
		// 기능: 전화번호 정보저장, 검색, 삭제, 찾기 ( 검색어로 배열의 index 찾기)
		while(true) {
			System.out.println("[1]기록 [2]검색 [3]삭제 [4]종료" );
			System.out.println("원하시는 기능의 숫자를 입력해주세요!" );
			
			int menuNum = kb.nextInt();
			kb.nextLine();
			switch(menuNum) {
			
			case 1:
			insert();
			break;
			
			case 2:
			searchInfo();
			break;
			
			case 3:
			deleteInfo();
			break;
			
			case 4:
			System.out.println("프로그램을 종료합니다." );
			return;
			}
			
			 
		}
	}
	
	public static void insert() {
		
		System.out.println("_________________________________" );
		System.out.println("이름을 입력해주세요!" );
		String name =kb.nextLine();
		System.out.println("번호를 입력해주세요!" );
		String pNum =kb.nextLine();
		System.out.println("생일을 입력해주세요!" );
		String bDay =kb.nextLine();
		
		PhoneInfor pi =null;
		
		
		if(bDay != null && bDay.trim().length()>0) {
		 pi = new PhoneInfor(name, pNum, bDay);
		}
		else {
	     pi = new PhoneInfor(name, pNum, bDay);	
		}
		 
	
		pBook[cnt++] =pi;
		
        System.out.println("정상적으로 입력되었습니다." );
        System.out.println("저장된 정보의 개수는: " + cnt );
	}
	
	public static int searchIndex(String name) {
		
		// 찾는 index가 없다.
		int index =-1;
		for(int i=0; i<cnt;++i) {
			
			if(pBook[i].name.equals(name)) {
				index= i;
		     	break;
			}
		    }
		
		return index;
		
	}
	
	public static void searchInfo()
	{
		System.out.println("저장된 정보의 개수는: " + cnt );
		System.out.println("검색하고 싶은 이름을 입력하세요!"  );
		String name =kb.nextLine();
		
		int index = searchIndex(name);
	    // index => -1: 검색결과가 없다. 
		if(index<0)
		{
			System.out.println("찾으시는 정보가 없습니다." );
		}
		else {
			pBook[index].showInfo();
		}
	}
	
	public static void deleteInfo() {
		
		System.out.println("삭제하고자하는 이름을 입력해주세요!"  );
		String name =kb.nextLine();
		
		int index = searchIndex(name);
		if(index<0)
		{
			System.out.println("찾으시는 정보가 없습니다." );
		}
		else {
			for(int i=index; i<cnt-1 ;++i)
			{
				pBook[i]=pBook[i+1];
				
			}
			System.out.println("정상적으로 삭제되었습니다." );
		}
	}
	
}
