import java.util.Scanner;
import java.lang.Math;

public class Bai_2 {
    public static void triangle(Scanner t){
        int a,b,c;
        do{
            System.out.print("Input the 1st side a = ");
            a = Integer.parseInt(t.nextLine());
        }while(a<=0);
        do{
            System.out.print("Input the 2nd side b = ");
            b = Integer.parseInt(t.nextLine());
        }while(b<=0);
        do{
            System.out.print("Input the 3rd side c = ");
            c = Integer.parseInt(t.nextLine());
        }while(c<=0);
        if( a+b > c && a+c > b && b+c > a){
            if(a==b && a==c){
                System.out.println("This is an equilateral triangle");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Thís is an isosceles triangle");
            }
            else{
                System.out.println("Thís ís a normal triangle");
            }
            float p = (float) (a + b + c) / 2;
            System.out.println("Perimeter of this triangle = " + (a+b+c));
            System.out.println("Area of this triangle = " + (Math.sqrt(p * (p-a) * (p-b) * (p-c))));
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        triangle(t);
        System.out.print("em viết tiếng anh với hàm cho quen thoi chứ không phải em dùng ai đâu các anh ơi:(");
    }
}
