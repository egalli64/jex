/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

/**
 * userCompare - https://codingbat.com/prob/p143482
 * <p>
 * Given two user names and IDs, compare them, following the
 * Comparable::compareTo conventions.
 */
public class UserCompare {
    /**
     * Compare the names first, then, if they are equal, compare the id.
     *
     * @param aName first name
     * @param aId   first id
     * @param bName second name
     * @param bId   second id
     * @return -1, 0, 1, comparing name and id
     */
    public static int solution(String aName, int aId, String bName, int bId) {
        int name = aName.compareTo(bName);
        if (name != 0) {
            return name < 0 ? -1 : 1;
        } else if (aId != bId) {
            return aId < bId ? -1 : 1;
        } else {
            return 0;
        }
    }
}
