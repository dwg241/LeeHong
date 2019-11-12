package com.park.tc;

public class Product {

	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price =price;
		this.bonusPoint =(int)(price/10f);
	}
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv =new Tv(100);
		Product p1 =tv;
		
		Computer com = new Computer(300);
		Product p2 = com;
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은돈:" + b.money);
		System.out.println("현재 보너스 포인트"+b.bonusPoint);
	}
}


class Tv extends Product {

	public Tv(int price) {
		super(price);
		
	}

	@Override  // 
	public String toString() {
		return "Tv";
	}
	
	
	
}
class Computer extends Product{

	public Computer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "computer";
	}
	
}

class Buyer{
	
	
	int money = 1000;
	int bonusPoint =0;
	
	void buy(Product p) {
		
		if(money<p.price)
		{
			System.out.println("잔액이 부족해서 구매할 수 없습니다.");
			return;
					}
		money =money -p.price;
		bonusPoint =bonusPoint +p.bonusPoint;
		
		System.out.println(p+"을/를 구입하셨습니다.");
	}
}
