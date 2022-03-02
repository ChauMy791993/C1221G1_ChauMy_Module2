package ss7_truu_tuong_interface.bai_tap.colorble_interface;

import ss7_truu_tuong_interface.bai_tap.resizeable_interface.Circle;
import ss7_truu_tuong_interface.bai_tap.resizeable_interface.Shape;

public class TestColorble {
    public static void main(String[] args) {
        Square square1 = new Square(4);
        Square square2 = new Square(6);
        Square square3 = new Square(8);
        Circle circle = new Circle(10);
        Shape shapes[] = {square1, square2, square3, circle};
        for (Shape hinhVuong : shapes) {
            System.out.println(hinhVuong.getArea());
            if (hinhVuong instanceof Colorable) {
                ((Square) hinhVuong).howToColor();
            }
        }
    }
}
