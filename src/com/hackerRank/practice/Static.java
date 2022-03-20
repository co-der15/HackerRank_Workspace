package com.hackerRank.practice;

import java.util.Scanner;

public class Static {
    static boolean flag;
    static int B,H;

    static{
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if(B>0 && H>0){
            flag = true;
        } else {
            System.out.println("java.Lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}
