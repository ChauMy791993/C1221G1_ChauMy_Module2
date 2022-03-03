package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        String sentence = "Hello every body My name is MY Every day";
        System.out.println(sentence);
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