import java.util.*;
public class SplitTextCompare{
    static String[] customSplit(String s){ return s.trim().split("\\s+"); }
    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=customSplit(s);
        String[] b=s.trim().split("\\s+");
        System.out.println(compare(a,b));
    }
}