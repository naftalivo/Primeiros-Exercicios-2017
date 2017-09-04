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
public class MDC {
    public static int mdc(int a, int b){
        while(a!= b){
            if(a > b)
                a = a - b;
            else 
                b = b -a;
        }
        return a;
    }
    
    public static void main(String[] args) {
        int resultado = mdc(10, 15);
        System.out.println(resultado);
    }
    
}
