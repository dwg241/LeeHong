package Real.java;

public class Team {
	// ��ġ �ٸ���  ��
	public static void main(String[] args) 
	{
		int ran = (int)(Math.random()*1000) ;
		System.out.println(ran);
		int num1= (int)(ran *0.01);
		int num2 =(int)((ran-num1*100)*0.1);
		int num3 = num1*100;
		int num4 =num2*10;
		int num5= ran-num3-num4;
	
		int a;
	int b;
	int c;
	int x = 0 ;
	int y =0 ;
	int z =0;
	
	
for(a=1;a<10;a++ ) {
	if(a== num1) {
		x= a*100;
	System.out.println(x);
}
}
	for(b=0;b<10;b++ ) {
		if(b== num2) {
			y= b*10;
		System.out.println(y);
	}
	}
		for(c=0;c<10;c++ ) 
		{
			if(c== num5) {
				z=c*1;
			System.out.println(z);
		}
		
			
}
	int d= x+y+z;
		
		System.out.println("������:"+d);
}
	
}