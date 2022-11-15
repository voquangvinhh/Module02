import java.util.Scanner;

public class ClearValue {
    public static void main(String[] args) {
        int N[] = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        int soCanXoa = sc.nextInt();

        System.out.println("Truoc khi xoa: ");
        for (int element : N){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = soCanXoa; i < N.length - 1; i++){
            N[i] = N[i + 1];
        }
        System.out.println("Sau khi xoa: ");
        for (int element : N){
            System.out.print(element + " ");
        }
    }
}
