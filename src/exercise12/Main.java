package exercise12;

import exercise11.LinearEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();


        double a = y1-y2;
        double b = x2-x1;
        double c = y3-y4;
        double d = x4-x3;
        double e = a*x1+b*y1;
        double f = c*x3 +d*y3;

        LinearEquation my = new LinearEquation(a, b, c, d, e, f);

        if (my.isSolvable())System.out.println("x is " + my.getX() + " and y is " + my.getY());

        else
            System.out.println("The equation has no solution");

    }
}
