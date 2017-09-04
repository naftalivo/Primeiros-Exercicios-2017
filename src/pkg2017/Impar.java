/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package eda2semestre;
//
///**
// *
// * @author Ivo
// */
//public class Impar {
//    
//    public static int imparRec(int num){
//        if(num < 0){
//         System.exit(0);
//        }else{
//            if((num%2 == 0)){
//               // System.out.println(num-1);
//                imparRec(num-1);
//            }else{
//                System.out.println(num);
//                imparRec(num-2);
//            }
//        }
//     return 0;
//    }
//    
////    public static int imparRec(int num){
////        if(num%2 == 0){
////            System.out.println(num - 1);
////            imparRec(num);
////        }
////        else{
////            System.out.println(num - 2);
////            imparRec(num);
////        }
////    }
//    
//    
//    
//    public static void main(String[] args) {
////        imparRec(7);
//        imparRec(7);
//    }
//    
//}

package pkg2017;

/**
 *
 * @author Ivo
 */
public class Impar {
    
    public static void imparRec(int num){
        if(num < 0){
         System.exit(0);
        }else{
            if((num%2 != 0)){
                System.out.print(num+" ");
                imparRec(num - 2);
            }else{
                if((num%2 == 0)){
              
                imparRec(num - 1);
                }
            }
        }
    
    }
    public static void main(String[] args) {
        imparRec(20);
    }
    
}