package a_thuc_hanh_ql_san_pham.models;

public class ExportProducts extends Product {
    Long exportPrice;
    String countryOfImport;

    public ExportProducts() {
    }

    public ExportProducts(String idProduct, int codeProduct, String nameProduct, long price, int quantity, String manufacturer, Long exportPrice, String countryOfImport) {
        super(idProduct, codeProduct, nameProduct, price, quantity, manufacturer);
        this.exportPrice = exportPrice;
        this.countryOfImport = countryOfImport;
    }

    public Long getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(Long exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCountryOfImport() {
        return countryOfImport;
    }

    public void setCountryOfImport(String countryOfImport) {
        this.countryOfImport = countryOfImport;
    }

    @Override
    public String toString() {
        return "ExportProducts{" + super.toString() +
                "exportPrice=" + exportPrice +
                ", countryOfImport='" + countryOfImport + '\'' +
                '}';
    }
}
