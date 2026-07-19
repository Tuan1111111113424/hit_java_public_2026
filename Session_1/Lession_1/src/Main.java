import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            array[i] = a.nextInt();
            sum+=array[i];
        }
        System.out.println("Tong = " + sum);
        System.out.println("Hieu = " + (array[0] - array[n-1]));
        int prod = 1;
        for(int i=0 ; i<n ; i++){
            prod*=array[i];
        }
        System.out.println("Tich = " + prod);
        if(array[n-1]==0){
            System.out.println("Khong the chia vi phan tu cuoi bang 0");
        }
        else{
            System.out.println("Thuong = " + (array[0] *1.0 / array[n-1]));
        }
        int largerst = array[0];
        int smallest = array[0];
        boolean check = false;
        for(int i=0 ; i<n ; i++){
            if(array[i] == 10){
                check = true;
            }
            if(smallest > array[i]){
                smallest = array[i];
            }
            if(largerst < array[i]){
                largerst = array[i];
            }
        }
        System.out.println("So lon nhat = " + largerst);
        System.out.println("So nho nhat = " + smallest);
        if(check){
            System.out.print("Mang nay co so 10");
        }
        else{
            System.out.print("Mang nay khong co so 10");
        }
    }
}

