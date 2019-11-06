import java.util.Scanner;

public class Rullet3 {
	public static void main(String[] args) {
		int ran;
		Scanner kb = new Scanner(System.in);	
		 
		int ran1=0;
		int ran2=0;
		
		String temp=null;
		
		String [] name = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은"
				          ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
				          ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"};
		

	      
		System.out.println("제비뽑기를 시작하려면 1번을 누르세요");
		
		   while(true) {
		  //int menu = Integer.parseInt(kb.nextLine()); // 변환 nextLine:문자 nextInt: 숫자 
			   int menu = kb.nextInt();
			   if(menu==1)
			   {
			
		   ran=(int)(Math.random()*1000);
		    
		    for(int i=0; i<ran;i++) {
		    	ran1 = (int)(Math.random()*24);
			    ran2 = (int)(Math.random()*24);	
	        	temp=name[ran1];
	        	name[ran1]=name[ran2];
	        	name[ran2]=temp;
	        	
		    }
		    
		    System.out.println("축하합니다. 반장은 "+name[0]+"입니다.");
			
			
		     break;
			
		  
	        }
			   
		       else if(menu!=1) {
			   System.out.print("잘못 입력했습니다.");  
		    }
		   }
	        }
		   
}
