import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int a = 5 > 7 ? 2 : 1;
        switch(a){
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
                break;
            default:
                System.out.print("C");
                break;
        }
    }
}
