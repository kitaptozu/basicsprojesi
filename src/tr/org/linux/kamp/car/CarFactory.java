package tr.org.linux.kamp.car;

public class CarFactory {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car("BMW", 4, 70);
		car1.setBrand("Mercedes");
		car1.setGear(5);
		car1.setSpeed(230);

		System.out.println(
				"Araba Markası: " + car1.getBrand() + " hızı: " + car1.getSpeed() + " vites: " + car1.getGear());
		System.out.println(
				"Araba Markası: " + car2.getBrand() + " hızı: " + car2.getSpeed() + " vites: " + car2.getGear());

	}
}
