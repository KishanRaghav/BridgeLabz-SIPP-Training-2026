import java.util.*;
public class VotingEligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[][] data=new String[10][2];
        for(int i=0;i<10;i++){
            int age=sc.nextInt();
            data[i][0]=String.valueOf(age);
            data[i][1]=String.valueOf(age>=18);
        }
        System.out.println("Age\tCanVote");
        for(String[] r:data) System.out.println(r[0]+"\t"+r[1]);
    }
}