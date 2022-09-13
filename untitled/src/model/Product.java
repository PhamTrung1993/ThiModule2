package model;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private int productPrice;
    private int productAmount;
    private String productDescribe;

    public Product() {
    }

    public Product(String productID, String productName, int productPrice, int productAmount, String productDescribe) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
        this.productDescribe = productDescribe;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }




    @Override
    public String toString() {
        return "product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productAmount=" + productAmount +
                ", productDescribe='" + productDescribe + '\'' +
                '}';
    }
}
