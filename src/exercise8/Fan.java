package exercise8;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius =5;
    private String color = "blue";

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan(){}

    public String toString(){
        if (on)
            return "Speed: "+speed+"; color: "+color+"; radius: "+radius;
        else
            return "fan is off";
    }
}
