import java.util.Scanner;

public class Bai_2 {
    public static void check_year(Scanner t){
        int year;
        do{
            System.out.print("Input year = ");
            year = Integer.parseInt(t.nextLine());
        }while(year <= 0);
        if(year % 4  == 0){
        if(year % 100 == 0 && year % 400 == 0){
                System.out.println("This is a leap year");
            }
            else if(year % 100 != 0){
                System.out.println("This is a leap year");
            }
            else{
                System.out.println("This is not a leap year");
            }
        }
        else{
            System.out.println("This is not a leap year");
        }
    }

    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        check_year(t);
    }
}
