//wap to take lower limit and higherlimit from user and print prime numbers between that limt by using array 
package Array;
import java.util.Scanner;
public class GrommingSession {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter lower limit");
        int lowerLimit= sc1.nextInt();
        System.out.println("enter higher limit");
        int higherLimit= sc1.nextInt();
        //for calculation of prime number
        int size=primeCalculation(lowerLimit,higherLimit);
        //for operation on array
        int[]arr=primeArray(lowerLimit,higherLimit,size);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int primeCalculation(int lower,int higher){
        int counter=0;
        int a=0;
        for(int iCnt=lower;iCnt<=higher;iCnt++){
            for(a=2;a<=(iCnt/2);a++){//reducing time complexity n/2
                if((iCnt%a)==0){
                    break;
                }
            }
            if(a==(iCnt/2)+1){
                counter++;
            }
        }
        return counter;
    }
    public static int [] primeArray(int lower,int higher,int size){//for operation on array
        int counter=0;
        int a=0;
        int[]arr=new int[size];

        for(int iCnt=lower;iCnt<=higher;iCnt++){
            for(a=2;a<=(iCnt/2);a++){
                if((iCnt%a)==0){
                    break;
                }
            }
            if(a==(iCnt/2)+1){
                arr[counter]=iCnt;//for initializing member values of array
                counter++;
            }

        }
        return arr;
    }

}
