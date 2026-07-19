import java.util.Scanner;
import java.lang.Math;

public class Bai_1 {
    public static void calculator(Scanner t){
        System.out.print("Input A(x,y) = ");
        int x1 = t.nextInt();
        int y1 = t.nextInt();
        System.out.print("Input B(x,y) = ");
        int x2 = t.nextInt();
        int y2 = t.nextInt();
        double result = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow((y2-y1),2));
        System.out.printf("Distance between two points on the xy-dimension = %.2f", result);
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        calculator(t);
    }
}
