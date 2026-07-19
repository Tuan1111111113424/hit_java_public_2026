import java.util.Scanner;
import java.lang.Math;

public class Bai_2 {
    public static void triangle(Scanner t){
        int a,b,c;
        do{
            System.out.print("Input the first side of triangle = ");
            a = Integer.parseInt(t.nextLine());
        }while(a<=0);
        do{
            System.out.print("Input the second side of triangle = ");
            b = Integer.parseInt(t.nextLine());
        }while(b<=0);
        do{
            System.out.print("Input the third side of triangle = ");
            c = Integer.parseInt(t.nextLine());
        }while(c<=0);
        if(a+b>c && a+c>b && b+c>a){
            double p = (a+b+c) / 2.0;
            if(a==b && a==c){
                System.out.println("This is an equilateral triangle");
            }
            else if(a==b || a==c || b==c){
                System.out.println("This is an isosceles triangle");
            }
            else{
                System.out.println("This is a normal triangle");
            }
            System.out.println("Perimeter of this triangle = " + (a+b+c));
            double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Area of this triangle = %.2f%n", result);
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        triangle(t);
    }
}
