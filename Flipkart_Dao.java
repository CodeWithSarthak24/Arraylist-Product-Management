package JavaProgram.Flipkart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Flipkart_Dao {

    Scanner sc = new Scanner(System.in);
    ArrayList<Flipkart_Modal> flipkartModals =  new ArrayList<>();

    // Add product method

    public void addProduct() {

        System.out.println("Enter product ID");
        int product_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter product name");
        String product_name = sc.nextLine();

        System.out.println("Enter product price");
        double product_price = sc.nextDouble();

        System.out.println("Enter product quantity");
        int product_quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter product category");
        String product_category = sc.nextLine();

        flipkartModals.add(new Flipkart_Modal(product_id,product_name, product_price, product_quantity, product_category));
    }

    // View product method

    public void viewProduct(){

       if(flipkartModals.isEmpty()){
           System.out.println("Nothing to view");
           return;
       }

        Iterator<Flipkart_Modal> iterator = flipkartModals.iterator();

       while(iterator.hasNext()){

           Flipkart_Modal flipkart_modal = iterator.next();
           System.out.println("Product Id: " + flipkart_modal.getProductId() + "\n" +
                   "Name: " + flipkart_modal.getProductName() + "\n" +
                   "Price: " + flipkart_modal.getPrice() + "\n" +
                   "Quantity: " + flipkart_modal.getQuantity());
       }
    }

    // Update product method

    public void updateProduct() {

        System.out.println("Enter product ID");
        int product_id = sc.nextInt();
        sc.nextLine();

        boolean searchId = false;

        for(int i = 0; i < flipkartModals.size(); i++){
            if (flipkartModals.get(i).getProductId() == product_id) {

                System.out.println("Enter product name");
                String updateProductName = sc.nextLine();

                System.out.println("Enter product price");
                double updateProductPrice = sc.nextDouble();

                System.out.println("Enter product quantity");
                int updateProductQuantity = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter product category");
                String updateProductCategory = sc.nextLine();

                Flipkart_Modal modal = new Flipkart_Modal
                        (product_id, updateProductName, updateProductPrice, updateProductQuantity, updateProductCategory);

                flipkartModals.set(i, modal);

                System.out.println("Product Updated Successfully!!");
                searchId = true;
                break;

            }
        }
        if (!searchId) {
            System.out.println("Product Id not found???");
        }
    }

    // Delete product method

    public void deleteProduct(){

        System.out.println("Enter product ID");
        int product_id = sc.nextInt();
        sc.nextLine();

        boolean searchId = false;

        for(int i = 0; i < flipkartModals.size(); i++){
            if (flipkartModals.get(i).getProductId() == product_id) {
                flipkartModals.remove(i);
                System.out.println("Product Deleted Successfully!!");
                searchId = true;
                break;

            }else {
                System.out.println("Product Id not found???");
            }
        } if (!searchId) {
            System.out.println("Product Id not found???");
        }
    }
}
