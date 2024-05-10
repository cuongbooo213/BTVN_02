/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucchienscanner;

import java.util.Scanner;


public class BT01 {
    public static boolean check(int a){
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if(a%i==0){
                sum = sum + i;
            }    
        }
        if(a==sum){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        if(check(a)==true){
            System.out.println(a+" là số hoàn hảo");
        }else{
            System.out.println(a+" là số bình thường");
        }
        if(check(b)==true){
            System.out.println(b+" là số hoàn hảo");
        }else{
            System.out.println(b+" là số bình thường");
        }
    }
    
}
