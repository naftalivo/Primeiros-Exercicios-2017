/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivo
 */
public class teste {
    
    public static void main(String[] args) {
        
//        int fatorialRecurs = fatorial.fatorialRe(5);
//        System.out.println(fatorialRecurs);
        
        int fatorialRec = Integer.parseInt(JOptionPane.showInputDialog("Digit"));
        
        fatorial b = new fatorial();
        
        fatorialRec = fatorial.fatorialRe(fatorialRec);
        JOptionPane.showMessageDialog(null, "Result do Fatorial = " +fatorialRec);
    }
    
}
