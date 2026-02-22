import java.util.Scanner;
class Input2{
public void display(String a, String b, String c){
System.out.println("Name:"+a);
System.out.println("Department:"+b);
System.out.println("Section:"+c);
}
public static void main(String args[]){
Scanner input = new Scanner(System.in);
Input2 Disp =new Input2();
System.out.println("Enter your name:");
String name = input.nextLine();
System.out.println("Enter your Department:");
String depart = input.nextLine();
System.out.println("Enter your Section:");
String sec = input.nextLine();
Disp.display(name,depart,sec);
}
}