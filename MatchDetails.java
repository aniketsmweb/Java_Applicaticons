package Array;
import java.util.Scanner;

public class MatchDetails {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter number of players");
        int no= sc1.nextInt();
        int [][]runs=new int[no][2];
        int sum=0;
            for (int a = 0; a < runs.length; a++) {
                for (int b = 0; b <2; b++) {
                    if(b==0){
                        runs[a][b]=a+1;
                    }
                    else {
                        System.out.println("enter runs");
                        int run = sc1.nextInt();
                        runs[a][b]=run;
                        sum+=run;
                    }
                }
            }

            for (int a = 0; a < runs.length; a++) {
                for (int b = 0; b < runs[a].length; b++) {
                    System.out.print(runs[a][b] + "\t");
                }
                System.out.println();
            }
        System.out.println("total runs are "+sum);
    }
}
