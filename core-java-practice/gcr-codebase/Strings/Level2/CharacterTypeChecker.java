import java.util.*;
public class CharacterTypeChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Character\tType");
        for(char ch:s.toCharArray()){
            char c=Character.toLowerCase(ch);
            String t="Not a Letter";
            if(c>='a'&&c<='z') t="aeiou".indexOf(c)>=0?"Vowel":"Consonant";
            System.out.println(ch+"\t"+t);
        }
    }
}