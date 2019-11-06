package Real.java;

public class Gugudan2 {
	public static void main(String[] args) 
	{
	int unit = (int)(Math.random()*10.0) % 4;
	
	for(int i=2; i <10; i+=3)
	{		
	for(int k=1; k<10; k++)
    {
	String line = ""; 
    
    for(int c=0; c<3; c++)
	{	
	int	dan = i+c;
	int v = dan*k;
	if(dan <10) 
	{
	if(v<10) 
	{	
	String exp = dan +"x"+k+"="+v+" |"+"\t"; 
	line += exp;
	}
	else 
	{
	String exp = dan +"x"+k+"="+v+"|"+"\t"; 
	line += exp;
	}
	}
	} 
	System.out.println(line);
	}
	System.out.println("______________________");
	}
	}		
		
}
