/*
 * 1233. Remove Sub-Folders from the Filesystem - https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Keep only the folders that are not subfolders of other items passed in
 * <br>
 * Just correct folder names, starting with '/'; non-empty array; no duplicated items
 */
public class RemoveSubFoldersFromTheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();

        result.add(folder[0]);
        String cur = folder[0] + "/";

        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(cur)) {
                result.add(folder[i]);
                cur = folder[i] + "/";
            }
        }

        return result;
    }
}
