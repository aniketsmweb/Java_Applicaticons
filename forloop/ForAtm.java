package forloop;
import java.util.Scanner;

public class ForAtm {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc1.nextInt();
        int rs500=0,rs200=0,rs100=0;
        rs500 =amount/500;
        amount%=500;
        rs200=amount/200;
        amount%=200;
        rs100 =amount/100;
        amount%=100;
        System.out.println("500 note"+rs500);
        System.out.println("200 note"+rs200);
        System.out.println("100 note"+rs100);



    }
}
