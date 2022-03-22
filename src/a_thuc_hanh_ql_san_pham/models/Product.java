package a_thuc_hanh_ql_san_pham.models;

public abstract class Product {
    //    Id sản phẩm, Mã sản phẩm, Tên sản phẩm, Giá bán, Số lượng, Nhà sản xuất.
    String idProduct;
    int codeProduct;
    String nameProduct;
    long price;
    int quantity;
    String manufacturer;

    public Product() {
    }

    public Product(String idProduct, int codeProduct, String nameProduct, long price, int quantity, String manufacturer) {
        this.idProduct = idProduct;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                "idProduct='" + idProduct + '\'' +
                ", codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
