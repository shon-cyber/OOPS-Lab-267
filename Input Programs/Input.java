
import java.util.Scanner;
class Input{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
System.out.println("Enter a number to find its value after multiplying it by 10:");
int num = obj.nextInt();
int result=num*10;
System.out.println("Result:"+result);
}
}