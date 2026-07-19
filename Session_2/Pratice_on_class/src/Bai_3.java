import java.util.Scanner;

public class Bai_3 {
    public static void q3(Scanner t){
        int n;
        do{
            System.out.print("Input n = ");
            n = Integer.parseInt(t.nextLine());
        }while(n<=0);
        int prod = 1;
        for(int i=1 ; i<=n ; i++){
            prod*=i;
        }
        int sum =0;
        for(int i=2 ; i<=n ; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("n! = " + prod);
        System.out.print("Sum of all even number from 1 to n = " + sum);
    }

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        q3(t);
    }
}
