package ru.letusbeus.JavaHomeworkThree;

/*
3. *Реализовать алгоритм сортировки слиянием
 */

import java.util.Arrays;

public class TaskThree {
    public static String sortedArray(int[] givenArray) {
        return switch (givenArray.length) {
            case 0 -> "\nTask Three\nGiven array: " + Arrays.toString(givenArray) + "\nNo values to sort";
            case 1 -> "\nTask Three\nGiven array: " + Arrays.toString(givenArray) +
                    "\nSorted array: " + Arrays.toString(givenArray);
            default -> "\nTask Three\nGiven array: " + Arrays.toString(givenArray) +
                    "\nSorted array: " + Arrays.toString(mergeSort(givenArray));
        };
    }

    public static int[] mergeSort(int[] unsortedArray) {
        int[] arrForSorting = Arrays.copyOf(unsortedArray, unsortedArray.length);
        int[] bufferArray = new int[unsortedArray.length];
        return mergeSortInner(arrForSorting, bufferArray, 0, unsortedArray.length);
    }

    public static int[] mergeSortInner(int[] arrForSorting, int[] bufferArray,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return arrForSorting;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        int[] sortedLeftHalf = mergeSortInner(arrForSorting, bufferArray, startIndex, middleIndex);
        int[] sortedRightHalf = mergeSortInner(arrForSorting, bufferArray, middleIndex, endIndex);

        int startMergingIndex = startIndex;
        int endMergingIndex = middleIndex;
        int destIndex = startIndex;
        int[] result = sortedLeftHalf == arrForSorting ? bufferArray : arrForSorting;
        while (startMergingIndex < middleIndex && endMergingIndex < endIndex) {
            result[destIndex++] = sortedLeftHalf[startMergingIndex] < sortedRightHalf[endMergingIndex]
                    ? sortedLeftHalf[startMergingIndex++] : sortedRightHalf[endMergingIndex++];
        }
        while (startMergingIndex < middleIndex) {
            result[destIndex++] = sortedLeftHalf[startMergingIndex++];
        }
        while (endMergingIndex < endIndex) {
            result[destIndex++] = sortedRightHalf[endMergingIndex++];
        }
        return result;
    }
}
