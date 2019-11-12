package me;

import java.util.Scanner;

public class PhoneBookSample {
	public static void main(String[] args) {

		Data[] data = new Data[100];
		Scanner kb = new Scanner(System.in);
	
		System.out.println("IoT 전화번호부입니다.");

		while (true) {

		
			System.out.println("종료 [0] 검색 [1] 저장[2] 삭제[3]");
			int menu = kb.nextInt();

			if (menu == 0) {
				break;
			}

			if (menu == 1) {
				System.out.println("이름을 찾아주세요!");
				String serach = kb.next();
			    int key=0;
				for (int i = 0; i < 100; ++i) {
				
					
					    if (data[i] != null && data[i].name != null) {

						if (data[i].name.equals(serach)) {
							System.out.println(
									"이름: " + data[i].name + " 전화번호: " + data[i].number + " 생일: " + data[i].birthday);
							key=1;
							
							break;
						
						}
						
						
						
						
					    }
					    
					    
					}
				if(key==0)
				{
					System.out.println("찾는 값이 없습니다!");
				}
			
			    }
				
			
			if (menu == 2) {
				for (int i = 0; i < 100; ++i) {
					
					if (data[i] == null) {
						data[i] = new Data(); // new 하는 이유
						
				                                          	// 버퍼가 남아있어서 !! !
						System.out.println("이름을 입력하세요!");
						String name = kb.next(); // nextline 하면 안되는 이유!!
						data[i].name = name;
						System.out.println(data[i].name);

						System.out.println("전화번호를 입력하세요!");
						String number = kb.next();
						data[i].number = number;
						System.out.println(data[i].number);

						System.out.println("생일을 입력하세요!");
						String birthday = kb.next();
						data[i].birthday = birthday;
						System.out.println(data[i].birthday);

						break;

					} else if (data[i] != null) {
						if (i == 100)
							System.out.println("기록이 꽉찼습니다.");
					}
				}
			}
			if (menu == 3) {
				int key1 =0;
				System.out.println("삭제 할 이름을 입력해주세요!");
				String serach = kb.next();
				
				for (int i = 0; i < 100; ++i) {

				
					if (data[i] != null && data[i].name != null) {

						if (data[i].name.equals(serach)) {
							
							key1 =1;
							
							System.out.println(
									"이름: " + data[i].name + " 전화번호: " + data[i].number + " 생일: " + data[i].birthday+ " 정보를 삭제 하시겠습니까?");
							System.out.println("Yes[1] NO[2]");
							
							int choice = kb.nextInt();
							
							if (choice == 1) {
						
								 
									    data[i].name=null; 
										data[i].number=null; 
										data[i].birthday=null; 
							 
								break;
					     	}
					
		            	 
							else if (choice == 2) {
								break;
							}
						}
					}
				}
				
				if(key1 ==0)
				{
					System.out.println("찾는 값이 없습니다.");
				}
			}
			

		}

	}
}
