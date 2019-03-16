/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;
import java.util.Scanner;
/**
 *
 * @author nairaelnaggar
 */
public class login {

    

    

    private static int keyword;
    private static double accountBalance;
    private static int pin;
    private static int account;

    /**
     *
     */   

        
public static void valid(int entry){
		
		int pin = 12345;
             int i;

		
		System.out.print("ENTER YOUR PIN: ");
 		for(i=0;i<4;i++){
System.out.print("ENTER YOUR PIN: ");
 Scanner x=new Scanner(System.in);
              int keyword =x.nextInt();
pin=12345;
	if ( keyword!= pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			
			
                       
		}

        else {System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  
                   
  
        
        break;}
	 }}
public static void account (int pin){
    pin=1234;
     accountBalance = 0.0;
}public static void setpin (int pin)
    {
    pin= account;
    }
    
    public static int getpin()
    {
    return pin;
    }
     public static void setAccountBalance(double balance)
    {
    accountBalance = balance;
    }
    // get
    public static double getAccountBalance()
    {
    return accountBalance;
    }
}

   
   
   


    
    
    


    
    
    
   
    
  
    