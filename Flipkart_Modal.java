package JavaProgram.Flipkart;

public class Flipkart_Modal {

    // Fields

    private long productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    // parameterized constructor

    public Flipkart_Modal(long productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Default constructor

    public Flipkart_Modal() {}

    // Getter and Setter

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

// Ctrl + A to select