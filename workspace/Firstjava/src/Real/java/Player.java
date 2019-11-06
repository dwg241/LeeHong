package Real.java;

public class Player {
 private int code;
 private String name;
 private String group;
 // methods ��Ʈ ����Ʈ ����
 // �޼���� ��ȯ���� ���� �ʴ´�. Ŭ������� ��ġ
 // �̸��� ���� �޼��带 ������ ����� ���: �Ű������¤� ������.
 public Player() // �̻����� �����ڴ�. 
 {
	 super();// ������ ���� �� �����ڸ� ȣ���Ѵ�
 }
 public Player(int code, String id, String group) //��ȯŸ���� �����ʴ´�, �Ű������� ���� �� ����ؾ��Ѵ�.  
 {
	 // new Player();
	this.code=code;    //�̸��� ���� ���� ���� ���� �ڵ�� 
	name = id;
    this.group = "iot";
			 
 }
 // �޸𸮿� �����Ѵ�. �ε��� ������ �����ؼ� ����. 
 @Override // �����. 
public String toString() {
	// TODO �����޼��带 ���ο� �޼���� ��ü�Ѵ�. �ٲ۴�. 
	return "Player{code:"+code+" ,name:"+name+" ,group:"+group+" }";
    
 }
public int getCode() //void�� �ƴϸ� return�� �ʼ���. {
{ return code; // �ڵ尪�� �θ���.
 }
 
public void set() {
	 
 }
	public void setCode(int code) {//input // �˻�//
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
    }
	public int getCallvalue() {
		// TODO  ��뿡�� �θ� ���� ��ȯ
		
		return 375;
	}
	public int[] getResponse(int callValue) {
		// TODO �����̶� ���ؼ� ��Ÿ��ũ���������ֱ� 
		int [] rt = {0,0};
		
		return rt;
	}
	public void setResponse(int[] rv) {
		// �������� �����Ѵ�. 
		//���� �θ��� 
		// ��� rv
		
		
	}
	
	}
