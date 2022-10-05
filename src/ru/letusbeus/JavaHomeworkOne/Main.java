package ru.letusbeus.JavaHomeworkOne;

public class Main {
    public static void main(String[] args) {
        System.out.println(TaskOne.salutation());
        System.out.println(TaskTwo.maxLen());
        System.out.println(TaskThree.sortArrayByKey(new int[]{1,2,3,2,3,3,1,1,2,3,2,3,3,3}, "3"));
        System.out.println(TaskThreeV2.sortArrayByKey(new int[]{1,2,3,2,3,3,1,1,2,3,2,3,3,3}, 3));
        System.out.println(TaskFour.triangleNumCalculate());
    }
}