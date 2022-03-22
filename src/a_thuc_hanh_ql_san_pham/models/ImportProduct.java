package a_thuc_hanh_ql_san_pham.models;

public class ImportProduct extends Product {
    long importprice;
    String importProvince;
    Long importTax;

    public ImportProduct() {
    }

    public ImportProduct(String idProduct, int codeProduct, String nameProduct, long price, int quantity, String manufacturer, long importprice, String importProvince, Long importTax) {
        super(idProduct, codeProduct, nameProduct, price, quantity, manufacturer);
        this.importprice = importprice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public long getImportprice() {
        return importprice;
    }

    public void setImportprice(long importprice) {
        this.importprice = importprice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public Long getImportTax() {
        return importTax;
    }

    public void setImportTax(Long importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString() +
                ", importprice=" + importprice +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }
}

