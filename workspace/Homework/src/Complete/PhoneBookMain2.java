package Complete;

import java.util.Scanner;

public class PhoneBookMain2 {
//trim과 length 사용!! 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	     
		while(true) {
		
		System.out.println("_________________________________" );
		System.out.println("이름을 입력해주세요!" );
		String name =kb.nextLine();
		System.out.println("번호를 입력해주세요!" );
		String pNum =kb.nextLine();
		System.out.println("생일을 입력해주세요!" );
		String bDay =kb.nextLine();//nextline 공백을 표시할수있음 = 문자열의 사이즈가 1보다 작다 
        //  사용자가 입력한 생일 데이터 비교 : 공백여부 
		//  "123 ".trim()-> "123"
		//  System.out.println("문자열의 개수 "+bDay.trim().length()); //문자열개수세는 녀석
		//  new PhoneInfor(name,phoneNumber,birthday);
	    //	System.out.println("이름: " +name + " 전화번호: " + pNum + " 생일: " + bDay );
	
		if(bDay != null && bDay.trim().length()>0) {
			new PhoneInfor(name, pNum, bDay).showInfo();
		}
		else {
			new PhoneInfor(name, pNum).showInfo();
		}
		}
	
	}

}
