package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class TestTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text :");
        String text = scanner.nextLine();
        System.out.println(text);
        Map<String, Integer> stringList = new TreeMap<>();
        String[] words = text.toLowerCase().split(" ");
        for (String word : words) {
            if (!stringList.containsKey(word)) {
                stringList.put(word, 1);
            } else {
                stringList.replace(word, stringList.get(word) + 1);
            }
        }
        System.out.println("count of string:\n" + stringList);

    }
}
