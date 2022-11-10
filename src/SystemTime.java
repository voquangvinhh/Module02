import java.util.Date;

public class SystemTime {

    class Systemtime{
        public static Date now = new Date();
    }
    public static void main(String[] args) {
//        Date now = new Date();

        System.out.println("Now is: " + Systemtime.now);
    }
}
