public class StrStr {
    /**
     * NAME: Implement strStr()
     * Description:
     * Implement strStr().
     * Return the index of the first occurrence of needle in haystack,or -1 if needle is not part
     * of haystack.
     * <p>
     * Example 1:
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     * <p>
     * Example 2:
     * Input:haystack = "aaaaa",needle = "bba"
     * Output:-1
     * <p>
     * Clarification:
     * What should we return when needle is an empty string?This is a
     * great question to ask during an interview.
     * <p>
     * For the purpose of this problem,we will return 0 when needle is an empty
     * string.This is consistent to C's strstr() and Java's indexOf().
     */

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }

        int place = -1;
        int j = 0;

        notMatch:
        for (int i = 0; i < haystack.length(); ) { // i < haystack - needle.length()
            j = 0;
            if (haystack.charAt(i) != needle.charAt(j)) {
                i++;
            } else {
                for (j++; j < needle.length(); j++) {
                    if (i + j >= haystack.length()) {
                        return -1;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        i++;
                        continue notMatch;
                    }
                }
                return i;
            }
        }
        return place;
    }
}
