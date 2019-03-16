/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

/** 
 *
 * @author nairaelnaggar
 */
import java.awt.Component;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static java.lang.Compiler.disable;
class transactions {
public static double balance;
    static double prev;

    private static void add(double balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
static ArrayList<String> typeList=new ArrayList<>();
static ArrayList<Double> balanceList=new ArrayList<>();
static  ArrayList<Double> amountList=new ArrayList<>();
static int sub=(balanceList.size()-1);


    
    
   
    private static double accountBalance;
   
     static double next;

    

   

   
                      
    public void balance(double initialBalance)
    { if(initialBalance>0.0)
    balance=initialBalance;
    }
   


 /*   public void static deposit (double newBalance, amount)
    {
    newBalance = accountBalance + amount;
    System.out.println("You gave me: $ " + amount);
    System.out.println("I now have all your money that is worth: " + newBalance);
    }
*/
     static void withdrawal(double amount)
            
    {  
   
    if (amount>balance){
       JOptionPane.showMessageDialog(null, "error");
    
    }
     String num=String.valueOf(amount);
       balance=balance-amount; 
       if (balance<0)
    {System.out.println("not enough balance");
    
    balance=balance+amount;
     System.out.println("Your balance is: " + balance);
    }
     balanceList.add(balance);
      typeList.add("withdrawal");
 amountList.add(amount);

    }

    static void deposit( double amount)
    {double b=balance;
   
    balance = balance + amount;
        System.out.println("You dposited: " + amount);
    System.out.println("Your balance is: " + balance);
      balanceList.add(balance);
      typeList.add("deposit");
      amountList.add(amount);
    
    
    
}
    public static void accountbalances() {
        balance=balance;
    System.out.println("Your balance is: " + balance);
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
     public static String prev(){
        if(sub==0){
            return"error";
        }
        else {sub=sub-1;
        String f=typeList.get(sub)+"\n"+amountList.get(sub)+"\n"+balanceList.get(sub);
        return f;}
    }
     public static String next(){
        if(sub==balanceList.size()-1){
            return"no history";
        }
        else {sub=sub+1;
        String f=typeList.get(sub)+"\n"+amountList.get(sub)+"\n"+balanceList.get(sub);
        return f;}
    }

   
    
    
}
