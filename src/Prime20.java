import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter is your Number: ");
        int numbers = sc.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", numbers);
        int count =0;
        int coutSNT = 0;
        int N = 2;
        for (N= 2; N < 100; N++){
            if (coutSNT < numbers){
                for (int j = 1; j <= N; j++){
                    if (N % j == 0){
                        count += 1;
                    }
                }
                if (count == 2){
                    System.out.print(N + " ");
                    coutSNT++;
                }
                count = 0;
            }else{
                break;
            }
        }
    }
}
