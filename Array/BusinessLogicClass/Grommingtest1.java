package Array;

import java.util.Scanner;

public class Grommingtest1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter lower limit");
        int lowerLimit= sc1.nextInt();
        System.out.println("enter higher limit");
        int higherLimit= sc1.nextInt();
        int a=0;
        int counter =0;
        for(int iCnt=lowerLimit;iCnt<=higherLimit;iCnt++){
            for(a=2;a<=(iCnt/2);a++){
                if((iCnt%a)==0){
                    break;

                }
            }
            if(a==(iCnt/2)+1){
                System.out.println("prime number is "+iCnt);
                counter++;

            }

        }

    }

}



