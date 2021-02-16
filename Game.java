import java.util.Scanner;

public class Game{
 public static void main(String [] args){
 
     int numberToGuess = 25;
 

Scanner input = new Scanner(System.in);

    System.out.println("Guess a number");

     int enteredNumber = input.nextInt();

if(enteredNumber == numberToGuess)
System.out.print("You have won");

if(enteredNumber < numberToGuess)
System.out.print("Too less");

if(enteredNumber > numberToGuess)

System.out.print("Too much");







}



}