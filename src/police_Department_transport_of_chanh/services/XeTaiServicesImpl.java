package police_Department_transport_of_chanh.services;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.models.PhuongTien;
import police_Department_transport_of_chanh.models.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiServicesImpl implements IServices {
    List<XeTai> xeTaiList = new ArrayList<>();

    public void setXeTaiList(List<XeTai> xeTaiList) {
        this.xeTaiList = xeTaiList;
    }

    public List<XeTai> getXeTaiList() {
        return xeTaiList;
    }

    @Override
    public void create(PhuongTien phuongTien) {
        xeTaiList.add((XeTai) phuongTien);
    }

    @Override
    public void read() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(PhuongTien phuongTien) {
        xeTaiList.remove(phuongTien);
    }
}
