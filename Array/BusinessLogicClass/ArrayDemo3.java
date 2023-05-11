//take a number from user
package Array;
import java.util.Scanner;
public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc1 =new Scanner(System.in);
        System.out.println("enter no of elements to be stored");
        int no = sc1.nextInt();
        double []data=new double[no];
        System.out.println("enter values");
        for(int v=0;v<no;v++){
            double value =sc1.nextDouble();
            data[v]=value;

        }
        for(int v=0;v<no;v++){
            System.out.println(data[v]);
        }
    }
}
