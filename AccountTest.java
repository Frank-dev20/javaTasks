public class AccountTest{
    
 public static void Main(String [] args){

   Account daviesAccount;
daviesAccount = newAccountName();
daviesAccount.newName("Amaka");

String newAccountName = daviesAccount.getName();
 
  System.out.printf("New account name is %s%n", newAccountName);

System.out.printf("Account name is %s%n", daviesAccount.name);


}



}