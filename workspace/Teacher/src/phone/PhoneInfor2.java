package phone;

public class PhoneInfor2 {
	public String name;     // 직접 참조하는 경우는 없다 그래서 직접참조 못하게 Private 를 쓴다.
	public String phoneNumber;
	public String birthday;
	public String university;
	public String major;
	public String job;
	public String jobNumber;
	
	//데이터 초기화
	//public을 써야 다른 패키지에서도 불러올 수 있다. 
	public PhoneInfor2(String name,String phoneNumber, String birthday){

	this.name=name;
	this.phoneNumber=phoneNumber;
	this.birthday=birthday;
	
	}
	
	//오보로딩 다른생성자 호출, 데이터 초기화는 또다른 형태 
	
	public PhoneInfor2(String name,String phoneNumber){

	this(name,phoneNumber,null);
		
	}
	public PhoneInfor2(String name,String phoneNumber, String birthday, String uni, String maj){

		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
		this.university=uni;
		this.major= major;
		}
	public PhoneInfor2(String name,String phoneNumber, String birthday, String job, String jobNum){

		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
		this.job=job;
		this.jobNumber=jobNum;
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
class PhoneUnivIn extends PhoneInfor2{
	String major; // 전공학과
	String university;
	public PhoneUnivIn(String name, String pNum, String bDay, String uni, String maj) {
		super(name, pNum, bDay);
		this.major=maj;// TODO Auto-generated constructor stub
		this.university =uni;
	}
	
	
	public void showInfo()
	{
	super.showInfo();
	
	System.out.println("대학교 : "+ university);
	System.out.println("전공 : "+major);
	System.out.println("-----------------------");
	}
	
	}

class PhoneJobIn extends PhoneInfor2{
	String job; // 전공학과
	String jobnumber;
	public PhoneJobIn(String name, String pNum, String bDay, String job, String jobNum) {
		super(name, pNum, bDay);
		this.job=job;
		this.jobnumber =jobNum;
	}
	
	public void showInfo()
	{
	super.showInfo();
	
	System.out.println("직장 : "+ job);
	System.out.println("직장연락처 : "+jobnumber);
	System.out.println("-----------------------");
	}
}
