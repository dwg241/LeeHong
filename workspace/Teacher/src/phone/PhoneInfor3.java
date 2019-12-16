package phone;

public class PhoneInfor3 {

	String name;
	String phoneNumber;
	String email;
	public PhoneInfor3(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	// 생성자: 초기화 메서드
	// 기본데이터 초기화
	void showBasicInfor() {
		System.out.println("이름: "+ this.name);
		System.out.println("전화번호: "+ this.phoneNumber);
		System.out.println("이메일: "+ this.email);
	}
	void ShowInfor() {
		
	}
}

