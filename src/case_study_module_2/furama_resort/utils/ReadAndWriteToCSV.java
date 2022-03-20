package case_study_module_2.furama_resort.utils;

import case_study_module_2.furama_resort.enums.CustomerType;
import case_study_module_2.furama_resort.enums.EmployeeOfDegree;
import case_study_module_2.furama_resort.enums.EmployeeOfPosition;
import case_study_module_2.furama_resort.models.ToCSV;
import case_study_module_2.furama_resort.models.facility.House;
import case_study_module_2.furama_resort.models.facility.Room;
import case_study_module_2.furama_resort.models.facility.Villa;
import case_study_module_2.furama_resort.models.person.Customer;
import case_study_module_2.furama_resort.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {

    public static <T> void writeListToCSV(String pathFile, List<T> stringList) {
        File file = new File(pathFile);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T string : stringList) {
                bufferedWriter.write(((ToCSV) string).getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Villa> readVillaListFromCSV(String pathFile) {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<House> readHouseListFromCSV(String pathFile) {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
            houseList.add(house);
        }
        return houseList;
    }

    public static List<Room> readRoomListFromCSV(String pathFile) {
        List<Room> roomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public static List<Employee> readEmployeeListFromCSV(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Employee employee = new Employee(arr[0], arr[1], arr[2], Long.parseLong(arr[3]), arr[4], arr[5],
                    arr[6], EmployeeOfDegree.valueOf(arr[7]),
                    EmployeeOfPosition.valueOf(arr[8]), Long.parseLong(arr[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Customer> readCustomerListFromCSV(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(pathFile);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], Long.parseLong(arr[3]), arr[4], arr[5],
                    arr[6], CustomerType.valueOf(arr[7]), arr[8]);
            customerList.add(customer);
        }
        return customerList;

    }
}


