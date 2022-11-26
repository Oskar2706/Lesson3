package group1;

import java.util.Scanner;



    public class class1 {
        public static void main(String[] args) {

            Scanner scan1 = new Scanner(System.in);
            System.out.println(" номер месяца ");
            int month = scan1.nextInt();

            switch (month) {
                case 1:
                    System.out.println("ввели Январь");break;
                case 2:
                    System.out.println("ввели февраль");break;
                case 3:
                    System.out.println("ввели март");break;
                case 4:
                    System.out.println("ввели апрель");break;
                case 5:
                    System.out.println("ввели май");break;
                case 6:
                    System.out.println("ввели июнь");break;
                case 7:
                    System.out.println("ввели июль");break;
                case 8:
                    System.out.println("ввели август");break;
                case 9:
                    System.out.println("ввели сентябрь");break;
                case 10:
                    System.out.println("ввели октябрь");break;
                case 11:
                    System.out.println("ввели ноябрь");break;
                case 12:
                    System.out.println("ввели декабрь");break;
                default:
                    System.out.println("no month");
            }
        }
    }