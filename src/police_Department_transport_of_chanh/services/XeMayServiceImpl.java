package police_Department_transport_of_chanh.services;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.models.PhuongTien;
import police_Department_transport_of_chanh.models.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayServiceImpl implements IServices {
    List<XeMay> xeMayList = new ArrayList<>();

    public List<XeMay> getXeMayList() {
        return xeMayList;
    }

    public void setXeMayList(List<XeMay> xeMayList) {
        this.xeMayList = xeMayList;
    }

    @Override
    public void create(PhuongTien phuongTien) {
        xeMayList.add((XeMay) phuongTien);

    }

    @Override
    public void read() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(PhuongTien phuongTien) {
        xeMayList.remove(phuongTien);
    }
}
