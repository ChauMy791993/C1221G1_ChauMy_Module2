package police_Department_transport_of_chanh.utils;

import police_Department_transport_of_chanh.models.OTo;
import police_Department_transport_of_chanh.models.XeMay;
import police_Department_transport_of_chanh.models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    private static void writeListStringFromCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeListOToToCSV(String pathFile,List<OTo> oToList, boolean append){
        // chuyển đổi customerList => stringList;
        List<String> stringList = new ArrayList<>();
        for (OTo c: oToList) {
            stringList.add(c.getInfoToCSV());
        }
        // gọi phương thức dùng chung để ghi file
        writeListStringFromCSV(pathFile,stringList,append);
    }
    public static List<OTo> readOToListFromCSV(String pathFile){
        List<OTo> oToList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            OTo oTo = new OTo(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),arr[5]);
            oToList.add(oTo);
        }
        return oToList;
    }
    public static void writeListXeMayToCSV(String pathFile, List<XeMay> xeMayList, boolean append){
        // chuyển đổi customerList => stringList;
        List<String> stringList = new ArrayList<>();
        for (XeMay c: xeMayList) {
            stringList.add(c.getInfoToCSV());
        }
        // gọi phương thức dùng chung để ghi file
        writeListStringFromCSV(pathFile,stringList,append);
    }
    public static List<XeMay> readXeMayListFromCSV(String pathFile){
        List<XeMay> xeMayList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            XeMay xeMay = new XeMay(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],arr[4]);
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }
    public static void writeListXeTaiToCSV(String pathFile, List<XeTai> xeTaiList, boolean append){
        // chuyển đổi customerList => stringList;
        List<String> stringList = new ArrayList<>();
        for (XeTai c: xeTaiList) {
            stringList.add(c.getInfoToCSV());
        }
        // gọi phương thức dùng chung để ghi file
        writeListStringFromCSV(pathFile,stringList,append);
    }
    public static List<XeTai> readXeTaiListFromCSV(String pathFile){
        List<XeTai> xeTaiList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            XeTai xeTai = new XeTai(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }
}
