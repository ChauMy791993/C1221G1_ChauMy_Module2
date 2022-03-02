package ss7_truu_tuong_interface.bai_tap.colorble_interface;

import ss7_truu_tuong_interface.bai_tap.resizeable_interface.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}

