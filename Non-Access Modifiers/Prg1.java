class Static {
    static int count = 0;

    Static() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Prg1 {
    public static void main(String[] args) {
        new Static();
        new Static();
        new Static();
    }
}