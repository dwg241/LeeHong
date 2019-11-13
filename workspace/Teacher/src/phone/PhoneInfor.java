package phone;

class PhoneInfor {

	public String name;     // 직접 참조하는 경우는 없다 그래서 직접참조 못하게 Private 를 쓴다.
	public String phoneNumber;
	public String birthday;
	public String major;
	public String university;
	//데이터 초기화
	//public을 써야 다른 패키지에서도 불러올 수 있다. 
	public PhoneInfor(String name,String phoneNumber, String birthday){

	this.name=name;
	this.phoneNumber=phoneNumber;
	this.birthday=birthday;
	
	}
	
	//오보로딩 다른생성자 호출, 데이터 초기화는 또다른 형태 
	
	public PhoneInfor(String name,String phoneNumber){

	this(name,phoneNumber,null);
		
	}
	
	//출력 메서드
	public void showInfo() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호 : " +phoneNumber);
		if(birthday==null)
		{
			System.out.println("생일 : 입력된 데이터가 없습니다. " );
		}
		else {
		System.out.println("생일 : " +birthday);
		}
	}
}
class PhoneUnivInfor extends PhoneInfor{
	String major; // 전공학과
	String university;
	public PhoneUnivInfor(String name, String pNum, String bDay, String uni, String maj) {
		super(name, pNum, bDay);
		this.major=maj;// TODO Auto-generated constructor stub
		this.university =uni;
	}
	
	
	public void showInfo()
	{
	super.showInfo();
	System.out.println("전공 : "+major);
	}
	
	}

class PhoneJobInfor extends PhoneInfor{
	String job; // 전공학과
	String jobnumber;
	public PhoneJobInfor(String name, String pNum, String bDay, String job, String jobNum) {
		super(name, pNum, bDay);
		this.job=job;
		this.jobnumber =jobNum;
	}
	
	public void showInfo()
	{
	super.showInfo();
	System.out.println("전공 : "+major);
	}
	
	}



