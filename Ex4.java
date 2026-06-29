import java.util.Scanner;
import java.util.Arrays;
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int[] arr={c1,c2,c3};
        Arrays.sort(arr);
        if(arr[0]<=0){
            System.out.print("Ba cạnh không tạo thành tam giác");
        }else if(arr[1]+arr[0] <= arr[2]){
            System.out.print("Ba cạnh không tạo thành tam giác");
        }else if(arr[0]==arr[2]){
            System.out.print("Đây là tam giác đều");
        }else if(arr[0]*arr[0]+arr[1]*arr[1] == arr[2]*arr[2]){
            if(arr[0]==arr[1]){
                System.out.print("Đây là tam giác vuông cân");
            }else System.out.print("Đây là tam giác vuông");
        }else  if(arr[0] == arr[1] || arr[2] == arr[1]){
            System.out.print("Đây là tam giác cân");
        }else System.out.print("Đây là tam giác thường");
    }
}
