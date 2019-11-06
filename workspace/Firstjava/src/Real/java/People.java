package Real.java;

public class People {
             
public static void main(String[] args) {
	//	Main.main(args); //���� �ν��Ͻ� ���� �ٷ� ���� ��Ų��.
		Person.serail =100;
	    Person person =new Person();
	    Person p1 =new Person();
	    Person p2 =new Person();
	    Person p3 =new Person();
	    System.out.println(p1.serail);
	    System.out.println(p2.serail);
	    System.out.println(p3.serail);
	    p1.serail =200;
	    System.out.println(p1.serail);
	    System.out.println(p2.serail);
	    System.out.println(p3.serail);
	    // Ŭ������ ������ �ݵ�� �����Ѵ�...
	    //System.out.println(person);
		// ����� ������ �ִ�. Ŭ���� ������.�����
        // ������ null�� ��쿡�� . NullPoint
	 //   if(person != null) {
	    //	person.code =10;
	    //	person.name = "jdk";
	    //	System.out.println(person.code);
	    //	System.out.println(person.name);
	    //	System.out.println(person.phone);
	    //	System.out.println(person.weight);
	    }
}

