class Bill{
public static void main(String[] args){
double price=599.0;
String product="Netflix Subscription";
float tax=0.5f;
double discount=0.10;
price= price-(discount*price);
price= price+(tax*price);
System.out.println("****************BILL****************");
System.out.println("Applied Discount :"+discount);
System.out.println("Applied Tax      :"+tax);
System.out.println("Total Amount     :"+price);

}
}


