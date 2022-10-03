package ru.letusbeus.JavaHomeworkOne;

import java.lang.*;
import java.util.Arrays;

/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное количество подряд идущих 1
 */
public class TaskTwo {
    public static String maxLen() {
        int[] givenArray = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
        int keyNum = 1;
        int maxSequenceLen = 0;
        for (int i = 0, currentSequenceLen = 0; i < givenArray.length; ++i) {
            if (givenArray[i] == keyNum) {
                currentSequenceLen++;
            }
            if (i == givenArray.length - 1 || givenArray[i] != keyNum) {
                if (currentSequenceLen >= maxSequenceLen) {
                    maxSequenceLen = currentSequenceLen;
                    currentSequenceLen = 0;
                }
            }
        }
        return "Task 2\nMaximum sequence length of " + keyNum + " in given array " +
                Arrays.toString(givenArray) + " is " + maxSequenceLen + ".\n";
    }
}
