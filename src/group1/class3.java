package group1;

import java.util.Arrays;
import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("число");
        int a = scan3.nextInt();
        if (a% 2==0) {
            System.out.println("четные");
        }else{
            System.out.println("нечетные");
        }

    }
}
