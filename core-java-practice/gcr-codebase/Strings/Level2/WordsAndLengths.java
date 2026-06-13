import java.util.*;
public class WordsAndLengths{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().trim().split("\\s+");
        System.out.println("Word\tLength");
        for(String x:w) System.out.println(x+"\t"+x.length());
    }
}