package police_Department_transport_of_chanh.models;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString() +
                ", trongTai=" + trongTai +
                '}';
    }
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + trongTai ;
    }
}
