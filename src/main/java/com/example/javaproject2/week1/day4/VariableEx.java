package com.example.javaproject2.week1.day4;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0; // 최초로 초기화
        PrintHello printHello; // 변수 선언
        printHello = new PrintHello(); // new 연산자를 이용해 인스턴스 및 초기화

        System.out.println("iVal = " + iVal);
        printHello.print();
    }
}
