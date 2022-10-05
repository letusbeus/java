package ru.letusbeus.JavaHomeworkThree;

/*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.ArrayList;

public class TaskOne {
    public static String oddNumsOnly(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size();) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }else{
                i++;
            }
        }
        return "Task One\nFiltered list (odd nums only): " + nums;
    }
}
