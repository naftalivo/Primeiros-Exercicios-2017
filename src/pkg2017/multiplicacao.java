/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017;

/**
 *
 * @author Ivo
 */
public class multiplicacao {
    
    public static int multiplicacao1(int num1, int num2){
        if(num1 == 1){
            return num2;
        }
        return num2 + multiplicacao1(num1, num2);
    }
    
}
