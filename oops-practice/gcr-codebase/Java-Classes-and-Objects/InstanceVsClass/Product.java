public class Product{
String productName; double price;
static int totalProducts=0;
Product(String n,double p){productName=n;price=p;totalProducts++;}
void displayProductDetails(){System.out.println(productName+" "+price);}
static void displayTotalProducts(){System.out.println(totalProducts);}
}