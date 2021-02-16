import java.util.Scanner;

public class Addition{
 
   	public static void main(String[] args){

          Scanner input = new Scanner(System.in);

int firstNumber;
int secondNumber;
int sum;

System.out.print("Enter firstnumber: ");
firstNumber = input.nextInt();

System.out.print("Enter secondnumber: ");
secondNumber  = input.nextInt();

sum = firstNumber + secondNumber;

System.out.printf("Sum is %d%n", sum);


}



	}