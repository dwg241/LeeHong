package help;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Integer,String> map = new HashMap<Integer, String>();
         
         //저장 : put
         map.put(new Integer(1), "Scott");
         map.put(2, "Lee");
         map.put(8,"King");
         
         //참조: get
         System.out.println("1번 :" + map.get (new Integer(1)));
         System.out.println("2번 :" + map.get(2));
         System.out.println("8번 :" + map.get(8));
	     
         //삭제: remove
         map.remove(1);
         //System.out.println("2번 :" + map.get(1).length());
	     System.out.println("2번 :" + map.get(1));
	
	     TreeMap<Integer, String> tMap =new TreeMap<Integer, String>();
	     tMap.put(new Integer(1), "Scott");
	     tMap.put(2, "Lee");
	     tMap.put(8,"King");
	     tMap.put(4,"Kim");
	     
	     NavigableSet<Integer> navi= tMap.navigableKeySet();
	     Iterator<Integer> itr = navi.iterator();
	    
	     while(itr.hasNext()) {
	    
	    	 System.out.println(tMap.get(itr.next()));
	       }
         	}
	
	

}
