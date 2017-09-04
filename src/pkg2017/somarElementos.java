/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017;

/**
 * 5. Faça uma função recursiva que permita 
 * somar os elementos de um vetor de inteiros.
 *
 * @author Ivo
 */
public class somarElementos {
    
    public static void main(String[] args) {
        int []v = {1,4,8,3,2};
        
        int resultado = soma(v, 0);
        
        System.out.println(resultado);
    }
    
    private static int soma(int[] v, int i){
        if(i < v.length)
            return v[i] + soma(v, i + 1);
           else 
            return 0;
        
    }
    
}
