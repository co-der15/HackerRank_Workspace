package com.hackerRank.practice;

import java.util.Scanner;

public class DataType {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){

            try{
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in : ");
                if(x>=-128 && x<=127) System.out.println("* byte");
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647) System.out.println("* int");
                if(x>=(-(Math.pow(2,63))) && x<=(Math.pow(2,63)-1)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
