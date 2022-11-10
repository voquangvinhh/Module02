import java.util.Scanner;

public class demo {
    class Application {
        public static String language;

        static {
            if(System.getProperty("lang").equals("en")){
                language = "english";
            } else {
                language = "spanish";
            }
        } //phương thức khởi tajo này không dùng từ khoá this.
    }
}