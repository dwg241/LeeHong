package help;

 public class Car {
	
		int gasolinegauge;
		
 public Car() {
	 
 }
		class HybridCar extends Car {
		int electronicGauge;
		
		HybridCar(){
			
		}
		}
		class HybridWaterCar extends HybridCar {
		int waterGauge;
		public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 가솔린 : " + electronicGauge);
		System.out.println("잔여 가솔린 : " + waterGauge);
		}
		}

 }
