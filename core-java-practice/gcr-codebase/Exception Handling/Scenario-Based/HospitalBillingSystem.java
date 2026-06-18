import java.util.*;import java.io.*;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String msg){super(msg);}
}
public class HospitalBillingSystem{
    public static void main(String[] args){
        try{int a=10,b=0;System.out.println(a/b);}catch(ArithmeticException e){System.out.println("Bills cannot have zero items");}
        try{int[] p={1,2,3};System.out.println(p[5]);}catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid patient index");}
        try{Integer.parseInt("abc");}catch(NumberFormatException e){System.out.println("Invalid number input");}
    }
}