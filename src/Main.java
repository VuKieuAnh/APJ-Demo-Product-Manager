import manager.ProductManager;
import model.Product;
import storage.ProductReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = ProductReadAndWrite.readFile();
        ProductManager kieuanh = new ProductManager(list);
        kieuanh.addNewProduct(new Product("04", "SP4", "NSX1", 100));
        kieuanh.showAll();
    }
}