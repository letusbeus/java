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
        for (; k < arr.length; k++)
            sortedArray[k] = key;
        return Arrays.toString(sortedArray);
    }
}
