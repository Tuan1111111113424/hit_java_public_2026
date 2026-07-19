//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static float length;
    static float width;

    public static void input(Scanner t) {
        do {
            System.out.print("Length : ");
            length = Integer.parseInt(t.nextLine());
        } while (length <= 0);
        do {
            System.out.print("Width : ");
            width = Integer.parseInt(t.nextLine());
        } while (width <= 0);
    }

    public static void check_year(Scanner t) {
        int day;
        do {
            day = Integer.parseInt(t.nextLine());
        } while (day != 365 && day != 366);
        if (day == 365) {
            System.out.println("This is not a leap year");
        } else {
            System.out.println("This is a leap year");
        }
    }


    public static int factorial(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }

    public static int sum_of_even(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

   /* public static void reverse(Scanner t) {
        System.out.print("Input number = ");
        String num = t.nextLine();
        String new_num = "";
        for(int i=num.length()-1 ; i>=0 ; i--){
            new_num += num.charAt(i);
        }
        System.out.println("Reversed number = " + new_num);
        if(num.equalsIgnoreCase(new_num)){
            System.out.println("This is a palindrome number");
        }
        else{
            System.out.println("This is not a palindrome number");
        }
    }*/

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        input(t);
        System.out.println("Perimeter of this rectangle = " + (length * 2 + width * 2));
        System.out.println("Area of this rectangle = " + (length * width));
        check_year(t);
        System.out.print("Input n = ");
        int n = Integer.parseInt(t.nextLine());
        System.out.println("n! = " + factorial(n));
        System.out.println("Sum of even number from 1 to n = " + sum_of_even(n));
        /*reverse(t);*/
        int l;
        do {
            l = Integer.parseInt(t.nextLine());
        } while (l <= 1 || l >= 10);
        for (int i = 2; i <= l; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
        int q;
        do{
            q = Integer.parseInt(t.nextLine());
        }while(q<=1);
        for(int i=1 ; i<=q ; i++){
            for(int j=q-2-i+1 ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 1 + 2*i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}