import java.util.Scanner;

public class ClearValue {
    public static void main(String[] args) {
        int N[] = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can chen: ");
        int soCanChen = sc.nextInt();
        System.out.println("Vi tri can chen: ");
        int viTriChen = sc.nextInt();

        System.out.println("Truoc khi chen: ");
        for (int element : N){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = soCanChen; i > viTriChen; i--){
            N[i] = N[i - 1];
        }
        N[viTriChen] = soCanChen;
        System.out.println("Sau khi chen: ");
        for (int element : N){
            System.out.print(element + " ");
        }
    }
}
