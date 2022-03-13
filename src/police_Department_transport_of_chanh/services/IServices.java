package police_Department_transport_of_chanh.services;

import police_Department_transport_of_chanh.models.PhuongTien;

public interface IServices {
    void create(PhuongTien phuongTien);
    void read();
    void update();
    void delete(PhuongTien phuongTien);
}
