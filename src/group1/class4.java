package group1;

import java.util.Arrays;
import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        Scanner scan4 = new Scanner(System.in);
        System.out.println("температура на улице");
        int t = scan4.nextInt();

         if(t > -5) {
            System.out.println("Тепло");
        } else if(t <= -5 && t > -20) {
             System.out.println("Нормально");
         }else if (t <= -20) {
            System.out.println("Холодно");

        }

    }
}
