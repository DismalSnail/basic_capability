import org.junit.Test;

/**
 * @author bitye
 */
public class ProblemsTest {

    @Test
    public void twoSumTest() {
        int[] list = {-3, 4, 3, 90};
        int[] solution = TwoSum.twoSum(list, 0);
        System.out.println(solution[0]);
        System.out.println(solution[1]);
    }


    @Test
    public void reverseTest() {
        int rev = Reverse.reverse(1534236469);
        System.out.println(rev);
    }


    @Test
    public void isPalindromeTest() {
        boolean flag = IsPalindrome.isPalindrome(0);
        System.out.println(flag);
    }

    @Test
    public void romanToIntTest() {
        String romanNumber = "MCMXCVI";
        int number = RomanToInt.romanToIntUseMap(romanNumber);
        System.out.println(number);
    }

    @Test
    public void longestCommonPrefixTest() {
        String[] strs = {"abcas", "abc"};
        String prefix = LongestCommonPrefix.longestCommonPrefixTest2(strs);
        System.out.println(prefix);
    }

    @Test
    public void isVaildTest() {
        String s = "(";
        boolean isV = IsValid.isValid(s);
        System.out.println(isV);
    }

    @Test
    public void mergeTwoListsTest() {
        ListNode s1 = new ListNode(1);
        s1.next = new ListNode(2);
        s1.next.next = new ListNode(4);

        ListNode s2 = new ListNode(1);
        s2.next = new ListNode(3);
        s2.next.next = new ListNode(4);

        ListNode s3 = MergeTwoLists.mergeTwoLists(s1, s2);

        while (s3 != null) {
            System.out.println(s3.val);
            s3 = s3.next;
        }
    }

    @Test
    public void removeDuplicatesTest() {
        int[] nums = {1, 1, 2, 3};
        int newLength = RemoveDuplicates.removeDuplicates(nums);
        System.out.println(newLength);
    }

    @Test
    public void removeElementTest() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(RemoveElement.removeElement(nums, 2));
    }

    @Test
    public void strStrTest() {
        String haystack = "mississippi";
        String needle = "issipi";
        int place = StrStr.strStr(haystack, needle);
        System.out.println(place);
    }

    @Test
    public void searchInsertTest() {
        int[] nums = {1, 3, 5, 6};
        int target = SearchInsert.searchInsert(nums, 2);
        System.out.println(target);
    }

    @Test
    public void countAndSayTest() {
        String str = CountAndSay.countAndSay(6);
        System.out.println(str);
    }

    @Test
    public void maximumSubarray() {
        int[] nums = {-2};
        int max = MaximumSubarray.maximumSubarray2(nums);
        System.out.println(max);
    }

    @Test
    public void lengthOfLastWordTest() {
        String str = "Hello World                ";
        int length = LengthOfLastWord.lengthOfLastWord(str);
        System.out.println(length);
    }

    @Test
    public void plusOneTest() {
        int[] nums = {9, 9, 9};
        int[] plusOne = PlusOne.plusOne(nums);
        for (int num : plusOne) {
            System.out.println(num);
        }
    }

    @Test
    public void addBinaryTest() {
        String a = "11";
        String b = "1";
        String out = AddBinary.addBinary1(a, b);
        System.out.println(out);
    }

    @Test
    public void mySqrtTest() {
        System.out.println(SqrtX.mySqrt(8));
    }

}
