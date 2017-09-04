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
public class multiplicacaoRec {
    
    public static int multRec(int n, int p){
        if(n == 1)
            return p;
        else
            return n+multRec(n-1, p);
    }
    
    public static void main(String[] args) {
        System.out.println(multRec(6, 4));
    }
    
}
