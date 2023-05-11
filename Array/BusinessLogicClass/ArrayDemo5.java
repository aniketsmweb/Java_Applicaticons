//wap to take no of subjects as an input and take marks of subjects display obtained marks, percentage,reult pass or fial
package Array;
import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter no of subjects");
        int noofsubjects= sc1.nextInt();
        double[] subject = new double[noofsubjects];
        System.out.println("enter marks");
        for(int a=0;a<noofsubjects;a++){
            double marks = sc1.nextDouble();
            subject[a]=marks;
        }
        double obtainedmarks =0.0;
        for(int a=0;a<noofsubjects;a++){
             obtainedmarks+=subject[a];// add all array values
        }
        System.out.println("obtained marks"+obtainedmarks);
        double percentage =obtainedmarks/noofsubjects;
        System.out.println("percentage"+percentage);
        if(percentage>35){
            System.out.println("retult pass");
        }
        else
        {
            System.out.println("result fail");
        }

    }
}
