package JavaProgram.Flipkart;

import java.util.Scanner;

public class Flipkart_Controller {
    public static void main(String[] args) {

        Flipkart_Dao flipkart_dao = new Flipkart_Dao();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to our Flipkart program");
            System.out.println("Case 1: Add product");
            System.out.println("Case 2: View product");
            System.out.println("Case 3: Update product");
            System.out.println("Case 4: Delete product");
            System.out.println("Case 5: Exit");
            System.out.println("Please enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    flipkart_dao.addProduct();
                    break;

                    case 2:
                        flipkart_dao.viewProduct();
                        break;

                        case 3:
                            flipkart_dao.updateProduct();
                            break;

                            case 4:
                                flipkart_dao.deleteProduct();
                                break;

                                case 5:
                                    System.out.println("Thank you for using our Flipkart program");
                                    break;

                                     default:

                                      System.out.println("Invalid choice");
                                      break;
                            }
                         }
                            while(choice != 5);
                      }
                 }

