import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        String readNumber;

        switch (number){
            case 1:
                readNumber = "One";
                break;
            case 2:
                readNumber = "Two";
                break;
            case 3:
                readNumber = "Three";
                break;
            case 4:
                readNumber = "For";
                break;
            case 5:
                readNumber = "Fine";
                break;
            case 6:
                readNumber = "Six";
                break;
            case 7:
                readNumber = "Seven";
                break;
            case 8:
                readNumber = "Eight";
                break;
            case 9:
                readNumber = "Nine";
                break;
            case 10:
                readNumber = "Ten";
                break;
            default:
                readNumber ="";
        }
        if (readNumber != "")
        System.out.printf("The Number " + number + " 5read " + readNumber);
        else System.out.printf("Out of ability!");
    }
}
