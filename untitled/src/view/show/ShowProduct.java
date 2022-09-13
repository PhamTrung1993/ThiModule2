package view.show;

import model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ShowProduct {
    public Product createProductForm() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===ADD NEW CONTACT===");
        System.out.print("1. Enter Product ID:");
        String ID = br.readLine();
        System.out.print("2. Enter Product Name:");
        String name = br.readLine();
        System.out.print("3. Enter Product Price:");
        int price = Integer.parseInt(br.readLine()) ;
        System.out.print("4. Enter Product Amount:");
        int amount = Integer.parseInt(br.readLine());
        System.out.print("5. Enter Product Describe:");
        String describe = br.readLine();
        Product product = new Product(ID,name,price,amount,describe);
        return product;
    }
    public int mainMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Display Product");
        System.out.println("2. Add new Product");
        System.out.println("3. Edit Contact by ID");
        System.out.println("4. Delete Product by ID");
        System.out.println("5. Search Product info by ID");
        System.out.println("5. Sort Product ");
        System.out.println("6. Load contact from database");
        System.out.println("7. Save contact to database");
        System.out.println("================================");
        System.out.println("9. Quit");
        option = Integer.parseInt(br.readLine());
        return option;
    }
    public void displayAllProduct(ArrayList<Product> products) {
        System.out.println("================DISPLAY ALL PRODUCT======================================");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ID","Name","Price","Amount","Describe");
        Iterator<Product> itr = products.iterator();
        while (itr.hasNext()) {
            Product holder = itr.next();
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",holder.getProductID(), holder.getProductName(), holder.getProductPrice(), holder.getProductAmount(),holder.getProductDescribe());
        }
        System.out.println("===========================================================================");
    }
    public static String enterIDForm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("========== ENTER ID FORM ==========");
        System.out.print("Enter contact name:");
        value = br.readLine();
        return value;
    }
    public static void displayProduct(Product product) throws IOException {
        System.out.println("================DISPLAY CONTACT======================================");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ID","Name","Price","Amount","Describe");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
               product.getProductID(),product.getProductName(),product.getProductPrice(),product.getProductAmount(),product.getProductDescribe());
    }
}
