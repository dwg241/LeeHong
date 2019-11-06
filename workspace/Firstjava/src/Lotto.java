
public class Lotto {
	static int number [] = new int [7];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


			machine();
		
		
	}
	
	private static void machine() {
		// TODO Auto-generated method stub
	
		for(int i=0;i<7;++i)
		{
			
			int ran = (int)(Math.random()*45);
			number[i] = ran;
			if(i>0) {
			if(number[i-1]==number[i])
			i--;	
			}
		}
		System.out.print("로또 번호는 ");
		for(int i=0;i<6;++i)
		{ if(i==0)
		{
			System.out.print(number[i]);
		}
		else 
			System.out.print(", " +number[i]);
		}
		System.out.println("입니다");
		System.out.println("보너스 번호는 "+number[6]+"입니다.");

	}
	
	}


