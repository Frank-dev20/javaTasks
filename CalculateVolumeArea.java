import java.util.Scanner;

public class CalculateVolumeArea{

	public static void main(String [] args){
Scanner input = new Scanner (System.in);

	System.out.print("Enter the radius of cylinder: ");
	double radius = input.nextDouble();

double area = (radius*radius) * (3.142);
	System.out.println("Area is " +  area);

	System.out.print("Enter the length of cylinde: ");
	double length = input.nextDouble();

double volume = (area) * (length);
	System.out.print("volume " + " is " + area * length );














	}



		}