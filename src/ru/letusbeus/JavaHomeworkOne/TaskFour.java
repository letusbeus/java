package ru.letusbeus.JavaHomeworkOne;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольное число
 */
public class TaskFour {
    public static String triangleNumCalculate() {
        Scanner userNum = new Scanner(System.in);
        System.out.println("Task 4\nEnter the triangleNum: ");
        int triangleNum = userNum.nextInt();
        int result = 0;
        for (int i = 0; i < triangleNum + 1; i++) {
            result += i;
        }
        return "Triangle num for " + triangleNum + " is " + result + ".\n";
    }
}
