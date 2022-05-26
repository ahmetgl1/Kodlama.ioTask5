package dataAccess.concretes;

import dataAccess.abstracts.IProductDao;
import entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements IProductDao {
    @Override
    public void add(Product product) {

        System.out.println("Added with Hibernate :  " +product.getCategoryId());
    }

    @Override
    public void delete(Product product) {
System.out.println("Deleted with Hibernate:" + product.getProductName());



    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
