package entities.concretes;

import entities.abstracts.IEntity;

public class Product implements IEntity {

    private int id;
    private int categoryId;
    private String productName;
    private double productUnitPrice;
    private int productUnitsInStocks;


    public Product() {
    }

    public Product(int id, int categoryId, String productName, double productUnitPrice, int productUnitsInStocks) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productUnitPrice = productUnitPrice;
        this.productUnitsInStocks = productUnitsInStocks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public int getProductUnitsInStocks() {
        return productUnitsInStocks;
    }

    public void setProductUnitsInStocks(int productUnitsInStocks) {
        this.productUnitsInStocks = productUnitsInStocks;
    }
}
