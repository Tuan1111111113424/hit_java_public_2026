import java.util.Scanner;
import java.lang.Math;

public class Bai_1 {
    public static void calculator(Scanner t){
        int x1,y1,x2,y2;
        System.out.print("Input A(x,y) = ");
        x1 = t.nextInt();
        y1 = t.nextInt();
        System.out.print("Input B(x,y) = ");
        x2 = t.nextInt();
        y2 = t.nextInt();
        double result = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("Distance between two points on the xy-dimension = %.2f%n", result);
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        calculator(t);
        System.out.print("em viết tiếng anh với hàm cho quen thoi chứ không phải em dùng ai đâu các anh ơi:(");
    }
}
