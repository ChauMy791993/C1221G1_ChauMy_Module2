package police_Department_transport_of_chanh.models;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString() +
                ", congSuat='" + congSuat + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + congSuat;
    }
}
