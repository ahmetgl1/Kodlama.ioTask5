package dataAccess.concretes;

import dataAccess.abstracts.IProductDao;
import entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements IProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Abc  ile eklendi :  " +product.getCategoryId());
    }

    @Override
    public void delete(Product product) {

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
