import java.util.Scanner;

public class Bai_3 {
    public static void password(Scanner t){
        System.out.print("Input password : ");
        String pass = t.nextLine();
        String new_pass = pass.trim();
        boolean check_digit = false;
        boolean check_upper = false;
        for(int i=0 ; i<new_pass.length() ; i++){
            if(new_pass.charAt(i) >= '0' && new_pass.charAt(i) <= '9'){
                check_digit = true;
                break;
            }
        }
        for(int i=0 ; i<new_pass.length() ; i++){
            if(new_pass.charAt(i) >= 'A' && new_pass.charAt(i) <= 'Z'){
                check_upper = true;
                break;
            }
        }
        if(new_pass.length() >= 8){
            if(!check_digit){
                System.out.println("Invalid !");
                System.out.println("Password must contain at least one digital number");
            }
            else if(!check_upper){
                System.out.println("Invalid !");
                System.out.println("Password must contain at least one uppercase letter");
            }
            else{
                System.out.println("Valid");
            }
        }
        else{
            System.out.println("Password must be at least 8 characters long (Current length after trimming spaces : " + new_pass.length() + ")");
        }
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        password(t);
    }
}
