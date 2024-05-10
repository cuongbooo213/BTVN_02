/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập tên: ");
        String name = sc.nextLine(); 
        System.out.println("Nhâp tuổi: ");
        int age =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int Sdt=Integer.parseInt(sc.nextLine());
        System.out.println("Chuyên ngành đang học: ");
        String se=sc.nextLine();
        System.out.println("==========================");
        System.out.println("Thông tin cá nhân: ");
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Số điện thoại: "+Sdt);
        System.out.println("Chuyên ngành: "+se);
    }
    
}
