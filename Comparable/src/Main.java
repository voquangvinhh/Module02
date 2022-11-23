public class Main {
    public static void main(String[] args) {
        Comparablecircle[] circles = new Comparablecircle[3];
        circles[0] = new Comparablecircle(3.6);
        circles[1] = new Comparablecircle(0.7);
        circles[2] = new Comparablecircle(3.6, "indigo", false);

        System.out.println("Ore-sorted: ");
        for(Comparablecircle circle: circles){
            System.out.println(circle);
        }
//        Array.sort(circles);

        System.out.println("After-sorted: ");
        for(Comparablecircle circle: circles){
            System.out.println(circle);
        }
    }
}