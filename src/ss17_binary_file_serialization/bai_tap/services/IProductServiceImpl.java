package ss17_binary_file_serialization.bai_tap.services;

import ss16_io_text_file.thuc_hanh.read_and_write.ReadAndWriteFile;
import ss17_binary_file_serialization.bai_tap.models.Product;

import java.util.ArrayList;
import java.util.List;

public class IProductServiceImpl implements IProductService {
    List<Product> productList = new ArrayList<>();

    @Override
    public void search(int id) {
        this.read();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println(productList.get(i));
            } else {
                System.out.println("id is not exist");
            }
        }
    }

    @Override
    public void create(Product product) {
        productList.add(product);
        ReadAndWriteProductFile.writeProductFile(productList);
    }

    @Override
    public void read() {
        System.out.println(ReadAndWriteProductFile.readProductFile);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
