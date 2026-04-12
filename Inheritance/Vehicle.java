class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    int doors;

    void display() {
        System.out.println("Brand: " + brand + ", Doors: " + doors);
    }
}