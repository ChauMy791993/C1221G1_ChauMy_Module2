package police_Department_transport_of_chanh.models;

public class OTo extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;

    public OTo() {
    }

    public OTo(String bienKiemSoat, String hangXe, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangXe, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "OTo{" +super.toString()+
                ", soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return super.getInfoToCSV()+","+soChoNgoi+","+kieuXe;
    }
}
