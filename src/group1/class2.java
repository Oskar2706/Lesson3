package group1;

import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        System.out.println("номер месяца");
        int month = scan2.nextInt();

        if (month >=12 || month <=2){
            System.out.println("зима");
        }else if(month >=3 && month <= 5){
            System.out.println("весна");
        }else if(month >=6 && month <=8){
            System.out.println("лето");
        }else System.out.println("осень");
    }

}
