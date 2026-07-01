import java.util.Scanner;
public class Ex44 {
    public static void Ex(int[] arr, int countodd){
        int n=arr.length;
        int[] arr1=new int[n];
        int odd_idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr1[odd_idx]=arr[i];
                odd_idx++;
            }else{
                arr1[countodd]=arr[i];
                countodd++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int countodd=0;
        if(n==0){
            System.out.print("Mảng không có phần tử");
            System.exit(0);
        }
        System.out.print("Nhập các phần tử của mảng:\n");
        int[] mang = new int[n];
        for(int i=1;i<=n;i++){
            System.out.printf("Phần tử thứ %d: ",i);
            mang[i-1] = sc.nextInt();
            if(mang[i-1]%2==0) countodd++;
        }
        Ex(mang,countodd);

    }
}
