package ss4_lop_va_doi_tuong_java.bai_tap;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";
    public Fan() {
    }

    public int getSpeed() {
        return speed;
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    "on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan1.setOn(false);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        System.out.println(fan2);

    }
}
