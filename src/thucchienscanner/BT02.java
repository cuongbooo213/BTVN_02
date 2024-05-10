/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucchienscanner;

import java.util.Scanner;

public class BT02 {
    public static int check(int a){
        if(a%2==0){
            return 1;
        }else{
            return 0;
        }        
    }
    public static void vuong(int b){
        for (int i = 1; i <=b; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
    public static void tamGiac(int c){
        for (int i=c/2+1; i>=1; i--){
            for(int j=1; j<=i-1; j++){
             System.out.printf(" ");
            }
            for(int j=1; j<=(c/2)+1-i+1; j++){
             System.out.printf("*");
            }
            for(int j=1; j<=(c/2)+1-i; j++){
             System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = check(a);
        if(b==1){
            vuong(a);
        }else{
            tamGiac(a);
        }
        
        
    }
    
}
