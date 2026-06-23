public class CarRental{
String customerName,carModel; int rentalDays;
CarRental(){}
CarRental(String c,String m,int d){customerName=c;carModel=m;rentalDays=d;}
double totalCost(){return rentalDays*1000;}
}