import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("width = ");
        float width = sc.nextFloat();
        System.out.print("height = ");
        float height = sc.nextFloat();
        System.out.printf("Diện tích : %.2f\nChu vi: %.2f ",width*height,2*(width+height));
    }
}
