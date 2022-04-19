/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HELLO;

import java.util.Scanner;

/**
 *
 * @author qngtuann
 */
public class hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.next();
        System.out.println("Mời bạn nhập tuổi");
        int age=scanner.nextInt();
        System.out.println("Mời bạn nhập số điện thoại");
        String tel=scanner.next();
        System.out.println("Xin chào và cảm ơn" + name + age + tel);
    }
}
