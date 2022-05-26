package business.concretes;

import business.abstracts.IproductServices;
import core.IJloggerServices;
import dataAccess.abstracts.IProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements IproductServices {


    private IProductDao iProductDao;
    private IJloggerServices iJloggerServices;

    public ProductManager(IProductDao iProductDao , IJloggerServices iJloggerServices) {
        this.iProductDao = iProductDao;
        this.iJloggerServices = iJloggerServices;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 2){

            return;
        }
    iProductDao.add(product);
        iJloggerServices.logToSystem(product.getProductName() + "Added !");


    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
