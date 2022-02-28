package ss6_ke_thua_da_hinh.bai_tap.circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
