/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * hello thisara
 * newf
 */
package q5;

/**
 *
 * @author Lab User
 */
abstract class bankaccount {
    private int accountnumber;
    private double balance;
public void setaccn(int accountnumber){
this.accountnumber=accountnumber;
}    
public void setbala(double balance){
 
 this.balance=balance;
}
public int getaccountnumber(){
    return accountnumber;
}
public double getbalance(){
    return balance;
}
abstract double calculateinterest();

}
