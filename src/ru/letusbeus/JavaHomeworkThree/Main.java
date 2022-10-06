package ru.letusbeus.JavaHomeworkThree;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(TaskOne.oddNumsOnly(new ArrayList<>(Arrays.asList(8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43))));
        System.out.println(TaskTwo.requiredNums(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(TaskTwo.requiredNumsV2(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(TaskTwo.requiredNumsV3(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(TaskThree.sortedArray(new int[]{})); // проверка на пустом массиве
        System.out.println(TaskThree.sortedArray(new int[]{999})); // проверка на массиве с одним элементом
        System.out.println(TaskThree.sortedArray(new int[]{8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43}));
    }
}
