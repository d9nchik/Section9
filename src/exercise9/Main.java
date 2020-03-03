package exercise9;

public class Main {
    public static void main(String[] args) {
        RegularPolygon first = new RegularPolygon();
        RegularPolygon second = new RegularPolygon(6, 4);
        RegularPolygon third = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("First object perimeter " + first.getPerimeter() + " and area " + first.getArea());
        System.out.println("Second object perimeter " + second.getPerimeter() + " and area " + second.getArea());
        System.out.println("Third object perimeter " + third.getPerimeter() + " and area " + third.getArea());
    }
}
