package com.hackerRank.practice;

import java.util.Scanner;

public class LoopII {
    public void method1(){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;

            for(int j = 0; j < n; j++){
                int num = (int)Math.pow(2, j) * b;
                sum = sum + num;
                System.out.printf("%s ", sum); // %s 안에 sum 을 집어넣기
                // printf 서식이 있는 출력
                // %d : 정수
                // %f : 실수
                // %c : 문자
                // %s : 문자열
            }
            if(i < t - 1){
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
