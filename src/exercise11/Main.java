package exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation my = new LinearEquation(a, b, c, d, e, f);

        if (my.isSolvable())System.out.println("x is " + my.getX() + " and y is " + my.getY());

        else
            System.out.println("The equation has no solution");
    }
}
