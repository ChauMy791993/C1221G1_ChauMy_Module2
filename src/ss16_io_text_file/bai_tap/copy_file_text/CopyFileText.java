package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    static final String SOURCE_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/source.txt";
    static final String TARGET_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/target.txt";

    public static List<String> readFile(String pathFile) {
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
        System.out.println(stringList);
        return stringList;

    }

    public static void writeFile(List<String> stringList, String pathFile, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        File file = new File(pathFile);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> sourceFile=readFile(SOURCE_FILE);
        writeFile(sourceFile,TARGET_FILE,true);
        readFile(TARGET_FILE);

    }

}
