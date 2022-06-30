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
        return new int[]{nums[2], nums[1], nums[0]};
    }
}
