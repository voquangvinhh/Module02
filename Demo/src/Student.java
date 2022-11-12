public class Student {
    public String name;
    public int age;
    public String  phoneNumber;

    public static String information = "Thong tin hoc sinh";
    public static int total = 0;


    public Student(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        total++;
    }
}
// ta dùng 2 biến tĩnh là information va total.
// mục đích sử dụng của Static là chia sẻ chung cho tất cả các đối tượng của lớp chứa nó.
// các thuộc tính, phương thức có từ khoá static thì có thể truy cập đến các thuộc tính phương thức này mà không cần phải khởi tạo 1 đối tượng;
// các đối tượng thực hiện với 1 biến total
// static method có thể truy cập vào nó mà không cần tạo ra đối tượng của class đó đồng thời các thuộc tính và phương thức muốn truy cập vào static method các phương thức và thuộc tính đó phải ở dạng static.