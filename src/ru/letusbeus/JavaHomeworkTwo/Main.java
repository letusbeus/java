package ru.letusbeus.JavaHomeworkTwo;

import static ru.letusbeus.JavaHomeworkTwo.TaskOne.getArrayOfStrings;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = getArrayOfStrings();
        System.out.println(TaskOne.printArrayOfStrings(arrayOfStrings));
        TaskOne.writeArrayToFile(arrayOfStrings);
        TaskTwo.printExtensions(arrayOfStrings);
        System.out.println(TaskThree.selectString());
    }
}