package manager;

import model.Product;
import storage.ProductReadAndWrite;

import java.util.List;

public class ProductManager {
    private List<Product> list;

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public ProductManager(List<Product> list) {
        this.list = list;
    }

    public ProductManager() {
    }

    public void addNewProduct(Product p){
        list.add(p);
        ProductReadAndWrite.writeFile(list);
    }

    public void editProduct(int index, Product p){
        list.set(index, p);
        ProductReadAndWrite.writeFile(list);
    }

    public void showAll(){
        for (Product p:list
             ) {
            System.out.println(p);
        }
    }
}