import java.util.Scanner;

public class Bai_5 {
    public static void information(Scanner t){
        System.out.print("Input information (contains ID, Name, Birth_Year, Dept and separated by -) : ");
        String infor = t.nextLine();
        String new_infor = infor.trim();
        String[] split_infor = new_infor.split("-");
        for(int i=0 ; i<split_infor.length ; i++){
            split_infor[i] = split_infor[i].trim();
        }
        String normalized = "";
        String[] split_name = split_infor[1].split("\\s+");
        for(int i=0 ; i<split_name.length ; i++){
            String lower = split_name[i].toLowerCase();
            String upper_first = lower.substring(0,1).toUpperCase();
            String remaining = lower.substring(1);
            String new_name = upper_first + remaining;
            normalized += new_name;
            if(i < split_name.length -1){
                normalized += " ";
            }
        }
        if(split_infor[3].toLowerCase().contains("kỹ thuật") || split_infor[3].toLowerCase().contains("ky thuat")){
            System.out.println("Split : Technical Staff");
        }
        else{
            System.out.println("Split : Operations Officer");
        }
        System.out.print("ID : " + split_infor[0]);
        System.out.print(" | Full Name : " + normalized);
        System.out.print(" | Age : " + (2026 - Integer.parseInt(split_infor[2])));
        System.out.print(" | Department : Technician Department");
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        information(t);
    }
}
