import java.util.Scanner;

public class Bai_1 {
    public static void q1(Scanner t){
        System.out.print("Length = ");
        float length = Integer.parseInt(t.nextLine());
        System.out.print("Width = ");
        float width = Integer.parseInt(t.nextLine());
        System.out.println("Perimeter of this rectangle = " + (length*2 + width*2));
        System.out.print("Area of this rectangle = " + (length * width));
    }

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        q1(t);
    }
}
