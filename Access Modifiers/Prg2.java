class Prg {
    private int number = 20;

    private void display() {
        System.out.println("Private number: " + number);
    }

    public void show() {
        display(); 
    }
}

public class Prg2 {
    public static void main(String[] args) {
        Prg obj = new Prg();
        obj.show(); 
    }
}