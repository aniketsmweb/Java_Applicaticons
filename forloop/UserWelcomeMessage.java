//wap to accept total number of users from command prompt.accept the name of each and every user and diplay welcome message

package forloop;
import java.util.Scanner;
public class ForLoopDemo6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter no of users");
        int users =sc1.nextInt();
        for(int i = 1;i<=users;i++){
            System.out.println("enter"+i+"user name");
            String name = sc1.next();
            System.out.println("welcome"+name);
        }
    }
}
