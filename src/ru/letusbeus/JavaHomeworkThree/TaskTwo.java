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

    public static String requiredNumsV2(ArrayList<Integer> nums) {
        int minNum = Collections.min(nums);
        int maxNum = Collections.max(nums);
        double average = sumOfNums(nums) / nums.size();
        return "\nTask Two\nGiven list: " + nums + "\nMin: " + minNum + "\nMax: " + maxNum + "\nAverage: " + average;
    }
    public static double sumOfNums(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) sum += num;
        return sum;
    }
    public static String requiredNumsV3(ArrayList<Integer> nums) {
        int minVal = Collections.min(nums);
        int maxVal = Collections.max(nums);
        int[] arrOfNums = new int[nums.size()];
        for (int i = 0; i < arrOfNums.length; i++){
            arrOfNums[i] = nums.get(i);
        }
        double averageVal = (double) Arrays.stream(arrOfNums).sum() / arrOfNums.length;
        return "\nTask Two\nGiven list: " + nums + "\nMin: " + minVal + "\nMax: " + maxVal + "\nAverage: " + averageVal;
    }
}
