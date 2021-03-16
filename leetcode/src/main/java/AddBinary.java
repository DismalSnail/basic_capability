/**
 * @author bitye
 */
public class AddBinary {
    /**
     * NAME: Add Binary
     * Description:
     * Given two binary strings,return their sum (also a binary string).
     * The input strings are both non-empty and contains only characters 1 or 0.
     * <p>
     * Example 1:
     * Input: a = "11", b = "1"
     * Output: "100"
     * <p>
     * Example 2:
     * Input: a = "1010",b = "1011"
     * Output: "10101"
     */

    public static String addBinary(String a, String b) {
        Boolean carry = false;

        StringBuilder sumStr = new StringBuilder();
        int i = 0, j = 0;

        for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (carry) {
                if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                    carry = true;
                    sumStr.insert(0, '1');
                } else if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                    carry = false;
                    sumStr.insert(0, '1');
                } else {
                    carry = true;
                    sumStr.insert(0, '0');
                }
            } else {
                if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                    carry = true;
                    sumStr.insert(0, '0');
                } else if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                    carry = false;
                    sumStr.insert(0, '0');
                } else {
                    carry = false;
                    sumStr.insert(0, '1');
                }
            }

        }

        if (i == -1 && j == -1) {
            if (carry) {
                sumStr.insert(0, 1);
                return sumStr.toString();
            } else {
                return sumStr.toString();
            }
        }

        if (i < 0 && j < 0) {
            return sumStr.toString();
        } else {
            if (i < 0) {
                for (; j >= 0; j--) {
                    if (carry) {
                        if (b.charAt(j) == '1') {
                            carry = true;
                            sumStr.insert(0, 0);
                        } else {
                            carry = false;
                            sumStr.insert(0, 1);
                        }
                    } else {
                        if (b.charAt(j) == '1') {
                            carry = false;
                            sumStr.insert(0, 1);
                        } else {
                            carry = false;
                            sumStr.insert(0, 0);
                        }
                    }
                }
                if (carry) {
                    sumStr.insert(0, 1);
                    carry = false;
                }
                return sumStr.toString();
            } else {
                for (; i >= 0; i--) {
                    if (carry) {
                        if (a.charAt(i) == '1') {
                            carry = true;
                            sumStr.insert(0, 0);
                        } else {
                            carry = false;
                            sumStr.insert(0, 1);
                        }
                    } else {
                        if (a.charAt(i) == '1') {
                            carry = false;
                            sumStr.insert(0, 1);
                        } else {
                            carry = false;
                            sumStr.insert(0, 0);
                        }
                    }
                }
                if (carry) {
                    sumStr.insert(0, 1);
                    carry = false;
                }
                return sumStr.toString();
            }
        }
    }

    public static String addBinary1(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            sum = carry;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            carry = sum / 2;
        }
        ans.append(carry == 1 ? 1 : "");
        return ans.reverse().toString();
    }


}

