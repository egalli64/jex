/*
 * 3408. Design Task Manager - https://leetcode.com/problems/design-a-number-container-system/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.designTaskManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Each task has an owner and a pri
 * In case of same pri, higher id wins
 * After execution task is removed
 */
class TaskManager {
    private final TreeMap<Task, Integer> taskToUserId;
    private final Map<Integer, Integer> taskIdToPriority;

    public TaskManager(List<List<Integer>> tasks) {
        taskToUserId = new TreeMap<>((x, y) -> x.pri == y.pri ? y.id - x.id : y.pri - x.pri);
        taskIdToPriority = new HashMap<>();

        for (List<Integer> task : tasks) {
            int userId = task.get(0);
            int taskId = task.get(1);
            int taskPriority = task.get(2);

            taskToUserId.put(new Task(taskId, taskPriority), userId);
            taskIdToPriority.put(taskId, taskPriority);
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskToUserId.put(new Task(taskId, priority), userId);
        taskIdToPriority.put(taskId, priority);
    }

    public void edit(int taskId, int newPriority) {
        Task task = new Task(taskId, taskIdToPriority.get(taskId));
        int userId = taskToUserId.remove(task);

        taskToUserId.put(new Task(taskId, newPriority), userId);
        taskIdToPriority.put(taskId, newPriority);
    }

    public void rmv(int taskId) {
        if (!taskIdToPriority.containsKey(taskId)) {
            return;
        }

        int priority = taskIdToPriority.get(taskId);

        taskToUserId.remove(new Task(taskId, priority));
        taskIdToPriority.remove(taskId);
    }

    public int execTop() {
        if (taskToUserId.isEmpty()) {
            return -1;
        }

        Task task = taskToUserId.firstKey();
        int userId = taskToUserId.get(task);

        taskToUserId.remove(task);
        taskIdToPriority.remove(task.id);

        return userId;
    }

    private record Task(int id, int pri) {
    }
}

class SmokeTest {
    /*
     * The TaskManager object will be instantiated and called as such:
     */
    static void main() {
        TaskManager obj = new TaskManager(
                List.of(List.of(1, 101, 10), List.of(2, 102, 20), List.of(3, 103, 15)));
        obj.add(4, 104, 5);
        obj.edit(102, 8);
        if (obj.execTop() != 3) {
            System.err.println("Trouble (3)!");
        }

        obj.rmv(101);
        obj.add(5, 105, 15);
        if (obj.execTop() != 5) {
            System.err.println("Trouble (5)!");
        }

        System.out.println("Done");
    }
}
