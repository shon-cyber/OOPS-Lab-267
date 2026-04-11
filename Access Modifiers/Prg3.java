class Prg {
    protected int number = 30;

    protected void display() {
        System.out.println("Protected number: " + number);
    }
}

class Child extends Prg {
    void show() {
        display(); 
    }
}

public class Prg3 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}