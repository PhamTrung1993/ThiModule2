package storage.product;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileProduct implements IReadWriteFileProduct{
    public static final String fileName = "D:\\ThiModule2\\untitled\\data\\products.csv";
    @Override
    public ArrayList<Product> readData() {

        ArrayList<Product> arrayListProduct = null;
        try

            {
                File file = new File("FileProduct.csv");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String value;
                while ((value = bufferedReader.readLine()) != null) {
                    String[] strings = value.split(",");
                    Product product = new Product(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                    arrayListProduct.add(product);
                }
                bufferedReader.close();
            } catch(
            IOException e)

            {
                System.out.println("");
            }
        return arrayListProduct;

        }


    @Override
    public void writeData(ArrayList<Product> productList) throws IOException {
        String COMMA = ",";
        String END = "\n";
        FileWriter fw = null;

        try {
            fw = new FileWriter(fileName);

            for (Object product : productList) {
                Product holder = (Product) product;
                fw.append(String.valueOf(holder.getProductID()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getProductName()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getProductAmount()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getProductPrice()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getProductDescribe()));
                fw.append(END);

            }
            System.out.println("Save Successfull!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        } finally {
            fw.flush();
            fw.close();
        }
    }
}
