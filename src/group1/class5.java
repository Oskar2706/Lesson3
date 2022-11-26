package group1;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner scan5 = new Scanner(System.in);
        System.out.println("цвет радуги");
        int color = scan5.nextInt();
        switch (color) {
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("no color");
        }
    }
}