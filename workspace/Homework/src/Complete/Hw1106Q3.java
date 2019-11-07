package Complete;

public class Hw1106Q3 {
	public static void main(String[] args) {
		//다음 형태로 String 인스턴스를 생성.
		//String str = “ABCDEFGHIJKLMN”;
		// 그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성
		System.out.println("문제1");
		String str= "ABCDEFGHIJKLMN";
		StringBuffer a= new StringBuffer(str);
		System.out.println(a.reverse());
	    
		
		
		// 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
		//String str = “990929-1010123”
        //이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성
		
		System.out.println("");
		System.out.println("문제2 방법1");
		
		String str2 = "990929-1010123";
		
		for(int i=0; i<14; ++i)
		{
			if(i!=6) {
				System.out.print(str2.charAt(i));
			}
			
		}
	
		System.out.println("");
		System.out.println("문제2 방법2");
		
		
		System.out.print(str2.substring(0,6));
		System.out.print(str2.substring(7,14));   // 13이 아니고 14인지가 궁금합니다. 숫자를 0부터 쓰는데 모르겠습니다.
	}
}
