import java.util.Scanner;
class Input1{
public double avg(int a, int b, int c){
double result=(a+b+c)/3;
return result;
}
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
System.out.println("Enter the 3 Number to find the Average:");
int a=obj.nextInt();
int b=obj.nextInt();
int c=obj.nextInt();
Input1 Avg= new Input1();
double res=Avg.avg(a,b,c);
System.out.println("Average:"+res);
}
}