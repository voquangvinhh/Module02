public class Comparablecircle extends Circle implements Comparable <Comparablecircle>{

//   public Comparablecircle(){
//   }

    public Comparablecircle(double radius){
        super(radius);
    }

    public Comparablecircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }
    @Override
    public int compareTo(Comparablecircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
