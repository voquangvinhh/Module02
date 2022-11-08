import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chuc;
        int donvi;
        int tram;
        System.out.print("nhap so hang tram: ");
        tram = sc.nextInt();
        System.out.print("Nhap so hang chuc: ");
        chuc = sc.nextInt();
        System.out.print("Nhap so hang don vi: ");
        donvi = sc.nextInt();
        String readNumber;

            switch (tram) {
                case 1:
                    readNumber = "mot tram";
                    break;
                case 2:
                    readNumber = "hai tram";
                    break;
                case 3:
                    readNumber = "ba tram";
                    break;
                case 4:
                    readNumber = "bon tram";
                    break;
                case 5:
                    readNumber = "nam tram";
                    break;
                case 6:
                    readNumber = "sau tram";
                    break;
                case 7:
                    readNumber = "bay tram";
                    break;
                case 8:
                    readNumber = "tam tram";
                    break;
                case 9:
                    readNumber = "chin tram";
                    break;
                default:
                    readNumber = "";
            }

            switch (chuc){
                case 1:
                    readNumber = "muoi";
                    break;
                case 2:
                    readNumber = "hai tram";
                    break;
                case 3:
                    readNumber = "ba tram";
                    break;
                case 4:
                    readNumber = "bon tram";
                    break;
                case 5:
                    readNumber = "nam tram";
                    break;
                case 6:
                    readNumber = "sau tram";
                    break;
                case 7:
                    readNumber = "bay tram";
                    break;
                case 8:
                    readNumber = "tam tram";
                    break;
                case 9:
                    readNumber = "chin tram";
                    break;
                default:
                    readNumber = "";
            }

        switch (donvi){
            case 1:
                readNumber = "mot";
                break;
            case 2:
                readNumber = "hai";
                break;
            case 3:
                readNumber = "ba";
                break;
            case 4:
                readNumber = "bon";
                break;
            case 5:
                readNumber = "nam";
                break;
            case 6:
                readNumber = "sau";
                break;
            case 7:
                readNumber = "bay";
                break;
            case 8:
                readNumber = "tam";
                break;
            case 9:
                readNumber = "chin";
                break;
            default:
                readNumber = "";
        }

        if (readNumber != "")
        System.out.printf("The Number " + " 5read " + readNumber);
        else System.out.printf("Out of ability!");
    }
}
