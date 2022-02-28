package ss6_ke_thua_da_hinh.bai_tap.lop_poin_moveable_point;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 3, 4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
