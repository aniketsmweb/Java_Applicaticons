package Array;
import java.util.Scanner;
public class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter no of elements");
        int no = sc1.nextInt();
        int []number=new int[no];
        System.out.println("enter values");
        for(int a=0;a<no;a++){
            int values = sc1.nextInt();
            number[a]=values;
        }
        for(int a=0;a<no;a++){
            if((number[a]%2)==0){
                System.out.println(number[a]+"square is"+number[a]*number[a]);
            }
            else {
                System.out.println(number[a]+"cube is"+number[a]*number[a]*number[a]);
            }
        }



    }
}
