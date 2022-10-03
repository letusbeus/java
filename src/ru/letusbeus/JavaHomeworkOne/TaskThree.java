package ru.letusbeus.JavaHomeworkOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному,
 * нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все)
 * элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class TaskThree {
    public static String sortArrayByKey(int [] arr, String key){
        List<String> intermediateList = new ArrayList<>();
        for (int j : arr) {
            intermediateList.add(String.valueOf(j));
        }
        for (int i = intermediateList.size() - 1; i >= 0; i--) {
            if(intermediateList.get(i).equals(key))  {
                intermediateList.add(key);
                intermediateList.remove(i);
            }
        }
        int[] formattedArray = new int[intermediateList.size()];
        for (int i = 0; i < intermediateList.size(); i++) {
            formattedArray[i] = Integer.parseInt(intermediateList.get(i));
        }
        return "Task 3\nGiven array: " + Arrays.toString(arr) +
                "\nFormatted array: " + Arrays.toString(formattedArray) + "\n";
    }
}
