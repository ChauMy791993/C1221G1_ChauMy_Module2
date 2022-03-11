package ss17_binary_file_serialization.bai_tap.utils;

import ss17_binary_file_serialization.bai_tap.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProductFile {
    public static final String PRODUCT_FILE = "src/ss17_binary_file_serialization/bai_tap/data/Product.dat";

    public static List<Product> readProductFile() {
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        File file = new File(PRODUCT_FILE);
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
        objectInputStream.close();
        fileInputStream.close();
    }
}
