package ThucHanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TinhTongCacSoinFileText {
    public void readFileText(String filePath){
        try{
            //Đọc file theo đường dẫn
            File file = new File(filePath);
            
            //kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            
            //Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tong: " + sum);
            
        } catch (Exception e) {
//          File không tồn tại or nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("File khong ton tai or noi dung co loi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner sc= new Scanner(System.in);
        String path = sc.nextLine();
        
        TinhTongCacSoinFileText tinhTongCacSoinFileText = new TinhTongCacSoinFileText();
        tinhTongCacSoinFileText.readFileText(path);
    }

}
