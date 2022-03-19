package com.hackerRank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EOF {
    // EOF - End of File
    // 더 이상 읽을 수 있는 데이터가 없음
    public void method1(){
        Scanner sc = new Scanner(System.in);
        //Scanner 클래스에서 EOF 는 hasNext() 메소드를 사용
        int no = 1; // 일련번호

        while(sc.hasNext()){
            // hasNext()
            // boolean 타임으로 반환 (true / false)
            // next()
            // 매개변수 혹은 iterator 되는 타입으로 변환
            // 즉 아무 타입으로 변환할 수 있음음
            System.out.println(no + " " + sc.nextLine());
            no++;
        }
    }
    public void method2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        int no = 1;

        while((str = br.readLine()) != null){
            System.out.println(no + " " + str);
            no++;
        }
    }
}
