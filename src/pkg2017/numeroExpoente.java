/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017;

/**
 * Potencia
 *
 * @author Ivo
 */
public class numeroExpoente {
    
    public static void main(String[] args) {
        System.out.println(potencia(2,4));
    }
    
    static int potencia(int k, int n){
        if(n == 0)
            return 1;
        else{
            int aux = potencia(k, n/2);
            if(n % 2 == 0)
                return  aux * aux;
            else 
                return  aux * aux * k;
        }
    }
}
