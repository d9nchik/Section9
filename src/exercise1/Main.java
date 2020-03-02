package exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle first = new Rectangle(4, 40);
        Rectangle second = new Rectangle(3.5, 35.9);

        System.out.println("Perimeter first "+ first.getPerimeter());
        System.out.println("Square first "+ first.getArea());
        System.out.println("Perimeter first "+ second.getPerimeter());
        System.out.println("Square first "+ second.getArea());
    }
}
