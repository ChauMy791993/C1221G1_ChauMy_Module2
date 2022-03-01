package ss7_truu_tuong_interface.bai_tap.resizeable_interface;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);
        Shape shapes[] = {circle, rectangle, square};
        System.out.println("truoc khi thay doi kich thuoc");
        for (Shape hinh : shapes) {
            System.out.println(hinh.getArea());
        }
        System.out.println("sau khi thay doi kich thuoc");
        for (Shape hinh : shapes) {
            double random = Math.random() * 100 + 1;
            hinh.resize(random);
            System.out.println(hinh.getArea());
        }


    }
}
