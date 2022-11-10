import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double NumA = sc.nextDouble();
        System.out.println("Enter number b: ");
        double NumB = sc.nextDouble();
        System.out.println("Enter number c: ");
        double NumC = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(NumA , NumB, NumC);
        System.out.println("The equation has tow roots: ");
        System.out.println("The equations has one root");

    }
    double NumA, NumB, NumC;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double NumA, double NumB, double NumC){
        this.NumA = NumA;
        this.NumB = NumB;
        this.NumC = NumC;
    }

    public double getDiscriminant(){
        return NumB*2 - 4*NumA*NumC;
    }

//    public double getRoot1(){
//        return Math.()
//    }
}
