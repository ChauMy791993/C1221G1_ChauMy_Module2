package ss7_truu_tuong_interface.bai_tap.resizeable_interface;

public class Square extends Rectangle implements Resizeable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth() + this.getWidth() * (percent / 100));
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }
}

