import java.util.*;
public class ShortestLongestWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().trim().split("\\s+");
        String min=w[0],max=w[0];
        for(String s:w){
            if(s.length()<min.length())min=s;
            if(s.length()>max.length())max=s;
        }
        System.out.println("Shortest: "+min);
        System.out.println("Longest: "+max);
    }
}