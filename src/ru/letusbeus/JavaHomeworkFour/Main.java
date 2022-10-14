package ru.letusbeus.JavaHomeworkFour;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // create new linked list:
        LinkedList<Integer> givenLinkedList = CreateLinkedList.createdLinkedList(10);
        LinkedList<Integer> givenLinkedListV2 = CreateLinkedList.createdLinkedListV2();
        // создаем пустой linked list:
        LinkedList<Integer> givenLinkedListV3 = new LinkedList<>();

        System.out.println("Task One\nOriginal linked list: " + givenLinkedList);
        System.out.println("Reversed linked list: " + TaskOne.reverseLinkedList(givenLinkedList));
        System.out.println(TaskOne.reverseLinkedListV2(givenLinkedListV2));
        System.out.println("\nTask three\nOriginal linked list: "
                + givenLinkedList +
                "\nSum of the elements: "
                + TaskThree.sumOfLinkedListElements(givenLinkedList));
        System.out.println(TaskThree.sumOfLinkedListElementsV2(givenLinkedListV2));
        System.out.println(TaskThree.sumOfLinkedListElementsV3(givenLinkedListV3));
    }
}
