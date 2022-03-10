package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static String NATIONAL_FILE = "src/ss16_io_text_file/bai_tap/doc_file_csv/file.csv";

    public static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        File file = new File(pathFile);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<National> readNationalListFromCSV() {
        List<National> nationalList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(NATIONAL_FILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            National national = new National(Integer.parseInt(array[0]),array[1],array[2]);
            nationalList.add(national);
        }
        return nationalList;
    }

    public static void main(String[] args) {
        List<National> nationalList= readNationalListFromCSV();
        for (National s:nationalList){
            System.out.println(s);
        }
    }
}
