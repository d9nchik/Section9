package exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation first = new QuadraticEquation(a, b, c);

        if (first.getDiscriminant() > 0)
            System.out.println("The equation has two roots " + (int) (first.getRoot1() * 1_000_000) / 1_000_000.0 +
                    " and " + (int) (first.getRoot2() * 1_000_000) / 1_000_000.0);
        else if (first.getDiscriminant() == 0)
            System.out.println("The equation has one root " + (int) (first.getRoot1() * 1_000_000) / 1_000_000.0);
        else System.out.println("The equation has no real roots");
    }
}
