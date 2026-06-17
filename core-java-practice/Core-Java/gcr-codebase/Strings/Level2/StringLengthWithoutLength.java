import java.util.*;
public class StringLengthWithoutLength{
    static int findLength(String s){
        int c=0;
        try{while(true){s.charAt(c);c++;}}catch(Exception e){}
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Custom Length: "+findLength(s));
        System.out.println("Built-in Length: "+s.length());
    }
}