import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hundress;
        int dozens;
        int unit;
        int x = 0;
        System.out.print("nhap so hang tram: ");
        hundress = sc.nextInt();
        System.out.print("Nhap so hang chuc: ");
        dozens = sc.nextInt();
        System.out.print("Nhap so hang don vi: ");
        unit = sc.nextInt();
        String readOneNumber;
        String readTwoNumber;
        String readThreeNumber;
            switch (unit) {
                case 0:
                     readOneNumber = "Zero";
                     break;
                case 1:
                    readOneNumber = "One";
                    break;
                case 2:
                    readOneNumber = "Two";
                    break;
                case 3:
                    readOneNumber = "Three";
                    break;
                case 4:
                    readOneNumber = "Four";
                    break;
                case 5:
                    readOneNumber = "Fine";
                    break;
                case 6:
                    readOneNumber = "Six";
                    break;
                case 7:
                    readOneNumber = "Seven";
                    break;
                case 8:
                    readOneNumber = "Eight";
                    break;
                case 9:
                    readOneNumber = "Nine";
                    break;
                default:
                    readOneNumber = "";
            }
            if (dozens <= 19){
                switch (dozens) {
                    case 10:
                        readTwoNumber = "ten";
                        break;
                    case 11:
                        readTwoNumber = "eleven";
                        break;
                    case 12:
                        readTwoNumber = "twelve";
                        break;
                    case 13:
                        readTwoNumber = "thirteen";
                        break;
                    case 14:
                        readTwoNumber = "fourteen";
                        break;
                    case 15:
                        readTwoNumber = "fifteen";
                        break;
                    case 16:
                        readTwoNumber = "sixteen";
                        break;
                    case 17:
                        readTwoNumber = "seventeen";
                        break;
                    case 18:
                        readTwoNumber = "eighteen";
                        break;
                    case 19:
                        readTwoNumber = "nineteen";
                        break;
                    default:
                        readTwoNumber = "";
                }
            if(dozens >= 20){

                switch (dozens){
                    case 2:
                        readTwoNumber = "Twenty";
                        break;
                    case 3:
                        readTwoNumber = "Thirty";
                        break;
                    case 4:
                        readTwoNumber = "Fourty";
                        break;
                    case 5:
                        readTwoNumber = "Finety";
                        break;
                    case 6:
                        readTwoNumber = "Sixty";
                        break;
                    case 7:
                        readTwoNumber = "Seventy";
                        break;
                    case 8:
                        readTwoNumber = "Eighty";
                        break;
                    case 9:
                        readTwoNumber = "Ninety";
                        break;
                    default:
                        readTwoNumber  = "";
                }
            }
        }

        if (readOneNumber != "")
        System.out.printf("The Number " + " 5read " );
        else System.out.printf("Out of ability!");
    }
}
