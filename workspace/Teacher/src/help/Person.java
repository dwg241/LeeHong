package help;

public class Person implements Comparable<Person> {

	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name =name;
		this.age =age;
		
	}
	
	public void showData() {
		System.out.println("이름: " + name+ ", 나이: "+ age);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person a) {
		//if(age>a.age) { //첫번째가 기준!1
	//		return 1;
	//	}
	//else if (age<a.age) {
		//return -1;
	//}
    //else {
		//return 0;
		return age-a.age;
	}
	

    }
	
	
	
