import business.concretes.ProductManager;
import core.JloggerManagerAdaptor;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hello World !");

        Product product1 = new Product(1,3,"Laptop" , 3400,50);
        ProductManager manager = new ProductManager(new AbcProductDao(),new JloggerManagerAdaptor());
              manager.add(product1);




    }
}

