package Real.java;

public class Array3 {

	public static void main(String[] args) {
	
		// �����迭: [] [] []		
		// ��: ���, �� : ����� �Ӽ���.........
		int[][] d2array = new int [20][2]; // �࿭ ����� 
	    int[] row1 =d2array[0]; //  ���� ��������!!!!!!!!!!!!!!!!!!!!!!!!!!
	    int[] row3 =d2array[3];
	    row1[0] = 10;  // [] ����� 
	    row1[1] = 10;
	    row3[1] = 10; 
	    int[] row;
	    for(int r= 0; r<20; r++) {
			row = d2array[r];  // 
			for(int c= 0; c<2; c++) {
				System.out.print(d2array[r][c] +" ");	 // ���� ���߱� �߿�!
			}                                  
			System.out.println(":"+ r + "��");	
		}
	}
}
