package single;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookManager {

    HashSet<PhoneInfor> pBook;

	Scanner sc;
	
	
	public static PhoneBookManager getInstance() {
		if(m==null) {
			return new PhoneBookManager();
		} else {
			return m;
		}
		
	}
	
	private static PhoneBookManager m = new PhoneBookManager();
	
	private PhoneBookManager() {
		//pBook = new PhoneInfor[100];
		//pBook= new ArrayList<PhoneInfor>();
		pBook= new HashSet<PhoneInfor>();
		sc = new Scanner(System.in);
	}
	
	// 입력 -> 대학 OR 회사
	// 대학친구 입력 -> 1, 회사친구 입력 -> 2
	// 검색 -> 3, 삭제 -> 4
	
	void insertInfor(int select) {
		
		if (!(select==Menu.INSERT_UNIV || select==Menu.INSERT_COM)) {
			System.out.println("옳바른 메뉴선택이 아닙니다. 다시 선택해주세요.");
			return;
		}
		
		// 기본정보 입력 받고
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		// 1 또는 2에 따라 입력 받고 -> 인스턴스 생성 -> 배열에 저장
		
		// 배열에 저장될 참조변수
		PhoneInfor pi = null;
		
		if(select==Menu.INSERT_UNIV) {
			System.out.println("주소를 입력해주세요.");
			String address = sc.nextLine();
			System.out.println("전공을 입력해주세요.");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요.");
			String year = sc.nextLine();
			
			pi = new PhoneUnivInfor(name, phoneNumber, email, address, major, year);
			
		} else {
			System.out.println("회사이름을 입력해주세요.");
			String company = sc.nextLine();
			
			pi = new PhoneCompanyInfor(name, phoneNumber, email, company);
			
		}
		
	//	pBook[cnt++] = pi;
		pBook.add(pi);
		System.out.println("저장되었습니다.");
		
		//pBook[cnt-1].showBasicInfor();
		//System.out.println("=======================");
		//pBook[cnt-1].showInfor();
		
	}
	
	// 이름을 기준으로 배열에서 index 찾아 반환
//	int searchIndex(String name) {
	//	int index = -1; // 찾지 못했을 때 반환값은 -1로 정의
		
		// 배열을 통해 이름 검색 : 반복문 이용
	//	//pBook[i] -> pBook.get(index)
	//	for(int i=0; i<pBook.size(); i++) {
		//	if(pBook.get(i).name.equals(name)) {
		//		index = i;
			//	break;
		//	}
		//}
		
	//	return index;
//	}
	
	
	// 이름을 통해 검색한 결과의 정보를 출력
	void searchInfor() {
		
		System.out.println("검색하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		Iterator<PhoneInfor> itr =pBook.iterator();
		// index 검색
		//int index = searchIndex(name);
		
		//if(index<0) {
		//	System.out.println("찾으시는 이름의 정보가 없습니다.");
		//} else {
			//pBook[index].showInfor();
		//	pBook.get(index).showInfor();
	//	}
		boolean chk =false;
		while(itr.hasNext()) {
			PhoneInfor pi = itr.next();
			if(pi.name.equals(name)) {
				chk=true;
				break;
			}
		}
	if(!chk) {
		System.out.println("찾으시는 이름의 정보가 없습니다.");
	
	}
	}
	void deleteInfor() {
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		Iterator<PhoneInfor> itr =pBook.iterator();
		
		boolean chk =false;
		while(itr.hasNext()) {
			PhoneInfor pi = itr.next();
			if(pi.name.equals(name)) {
				itr.remove();
				System.out.println("삭제되었습니다.");
				chk=true;
				break;
			}
		}
		if(!chk) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		
		}
	}
		// index 검색
		//int index = searchIndex(name);
		
     //  try {
       //pBook.remove(index);
       
			//for(int i=index; i<cnt-1; i++) {
			//	pBook[i]=pBook[i+1];
			//}			
			// 전체 개수에서 -1
		//	cnt--;			
		//	System.out.println("삭제되었습니다.");
		//} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		//}
	
	
	
	// 배열에 저장된 전체 데이터를 출력
	void showAll() {
		
		System.out.println("친구 리스트 ");
		System.out.println("---------------------");
		for(int i=0; i<pBook.size(); i++) {
			pBook.get(i).showBasicInfor();
			System.out.println("___________________");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//기능 클래스
