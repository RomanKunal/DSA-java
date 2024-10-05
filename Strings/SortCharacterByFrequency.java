package Strings;

import java.util.HashMap;
import java.util.*;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String str="tree";
        System.out.println(sortfre(str));
    }
    static String sortfre(String str){
        // count the frequency of word
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // set the answer in the priority queue

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(hm.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}
