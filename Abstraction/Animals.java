interface Animal {
    void sound();
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}