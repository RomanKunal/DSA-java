package Graphs;
import java.util.*;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[i] is true if s[0..i-1] can be segmented into words from the dictionary
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // An empty string can always be segmented

        // Iterate through the string and check each substring
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // If s[0..j-1] is breakable and s[j..i-1] is a valid word in the dictionary
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further if we found a valid segmentation
                }
            }
        }

        // Return whether the entire string can be segmented
        return dp[s.length()];
    }
}
