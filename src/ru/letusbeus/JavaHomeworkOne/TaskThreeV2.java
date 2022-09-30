package ru.letusbeus.JavaHomeworkOne;

import java.util.Arrays;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному,
 * нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все)
 * элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class TaskThreeV2 {
    public static String sortArrayByKey(int[] arr, int key) {
        int[] sortedArray = new int[arr.length];
        int k = 0;
        for (int j : arr) {
            if (j != key) {
                sortedArray[k] = j;
                k++;
            }
        }
        for (int i = k; i < arr.length; i++) {
            sortedArray[i] = key;
        }
        return "Task 3V2\nGiven array: " + Arrays.toString(arr) +
                "\nFormatted array: " + Arrays.toString(sortedArray);
    }
}
