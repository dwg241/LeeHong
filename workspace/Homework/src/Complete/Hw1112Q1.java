package Complete;


public class Hw1112Q1 {

	
	public static void main(String[] args) {
		Wrap w =new Wrap();
		Hw1112Q1 p1=new Simplebox2();
		Hw1112Q1 p2=new PaperBox2();
		Hw1112Q1 p3=new GoldPaperBox2();
	
		w.wrapbox(p1);
		w.wrapbox(p2);
		w.wrapbox(p3);
	}
}

class PaperBox2 extends Hw1112Q1{

	@Override
	public String toString() {
		return "PaperBox";
	}
	
}

class GoldPaperBox2 extends Hw1112Q1{

	@Override
	public String toString() {
		return "GoldPaperBox";
	}
	
}

class Simplebox2 extends Hw1112Q1{

	@Override
	public String toString() {
		return "Simplebox";
	}
	
}
class Wrap{
	void wrapbox(Hw1112Q1 p) {
		System.out.println(p);
	}
}