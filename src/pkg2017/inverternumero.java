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
public class inverternumero {
    private static int inverter(int n, int total){
        if(n == 0)
            return total;
        else 
            return inverter(n / 10, total * 10 + n % 10);
    }
    
    public static void main(String [] args){
        System.out.println(inverter(1234567890, 0));
    }
    
}
