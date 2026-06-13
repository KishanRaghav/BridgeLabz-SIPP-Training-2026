import java.util.*;
public class RockPaperScissorsStats{
    static String comp(){
        String[] a={"Rock","Paper","Scissors"};
        return a[(int)(Math.random()*3)];
    }
    static int win(String u,String c){
        if(u.equals(c)) return 0;
        if((u.equals("Rock")&&c.equals("Scissors"))||(u.equals("Paper")&&c.equals("Rock"))||(u.equals("Scissors")&&c.equals("Paper"))) return 1;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pw=0,cw=0;
        System.out.println("User	Computer	Result");
        for(int i=0;i<n;i++){
            String u=sc.next();
            String c=comp();
            int r=win(u,c);
            String res=r==1?"Player":r==-1?"Computer":"Draw";
            if(r==1)pw++; else if(r==-1)cw++;
            System.out.println(u+"\t"+c+"\t"+res);
        }
        System.out.println("Player Wins: "+pw);
        System.out.println("Computer Wins: "+cw);
    }
}