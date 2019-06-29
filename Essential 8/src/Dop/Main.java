package Dop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первое число");
        int a=sc.nextInt();
        System.out.println("Введите второе число");
        int b=sc.nextInt();
        System.out.println("Введите желаемое арифметическое действие");
        String c=sc.next();
        Calculator calc=new Calculator();
        switch (c){
            case ("+"):calc.Sum(a,b);
            break;
            case ("-"):calc.Rec(a,b);
            break;
            case "*":calc.Mul(a,b);
            break;
            case "/":calc.Div(a,b);
        break;
        }
    }
}
