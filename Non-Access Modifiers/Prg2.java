class Final {
    final int number = 100;

    void display() {
        // number = 200; 
        System.out.println("Final number: " + number);
    }
}

public class Prg2 {
    public static void main(String[] args) {
        Final obj = new Final();
        obj.display();
    }
}