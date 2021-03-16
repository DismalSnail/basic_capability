import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    /**
     * NAME: Roman to Integer
     * Description:
     * Roman numerals are represented seven different symbols:I,V,X,L,C,D
     * and M.
     * Symbol       Value
     * I            1
     * V            5
     * X            10
     * L            50
     * C            100
     * D            500
     * M            1000
     * <p>
     * For example, two is written as II in Roman numeral, just two one's added
     * together.Twelve is written as, XII,which is simply X + II.The number twenty
     * seven is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number for is written as IV.Because the
     * one is before the five we subtract it making four. The same principle applies to the number
     * nine,which is written as IX.There are six instances where subtraction is used:
     * 1. I can be placed before V (5) and X (10) to make 4 and 9.
     * 2. X can be placed before L (50) and C (100) to make 40 and 90.
     * 3. C can be placed before D (500) and M (1000) to make 400 and 9000.
     * <p>
     * Given a roman numeral, convert it to an integer.Input is guaranteed to be
     * within the range from 1 to 3999
     * <p>
     * Example 1:
     * Input: "III:
     * Output: 3
     * <p>
     * Example 2:
     * Input: "IV"
     * Output: 4
     * <p>
     * Example 3:
     * Input: "IX"
     * Output: 9
     * <p>
     * Example 4:
     * Input: "LVIII"
     * Output: 58
     * Explanation: L = 50, V = 5, III = 3.
     * <p>
     * Example 5:
     * Input:"MCMZCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    public static int romanToInt(String s) {
        final char I = 'I';
        final char V = 'V';
        final char X = 'X';
        final char L = 'L';
        final char C = 'C';
        final char D = 'D';
        final char M = 'M';

        int sum = 0;
        int length = s.length();
        for (int i = 0; i < length; ) {
            if (i == length - 1 || s.charAt(i) == V || s.charAt(i) == L || s.charAt(i) == D || s.charAt(i) == M) {
                switch (s.charAt(i)) {
                    case I:
                        sum += 1;
                        i++;
                        break;
                    case V:
                        sum += 5;
                        i++;
                        break;
                    case X:
                        sum += 10;
                        i++;
                        break;
                    case L:
                        sum += 50;
                        i++;
                        break;
                    case C:
                        sum += 100;
                        i++;
                        break;
                    case D:
                        sum += 500;
                        i++;
                        break;
                    case M:
                        sum += 1000;
                        i++;
                        break;
                    default:
                        System.out.println("error");
                }

                if (i == length) {
                    break;
                }
                if (i == length - 1) {
                    continue;
                }
            }
            if (s.charAt(i) == I) {
                switch (s.charAt(i + 1)) {
                    case V:
                        sum += 4;
                        i += 2;
                        break;
                    case X:
                        sum += 9;
                        i += 2;
                        break;
                    default:
                        sum += 1;
                        i++;
                }
                if (i == length) {
                    break;
                }
                if (i == length - 1) {
                    continue;
                }
            }

            if (s.charAt(i) == X) {
                switch (s.charAt(i + 1)) {
                    case L:
                        sum += 40;
                        i += 2;
                        break;
                    case C:
                        sum += 90;
                        i += 2;
                        break;
                    default:
                        sum += 10;
                        i++;
                }
                if (i == length) {
                    break;
                }
                if (i == length - 1) {
                    continue;
                }
            }
            if (s.charAt(i) == C) {
                switch (s.charAt(i + 1)) {
                    case D:
                        sum += 400;
                        i += 2;
                        break;
                    case M:
                        sum += 900;
                        i += 2;
                        break;
                    default:
                        sum += 100;
                        i++;
                }
                if (i == length) {
                    break;
                }
                if (i == length - 1) {
                    continue;
                }
            }
        }

        return sum;
    }

    public static int romanToIntUseMap(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                sum += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += map.get(s.substring(i, i + 1));
                i += 1;
            }
        }
        return sum;
    }
}
