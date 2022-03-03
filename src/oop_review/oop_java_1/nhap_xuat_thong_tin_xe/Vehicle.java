package oop_review.oop_java_1.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private int dungTich;
    private long giaXe;

    public Vehicle() {
    }

    public Vehicle(int dungTich, long giaXe) {
        this.dungTich = dungTich;
        this.giaXe = giaXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public long getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(long giaXe) {
        this.giaXe = giaXe;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "dungTich=" + dungTich +"cc"+
                ", giaXe=" + giaXe + " VND"+
                '}';
    }

    public double getThueXe() {
        if (this.dungTich < 100) {
            return this.giaXe * 0.01;
        } else if (this.dungTich < 200) {
            return this.giaXe * 0.03;
        } else {
            return this.giaXe * 0.05;
        }
    }

}
