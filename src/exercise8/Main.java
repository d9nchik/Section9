package exercise8;

public class Main {
    public static void main(String[] args) {
        Fan first = new Fan();
        Fan second = new Fan();
        first.setSpeed(Fan.FAST);
        first.setRadius(10);
        first.setColor("yellow");
        first.setOn(true);

        second.setSpeed(Fan.MEDIUM);
        second.setRadius(5);
        second.setColor("blue");
        second.setOn(false);
        System.out.println("First fan: " + first.toString());
        System.out.println("Second fan: " + second.toString());
    }
}
