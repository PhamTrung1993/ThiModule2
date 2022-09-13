package controller;


import model.Product;
import view.show.ShowProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Function {
    public void updateContactByID(ArrayList<Product> products) throws IOException {
        Iterator<Product> itr;
        String id = ShowProduct.enterIDForm();
        itr = products.iterator();
        while (itr.hasNext()) {
            Product holder = itr.next();
            if (holder.getProductID().equals(id)) {
                ShowProduct showProduct = new ShowProduct();
                products.set(products.indexOf(holder), showProduct.createProductForm());
                break;
            }
        }
    }
    public void deleteProductByID(ArrayList<Product> products) throws IOException {
        Iterator<Product> itr;

        String id = ShowProduct.enterIDForm();
        itr = products.iterator();
        while (itr.hasNext()) {
            Product holder = itr.next();
            if (holder.getProductID().equals(id)) {
                products.remove(holder);
                break;
            }
        }
    }
    public void searchProductByID(ArrayList<Product> products) throws IOException {
        Iterator<Product> itr;
        String id = ShowProduct.enterIDForm();
        itr = products.iterator();
        while (itr.hasNext()) {
            Product  holder = itr.next();
            if (holder.getProductID().equals(id)) {
                ShowProduct showProduct = new ShowProduct();
               showProduct.displayProduct(holder);
            }
        }
    }
    public ArrayList<Product> sortByIncreaseCost(ArrayList<Product> products){
        Arrays.sort(new ArrayList[]{products});
        return products;
    }
    public ArrayList<Product> sortByDecreaseCost(ArrayList<Product> products) {
        ArrayList<Product> productlist = new ArrayList<>();
        productlist = sortByIncreaseCost(products);
        Collections.reverse(productlist);
        return productlist;
    }
    public void findMaxCost(ArrayList<Product> products){
        ArrayList<Product> productList = new ArrayList();
        productList = sortByDecreaseCost(products);
        System.out.println("The product with the greatest price is: "+productList.get(0));
    }
}
