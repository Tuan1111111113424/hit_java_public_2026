import java.util.Scanner;

public class Bai_3 {
    public static void check_password(Scanner t){
        System.out.print("Input password : ");
        String pass = t.nextLine();
        String new_pass = pass.trim();
        boolean check_digit = false;
        boolean check_upper = false;
        boolean check_length = false;
        for(int i=0 ; i<new_pass.length() ; i++){
            if(new_pass.charAt(i) >= 'A' && new_pass.charAt(i) <= 'Z'){
                check_upper = true;
            }
            if(new_pass.charAt(i) >= '0' && new_pass.charAt(i) <= '9'){
                check_digit = true;
            }
        }
        if(new_pass.length() >= 8){
            check_length = true;
        }
        if(check_digit && check_upper && check_length){
            System.out.println("Valid !");
        }
        if(!check_upper || !check_digit || !check_length){
            System.out.println("Invalid !");
        }
        if(!check_length){
            System.out.println("Password must be at least 8 characters long (Current length after trimming spaces : " + new_pass.length() + " )");
        }
        if(!check_upper){
            System.out.println("Password must contain at least one uppercase letter");
        }
        if(!check_digit){
            System.out.println("Password must contain at least one digital number");
        }
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        check_password(t);
    }
}
