package ru.letusbeus.JavaHomeworkFour;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */

public class TaskThree {

    public static int sumOfLinkedListElements(LinkedList<Integer> linkedList) {
        int result = 0;
        ListIterator<Integer> iteratorInt = linkedList.listIterator();
        while (iteratorInt.hasNext()) {
            result += iteratorInt.next();
        }
        return result;
    }

    public static String sumOfLinkedListElementsV2(LinkedList<Integer> givenLinkedListV2) {
        int result = 0;
        ListIterator<Integer> iteratorInt = givenLinkedListV2.listIterator();
        do {
            result += iteratorInt.next();
        } while (iteratorInt.hasNext());
        return "Task three V2\nOriginal linked list: " + givenLinkedListV2 + "\nSum of the elements: " + result;
    }

    public static String sumOfLinkedListElementsV3(LinkedList<Integer> givenLinkedListV3) {
        int result = 0;
        ListIterator<Integer> iteratorInt = givenLinkedListV3.listIterator();
        if (iteratorInt.hasNext()) {
            do {
                result += iteratorInt.next();
            } while (iteratorInt.hasNext());
        } else {
            return "Task three V3\nOriginal linked list is empty!";
        }
        return "Task three V3\nOriginal linked list: " + givenLinkedListV3 + "\nSum of the elements: " + result;
    }
}
