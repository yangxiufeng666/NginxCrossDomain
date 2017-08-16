package com.example.demo;

/**
 * Created by Mr.Yangxiufeng on 2017/8/11.
 * Time:14:55
 * ProjectName:TestNginxB
 */
public class Test {
    public static void main(String[] args) {
        int i=1;
        int s=0;
        while (i<5){
            i = i + 2;
            s = 2 * i + 3;
            i--;
        }
        System.out.println(s);
    }
}
