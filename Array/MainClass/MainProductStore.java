package Array;
import java.util.Scanner;
public class MainProductStore {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        ProductStore p1 =new ProductStore();

        boolean status =true;
        while(status){
            System.out.println("1:search products");
            System.out.println("2:purchase product");
            System.out.println("3:Exit");
            int choice =sc1.nextInt();
            switch(choice){
                case 1:
                   System.out.println("enter product name");
                   String name =sc1.next();
                   p1.searchProduct(name);
                   break;

                case 2:
                    p1.displayProducts();
                    System.out.println("select product");
                    int type=sc1.nextInt();
                    System.out.println("enter qty");
                    int qty= sc1.nextInt();
                    p1.purchaseProduct(type,qty);
                    break;
                default:
                    status=false;

            }
        }
    }
}
