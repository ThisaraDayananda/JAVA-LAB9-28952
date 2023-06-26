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
public class checkingaccount extends bankaccount {
 
@Override
double calculateinterest(){
return getbalance()*1.2;
}
}
