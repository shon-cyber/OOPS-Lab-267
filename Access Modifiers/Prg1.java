class Prg {
    public int number = 10;

    public void display() {
        System.out.println("Public number: " + number);
    }
}

public class Prg1 {
    public static void main(String[] args) {
        Prg obj = new Prg();
        obj.display();  
    }
}