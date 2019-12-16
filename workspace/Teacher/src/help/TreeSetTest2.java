package help;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<Person> sTree = new TreeSet<Person>();
     sTree.add(new Person("Lee", 24));
     sTree.add(new Person("Scott", 29));
     sTree.add(new Person("King", 19));
     sTree.add(new Person("hong", 15));
     
     Iterator<Person> itr = sTree.iterator();
	while(itr.hasNext()) {
		//System.out.println(itr.next());
		itr.next().showData();
	}
	}

}
