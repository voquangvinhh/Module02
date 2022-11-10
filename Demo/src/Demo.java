import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Student a = new Student("Chau",21, "0915740599" );
        Student b = new Student("Hai", 25, "0917364998");
        Student c = new Student("Phong", 19,"098472651");
        System.out.println("information (from class): " + Student.information);
//        System.out.println("information (from instance): " + b.information);
        System.out.println("total (from class): " + Student.total); // gọi trực tiếp tên class Student và truy cập vào thuộc tính total.
//        System.out.println("total (from instance): " + c.total);
//        System.out.println("Name" + Student.name);

    }
}
