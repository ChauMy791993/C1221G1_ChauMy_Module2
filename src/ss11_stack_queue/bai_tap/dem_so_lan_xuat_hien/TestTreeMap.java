package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        String sentence = "This is a test string this iS a test case thiS is";
        System.out.println(sentence);

        // TreeMap: sắp xếp các key theo thứ tự tự nhiên hoặc dùng Comparator.
        Map<String, Integer> dictionary = new TreeMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (!dictionary.containsKey(word)) {
                dictionary.put(word, 1);
            } else {
                dictionary.replace(word, dictionary.get(word) + 1);
            }
        }
        System.out.println("Đếm từ trong chuỗi:\n" + dictionary);

    }
}
