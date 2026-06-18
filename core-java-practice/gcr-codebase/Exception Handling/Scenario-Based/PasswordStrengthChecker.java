import java.util.*;import java.io.*;
public class PasswordStrengthChecker{
    static void checkPassword(String password){
        try{
            if(password==null) throw new NullPointerException();
            if(password.isEmpty()) throw new IllegalArgumentException("Password is empty");
            if(password.length()<8) throw new IllegalArgumentException("Password must be at least 8 characters");
            if(!Character.isUpperCase(password.charAt(0))) throw new IllegalArgumentException("First character must be uppercase");
            if(!Character.isDigit(password.charAt(password.length()-1))) throw new IllegalArgumentException("Last character must be a digit");
            if(!password.matches(".*[@#$%&*].*")) throw new IllegalArgumentException("Password must contain a special character");
            System.out.println("Strong Password");
        }catch(NullPointerException e){System.out.println("Password cannot be null");}
        catch(IllegalArgumentException e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args){checkPassword("Test@123");}
}