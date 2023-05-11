package Array;
import java.util.Scanner;
public class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int[]data={5,25,35,45};
        System.out.println("enter a number");
        int no= sc1.nextInt();
        boolean found = false;
        for(int a=0;a<data.length;a++){
            if(data[a]==no){
                System.out.println("enter number is mached");
                found = true;
// why not else???
            }
        }
        if(!found){
            System.out.println("does not exists");

        }
    }
}
