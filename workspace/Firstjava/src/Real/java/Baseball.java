package Real.java;



public class Baseball {
	
	
	public static void main(String[] args) 
	{
		// ���� ���� 
		// ���ڸ��� �ߺ��� ���� 
		//��Ʈ����ũ ���� ��ġ 3�̸� ����
		// ��ġ �ٸ���  ��
		int s= 0;
		int b= 0;
		char[] a_v =new char[3];
		a_v[0] = '3';
		a_v[1] = '1';
		a_v[2] = '6';
		char[] b_v =new char[3];
		b_v[0] = '1';
		b_v[1] = '6';
		b_v[2] = '3';
		char[] c_v =new char[3];
		
		
		for(int i=0;i<3;++i) {//a_v
			for(int k=0;k<3;++k) {
			if(a_v[i] == b_v[k])
			{
				if(i==k) s++;
				else     b++;
				
			}
			}
					}
		
	
			System.out.println(b+s);
		
		
		if(s+b==3) {
			 s= 0;
			 b= 0;
	    c_v[0]=b_v[1];
	    c_v[1]=b_v[2];
	    c_v[2]=b_v[0];
		for(int i=0;i<3;++i) {//a_v
			for(int k=0;k<3;++k) {
			if(a_v[i] == c_v[k])
			{
				if(i==k) s++;
				else     b++;
				
			}
			}
					}
		}

		if(s==3){
			System.out.println("s:"+s);
		}
		
		if(!(s==3)){
			s= 0;
			 b= 0;
			b_v[0] = '1';
			b_v[1] = '6';
			b_v[2] = '3';
			c_v[0]=b_v[1];
		    c_v[1]=b_v[0];
		    c_v[2]=b_v[2];
		    for(int i=0;i<3;++i) {//a_v
				for(int k=0;k<3;++k) {
				if(a_v[i] == c_v[k])
				{
					if(i==k) s++;
					else     b++;
					
				}
				}
						}
		   
		}
		    		    
		  		
		    if(s==3){
				System.out.println("s:"+s);
			}
		    if(!(s==3)) {
		    	s= 0;
				 b= 0;
				b_v[0] = '1';
			b_v[1] = '6';
			b_v[2] = '3';
				c_v[0]=b_v[0];
		    c_v[1]=b_v[2];
		    c_v[2]=b_v[1];
		    for(int i=0;i<3;++i) {//a_v
				for(int k=0;k<3;++k) {
				if(a_v[i] == c_v[k])
				{
					if(i==k) s++;
					else     b++;
					
				}
				}
						}
		    }
		    if(s==3){
				System.out.println("s:"+s);
			}
		    if(!(s==3)) {
		    	s= 0;
				 b= 0;
		    
		    	b_v[0] = '1';
				b_v[1] = '6';
				b_v[2] = '3';
		    	c_v[0]=b_v[2];
		    c_v[1]=b_v[0];
		    c_v[2]=b_v[1];
		    for(int i=0;i<3;++i) {//a_v
				for(int k=0;k<3;++k) {
				if(a_v[i] == c_v[k])
				{
					if(i==k) s++;
					else     b++;
					
				}
				}
						}
		    }
		
		    if(!(s==3)){
				System.out.println("s:"+s);
			}
		    else {
		    	s= 0;
				 b= 0;
		    	b_v[0] = '1';
				b_v[1] = '6';
				b_v[2] = '3';
		    c_v[0]=b_v[2];
		    c_v[1]=b_v[1];
		    c_v[2]=b_v[0];
			for(int i=0;i<3;++i) {//a_v
				for(int k=0;k<3;++k) {
				if(a_v[i] == c_v[k])
				{
					if(i==k) s++;
					else     b++;
					
				}
				}
						}
		    
			System.out.println("s:"+s);
		    }
		    } 	
	
	
			



}
			
		
		
		
	
	
	
	
	


		

