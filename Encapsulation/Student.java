class Student {
    private String name;
    private int marks;

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        if(marks >= 90) return "A";
        else if(marks >= 75) return "B";
        else return "C";
    }
}