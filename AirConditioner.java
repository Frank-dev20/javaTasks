public class AirConditioner {

private boolean isOn;
private String productName;
private int temperature;

	public AirConditioner (boolean isOn, String productName, int temperature) {

		this.isOn = isOn;
		this.productName = productName;
		this.temperature = temperature;

	}

	public void setOn (boolean isOn){

		this.isOn = isOn;
	}

	public boolean isOn (){

		return isOn;
	}

	public void setProductName (String productName){

		this.productName = productName;
	}

	public String getProductName (){

		return productName;
	}

	public void setTemperature (int temperature){

		this.temperature = temperature;
	}

	public int getTemperature (){

		return temperature;
	}

	public void decreaseTemperature(){
		temperature =-- temperature;
	}

	public void increaseTemperature(){
		temperature =++ temperature;
	}



}