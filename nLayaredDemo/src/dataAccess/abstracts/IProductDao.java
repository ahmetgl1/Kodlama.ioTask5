package dataAccess.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface IProductDao {

    void add(Product product);
    void delete(Product product);
    Product get(int id);
    List<Product> getAll();
}
