package police_Department_transport_of_chanh.services;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.models.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class OToServiceImpl implements IServices {
    List<OTo> oToList = new ArrayList<>();

    public List<OTo> getoToList() {
        return oToList;
    }

    public void setoToList(List<OTo> oToList) {
        this.oToList = oToList;
    }

    @Override
    public void create(PhuongTien phuongTien) {
        oToList.add((OTo) phuongTien);

    }

    @Override
    public void read() {
        for (OTo oTo : oToList) {
            System.out.println(oTo);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(PhuongTien phuongTien) {
        oToList.remove(phuongTien);

    }
}
