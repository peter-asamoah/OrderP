package ExchangeProcessing;

public class Order {
    private String Stock;
    private int quantity;
    private double price;
    private String action;

    public Order(String stock, int quantity, double price, String action) {
        Stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.action = action;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Stock='" + Stock + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", action='" + action + '\'' +
                '}';
    }
    //changed new
}
