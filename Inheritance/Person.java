class Person {
    String name;

    void displayName() {
        System.out.println(name);
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Teaching " + subject);
    }
}