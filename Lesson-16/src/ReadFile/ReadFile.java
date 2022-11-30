package ReadFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {
        BufferedReader br = null;

        try{
            String line;
            br = new BufferedReader(new FileReader("countries.cvs"));

            while ((line = br.readLine()) != null){
                printCountry(parseCsvLine(line));
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }

    private static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++ ){
                result.add(splitData[i]);
            }
        }
        return result;
    }
}
