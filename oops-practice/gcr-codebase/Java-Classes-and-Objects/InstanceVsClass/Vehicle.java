public class Vehicle{
String ownerName,vehicleType;
static double registrationFee=5000;
Vehicle(String o,String v){ownerName=o;vehicleType=v;}
void displayVehicleDetails(){System.out.println(ownerName+" "+vehicleType);}
static void updateRegistrationFee(double f){registrationFee=f;}
}