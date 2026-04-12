class Product {
    private String name;
    private int quantity;

    public void addStock(int qty) {
        if(qty > 0) {
            quantity += qty;
        }
    }

    public int getQuantity() {
        return quantity;
    }
}