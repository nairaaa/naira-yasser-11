/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import static ATM.transactions.prev;
import java.util.Scanner;
/**
 *
 * @author nairaelnaggar
 */
public class main {
 static transactions t= new transactions();
    

   
    public static void main(String[] args3) {
        // TODO code applicatiolaunch(arg
     
       
      /*login v=new login();
      Scanner x=new Scanner(System.in);
              int keyword =x.nextInt();
                login.valid(keyword);*/
   transactions t =new transactions();
    Scanner c=new Scanner(System.in);
   double amount2=c.nextDouble();
   transactions.deposit(amount2);
   transactions.accountbalances();
   Scanner z=new Scanner(System.in);
   double amount =z.nextDouble();
     guiATM.main(new String[0]);
   
   
           

    
}
 
}
