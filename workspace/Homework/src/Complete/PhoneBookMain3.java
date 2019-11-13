package Complete;

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
             insert();
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
		System.out.println("저장된 정보의 개수는: " + cnt );
		pBook[cnt-1].showInfo();
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
		String name =kb.nextLine();
		
		int index = searchIndex(name);
	}
}
