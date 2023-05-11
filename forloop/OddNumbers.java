//wap to tske start and end point from user and print odd values bettween start and end point
package forloop;
import java.util.Scanner;
public class ForLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("please enter starting point");
        int s = sc1.nextInt();
        System.out.println("pleae enter end point");
        int e = sc1.nextInt();
        for(int i=s;s<=e;s++){
            if((s%2)!=0){
                System.out.println(s);
            }
        }


    }
}
