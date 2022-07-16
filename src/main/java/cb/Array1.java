/**
 * https://codingbat.com/java/Array-1
 */
package cb;

public class Array1 {
    /**
     * codingbat.com/prob/p185685
     *
     * @param nums a non-empty array of int
     * @return true if first or last element is 6
     */
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    /**
     * codingbat.com/prob/p191991
     *
     * @param a first non-empty array of int
     * @param b second non-empty array of int
     * @return true the two arrays have same first or last element
     */
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    /**
     * codingbat.com/prob/p112409
     *
     * @param nums an array of int sized 3
     * @return a reversed copy of the input array
     */
    public static int[] reverse3(int[] nums) {
        return new int[] { nums[2], nums[1], nums[0] };
    }

    /**
     * codingbat.com/prob/p146449
     *
     * @param a an array sized 3
     * @param b an array sized 3
     * @return an array containing the central values from the input arrays
     */
    public static int[] middleWay(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }

    /**
     * codingbat.com/prob/p175689
     *
     * @param nums an array sized 2
     * @return true if no 2, 3 in it
     */
    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    /**
     * codingbat.com/prob/p120347
     *
     * @param nums an array sized 3
     * @return the changed array, if there is 2, 3 -> 2, 0
     */
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;
    }

    /**
     * codingbat.com/prob/p199519
     * 
     * @param nums an array of ints of even length, at least 2
     * @return a new array containing only the middle two elements
     */
    public static int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle] };
    }

    /**
     * codingbat.com/prob/p155713
     * 
     * @param nums an array of ints of odd length, at least 3
     * @return a new array containing only the middle three elements
     */
    public static int[] midThree(int[] nums) {
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
    }

    /**
     * codingbat.com/prob/p197308
     * 
     * @param nums an array
     * @return true if 1 followed by 3 in the first / last two position
     */
    public static boolean unlucky1(int[] nums) {
        if (nums.length > 1 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }

        final int last = nums.length - 1;
        if (nums.length > 2 && (nums[1] == 1 && nums[2] == 3 || nums[last - 1] == 1 && nums[last] == 3)) {
            return true;
        }

        return false;
    }
}