package group2;

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(" введите число ");
        while (scaner.hasNextInt()) {
        int num = scaner.nextInt();
        int sum = 0;
        if (num > 0) {
                for (int i = 0; i <= num; i++) {
                    sum = sum + i; }
                {System.out.println(sum);}
        }else { System.out.println("отрицательное число");}



        }
    }}
