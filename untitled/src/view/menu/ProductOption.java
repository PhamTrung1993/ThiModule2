package view.menu;

import controller.Function;
import model.Product;
import storage.product.ReadWriteFileProduct;
import view.show.ShowProduct;

import java.io.IOException;
import java.util.ArrayList;

public class ProductOption {
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_CODE = 0;
    private static final int INIT_VALUE = -1;
    private static final int DISPLAY_ALL_PRODUCT = 1;
    public static final int ADD_PRODUCT = 2;
    public static final int UPDATE_PRODUCT = 3;
    public static final int DELETE_PRODUCT = 4;
    public static final int SEARCH_PRODUCT = 5;
    public static final int ASCENDING_SORT_PRODUCT = 6;
    public static final int DESCENDING_SORT_PRODUCT = 7;
    public static final int FIND_THE_BEST_PRICE = 8;
    public static final int LOAD_DATA = 9;
    public static final int SAVE_DATA = 10;

    private static ArrayList<Product> initData() {
        // Sample Data
        ArrayList<Product> products = new ArrayList<Product>();

        Product product1 = new Product("A1","kem",10000,10,"Tràng Tiền");
        Product product2 = new Product("A1","kem hộp",20000,10,"Tràng Tiền");

        products.add(product1);
        products.add(product2);


        return products;
    }

    private static void menuControl(ShowProduct showProduct, Function mainFunction, ReadWriteFileProduct readWriteFileProduct, ArrayList<Product> products) throws IOException {
        int option =INIT_VALUE;

        while (option != EXIT_CODE) {
            option = showProduct.mainMenu();
            switch (option) {
                case EXIT_CODE:
                    System.exit(0);
                    break;
                case DISPLAY_ALL_PRODUCT:
                    showProduct.displayAllProduct(products);
                    break;
                case ADD_PRODUCT:
                    products.add(showProduct.createProductForm());
                    break;
                case UPDATE_PRODUCT:
                    mainFunction.updateContactByID(products);
                    break;
                case DELETE_PRODUCT:
                    mainFunction.deleteProductByID(products);
                    break;
                case SEARCH_PRODUCT:
                    mainFunction.searchProductByID(products);
                    break;
                case ASCENDING_SORT_PRODUCT:
                    mainFunction.sortByIncreaseCost(products);
                    break;
                case DESCENDING_SORT_PRODUCT:
                    mainFunction.sortByDecreaseCost(products);
                    break;
                case FIND_THE_BEST_PRICE:
                    mainFunction.findMaxCost(products);
                    break;
                case LOAD_DATA:
                    products = readWriteFileProduct.readData();
                    break;
                case SAVE_DATA:
                    readWriteFileProduct.writeData(products);
                    break;

                default:
                    System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}
