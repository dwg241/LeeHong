package Real.java;


public class Practice {

	
	public static void main(String[] args) {
		Wrap w =new Wrap();
		Practice p1=new Simplebox();
		Practice p2=new PaperBox();
		Practice p3=new GoldPaperBox();
	
		w.wrapbox(p1);
		w.wrapbox(p2);
		w.wrapbox(p3);
	}
}

class PaperBox extends Practice{

	@Override
	public String toString() {
		return "PaperBox";
	}
	
}

class GoldPaperBox extends Practice{

	@Override
	public String toString() {
		return "GoldPaperBox";
	}
	
}

class Simplebox extends Practice{

	@Override
	public String toString() {
		return "Simplebox";
	}
	
}
class Wrap{
	void wrapbox(Practice p) {
		System.out.println(p);
	}
}