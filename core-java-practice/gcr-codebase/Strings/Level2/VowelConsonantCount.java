import java.util.*;
public class VowelConsonantCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0;
        for(char ch:s.toCharArray()){
            ch=Character.toLowerCase(ch);
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)>=0)v++; else c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
    }
}