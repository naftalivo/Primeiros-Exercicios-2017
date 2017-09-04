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
public class decimalBinario {
    
    public static void decimalBinar(int n){
        if(n > 0){
            decimalBinar(n/2);
            System.out.print(n % 2);
        }
    }
    
    public static void main(String[] args) {
        decimalBinar(14);
    }
    
}
