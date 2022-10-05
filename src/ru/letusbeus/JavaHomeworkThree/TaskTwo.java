package ru.letusbeus.JavaHomeworkThree;

/*
2. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())
 */

import java.util.*;

public class TaskTwo {
    public static String requiredNums(ArrayList<Integer> nums) {
        int minNum = Collections.min(nums);
        int maxNum = Collections.max(nums);
        double averageNum = nums.stream().mapToDouble(i -> i).sum() / nums.size();
        return "\nTask Two\nGiven list: " + nums + "\nMin: " + minNum + "\nMax: " + maxNum + "\nAverage: " + averageNum;
//        //Вывод без объявления переменных:
//        return "\nTask Two\nMin value: " + Collections.min(nums) +
//             "\nMax value: " + Collections.max(nums) +
//             "\nAverage value: " + nums.stream().mapToDouble(i -> i).sum() / nums.size();
    }
}
