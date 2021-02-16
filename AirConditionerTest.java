public class AirConditionerTest {

	public static void main(String[] args) {

		AirConditioner appliance = new AirConditioner (true, "LG", 16);

		System.out.printf("Product name is %s, It Is %d Degress when SetOn Is %b%n%n", appliance.getProductName(), appliance.getTemperature(), appliance.isOn());

		appliance.decreaseTemperature();
	        appliance.decreaseTemperature();
		appliance.decreaseTemperature();
		System.out.printf("decreased temperature value is %d%n%n", appliance.getTemperature());

		appliance.increaseTemperature();
		appliance.increaseTemperature();
		appliance.increaseTemperature();
		appliance.increaseTemperature();
		appliance.increaseTemperature();
		System.out.printf("This is Temperature increment %d%n", appliance.getTemperature());

	}













}