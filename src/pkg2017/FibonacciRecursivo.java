/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017;

import java.util.Scanner;

/**
 *
 * @author Ivo
 */
public class FibonacciRecursivo {
    
    static int fibonac(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonac(n-1) + fibonac(n-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.println("Escreva o numero ");
        numero = leitor.nextInt();
        
        for(int i = 1; i <= numero; i++){
            System.out.print(fibonac(i)+" ");
        }
        
    }
    
}
