package help;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		
		TreeSet<Integer> sTree =new TreeSet<Integer>();
	 //set은 해시코드를 비교해준다. equals 비교해준다.
	 // 알아서 중복제거
	// 저장되는 순서를 갖지 않는다. 	
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);
		
		System.out.println("저장된 데이터의 개수: " + sTree.size());
		
		
		Iterator<Integer> itr = sTree.iterator(); // 줄을 세워서 데이터를 정리해준다.
		
		while(itr.hasNext()) //밑에 값이 있는지 확인해주는 역할 
		{
			
			Integer i = itr.next();// 전체라는 뜻 
	
	      if(i.equals(1)) {
		    
	    	  System.out.println(i);
	      }
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
