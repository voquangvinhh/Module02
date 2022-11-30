package CopyFile;

import javax.net.ssl.StandardConstants;
import java.io.*;
import java.nio.file.Files;

public class copyFile {
    public static void main(String[] args) {
        try{
            InputStream inputStream = new FileInputStream(new File("/Users/voquangvinh/Desktop/Huong Dan/source file.txt"));
            OutputStream outputStream = new FileOutputStream("/Users/voquangvinh/Desktop/Huong Dan/target file.txt");

            int length;
            byte[] buffet = new byte[19];

            while((length = inputStream.read(buffet)) > 0){
                outputStream.write(buffet, 0, length);
            }
            System.out.println("File is copied successful!");

            inputStream.close();
            outputStream.close();
        }catch (Exception e){
            System.err.println("File khong ton tai or noi dung co loi!");
        }
    }
}
