package group3;

import java.util.Scanner;

public class additional2 {
    public static void main(String[] args) {
        Scanner add2 = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");

        float sum = add2.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");

        int period = add2.nextInt();

        for(int i = 1; i <= period; i++){

            sum += sum * 0.07;

        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);

    }
    }

