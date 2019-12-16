package help;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //ArrayList<Integer> list = new ArrayList<Integer>();
         //데이터 추가:add()
       LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(11));
       list.add(22);
       list.add(33);
       list.add(33);
       list.add(55);
       list.add(66);
       
       
       // 데이터 참조:반복문 for,foreach
	System.out.println("ArrayList의 요소 개수: " + list.size());
	
		
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));	
	}
	list.remove(0);
	System.out.println("---------------------------------");
	for(Integer i : list) {
		System.out.println(i);
	}

	System.out.println("---------------------------------");
	Iterator<Integer> itr =list.iterator();
	while(itr.hasNext())
	{
		Integer i = itr.next();
		System.out.println(i);
      if(i.equals(33)) {
	    itr.remove();
      }
	}

	System.out.println("---------------------------------");
	itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
	
	
	
	
	
	
	
	
	
	
}