import java.util.Scanner;

public class Bai_5 {
    public static void multiplication_table(Scanner t){
        int n;
        do{
            System.out.print("Input n = ");
            n = Integer.parseInt(t.nextLine());
        }while(n<=0);
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=10 ; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }

    public static void star_triangle(Scanner t){
        int n;
        do{
            System.out.print("Input n = ");
            n = Integer.parseInt(t.nextLine());
        }while(n<=1);
        for(int i=1 ; i<=n ; i++){
            for(int j=n-2-i+1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= -1 + 2*i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void array(Scanner t){
        int n;
        do{
            System.out.print("Input n = ");
            n = Integer.parseInt(t.nextLine());
        }while(n<=0);
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = t.nextInt();
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        multiplication_table(t);
        star_triangle(t);
        array(t);
    }
}
