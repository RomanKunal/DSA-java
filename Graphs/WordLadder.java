package Graphs;
import java.util.*;
class StringPair {
    String first;
    int second;
    StringPair(String first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class WordLadder {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<StringPair> q = new LinkedList<>();
            q.add(new StringPair(beginWord, 1));

            Set<String> s = new HashSet<>(wordList);
            if (!s.contains(endWord)) return 0;

            s.remove(beginWord);

            while (!q.isEmpty()) {
                String word = q.peek().first;
                int step = q.peek().second;
                q.poll();

                if (word.equals(endWord)) {
                    return step;
                }

                for (int i = 0; i < word.length(); i++) {
                    char[] arr = word.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        arr[i] = ch;
                        String newWord = new String(arr);

                        if (s.contains(newWord)) {
                            s.remove(newWord);
                            q.add(new StringPair(newWord, step + 1));
                        }
                    }
                }
            }

            return 0;
        }
    }
