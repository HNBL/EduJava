package lab.lab1.l6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        if(b%2==0)
        {

            if(b%2==0&&b>100)
            {
                System.out.println("Выход за пределы диапазона");
            }
            else
            {
                System.out.println("Число четное");
            }
        }
        else
        {
            System.out.println("Число нечетное");
        }
    }
}