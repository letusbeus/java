package ru.letusbeus.JavaHomeworkFour;

import java.util.Formatter;
import java.util.LinkedList;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class TaskOne {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> givenLinkedList) {
        Object[] tempArr;
        tempArr = givenLinkedList.toArray();
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        for (int i = tempArr.length - 1; i >= 0; i--) {
            reversedLinkedList.add((Integer) tempArr[i]);
        }
        return reversedLinkedList;
    }

    public static Formatter reverseLinkedListV2(LinkedList<Integer> givenLinkedListV2) {
        Object[] tempArr = givenLinkedListV2.toArray();
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        for (int i = tempArr.length - 1; i >= 0; i--) {
            reversedLinkedList.add((Integer) tempArr[i]);
        }
        Formatter f = new Formatter();
        return f.format("""
                Task One V2
                Original linked list: %s
                Reversed linked list: %s""", givenLinkedListV2, reversedLinkedList);
    }
}
