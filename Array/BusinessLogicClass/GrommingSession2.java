package Array;
import java.util.Scanner;

public class GrommingSession2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter lower limit");
        int lowerLimit= sc1.nextInt();
        System.out.println("enter higher limit");
        int higherLimit= sc1.nextInt();
        for(int iCnt=lowerLimit;iCnt<=higherLimit;iCnt++){
            prime(iCnt);

        }

    }
    private static void prime(int ino) {

        int iCnt=0;
        for(iCnt=2;iCnt<=(ino/2);iCnt++){
            if((ino%iCnt)==0){
                break;

            }
        }
        if(iCnt==(ino/2)+1){
            System.out.println("prime number is "+ino);


        }


    }
}
