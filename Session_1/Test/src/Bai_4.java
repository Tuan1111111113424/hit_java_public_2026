import java.util.Scanner;
import java.lang.Math;

public class Bai_4 {
    public static double findMax(double[] arr){
        double largest = arr[0];
        for(double i : arr){
            if(largest <= i){
                largest = i;
            }
        }
        return largest;
    }
    public static double calculateAverage(double[] arr){
        double sum = 0;
        for(double i : arr){
            sum+=i;
        }
        return Math.round((sum / arr.length) * 100.0)/ 100.0;
    }
    public static int countFailedStudents(double[] arr){
        int cnt = 0;
        for(double i : arr){
            if(i < 5){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the number of students : ");
            n = Integer.parseInt(t.nextLine());
        }while(n<=0);
        double[] arr = new double[n];
        for(int i=0 ; i<n ; i++){
            do{
                System.out.print("Input the score of student " + (i + 1) + " : ");
                arr[i] = Double.parseDouble(t.nextLine());
            }while(arr[i] < 0 || arr[i] > 10);
        }
        System.out.println("The maximum score is : " + findMax(arr));
        System.out.println("Average class score : " + calculateAverage(arr));
        System.out.println("Number of students with scores below average : " + countFailedStudents(arr));
        System.out.print("em viết tiếng anh với hàm cho quen thoi chứ không phải em dùng ai đâu các anh ơi:(");
    }
}
