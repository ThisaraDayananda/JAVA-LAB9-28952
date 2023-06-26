/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author Lab User
 */

public class Q5 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        checkingaccount obj1 = new checkingaccount();
        obj1.setaccn(10000000);
        obj1.setbala(1000000);
        System.out.println("interest is "+obj1.calculateinterest());
        savingaccounts  obj2 = new savingaccounts();
        obj2.setbala(20000000);
        
        
        
    }
    
}
