import java.util.*;
public class TrimSpaces{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int st=0,en=s.length()-1;
        while(st<=en&&s.charAt(st)==' ')st++;
        while(en>=st&&s.charAt(en)==' ')en--;
        String r=s.substring(st,en+1);
        System.out.println(r);
        System.out.println(r.equals(s.trim()));
    }
}