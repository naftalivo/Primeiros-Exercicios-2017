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
public class fatorial {
    
    public static int fatorialRe(int num){
        if (num == 0){
            return 1;
        }
        return num * fatorialRe(num - 1);
    }

    
}
