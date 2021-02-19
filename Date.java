public class Date{
	private int month;
	private int day;
	private int year;


public Date(int month, int day, int year){

 this.month = 2;
this.day = 16;
this.year = 2021;





}

public void setDay(int day){
	 this.day = day;
}

public int getDay(){
	return this.day;
}

 public void setMonth(int month){
this.month = month;

} public int getMonth(){
	return this.month;
}
	public void setYear(int year){
	this.year = year;
}

	public int getYear(){
	return this.year;
}

public String displayDate(){
return ("the new date is:" + month + "/"+ day + "/" + year);
	
}


}