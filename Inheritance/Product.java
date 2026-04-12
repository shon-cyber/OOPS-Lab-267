class Product {
    String name;
    double price;

    void showDetails() {
        System.out.println(name + " costs " + price);
    }
}

class Electronics extends Product {
    int warranty;

    void showWarranty() {
        System.out.println("Warranty: " + warranty + " years");
    }
}
