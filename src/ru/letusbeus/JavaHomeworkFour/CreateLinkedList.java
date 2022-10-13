package ru.letusbeus.JavaHomeworkFour;

import java.util.LinkedList;

public class CreateLinkedList {
    public static LinkedList<Integer> createdLinkedList(int myRange) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        for (int i = 1; i <= myRange; i++){
            newLinkedList.add(i);
        }
        return newLinkedList;
    }

    public static LinkedList<Integer> createdLinkedListV2() {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        newLinkedList.add(11);
        newLinkedList.add(22);
        newLinkedList.add(33);
        newLinkedList.add(44);
        newLinkedList.add(55);
        newLinkedList.add(66);
        return newLinkedList;
    }
}
