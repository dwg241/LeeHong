package Real.java;

public class Gugudan {
	public static void main(String[] args) 
	{
	int i;
	int	a;
	int	b;
	a=1;
	for(int j=0; j<8; j++ ){
	a+=1;
	b=0;
	System.out.println(a+"������.");
	for( i=1; i<10; i++ ){ 
    int v = a*i;
    b+=1;
    int c= a*b;
    System.out.println(a+" x " + i + "="  + v);
    System.out.println(a+" x " + b + "="  + c);
    String str=(a+" x " + i + "="  + v);
    System.out.println(str);
    str.length();
	}
	System.out.println("_");
}
	}
}
