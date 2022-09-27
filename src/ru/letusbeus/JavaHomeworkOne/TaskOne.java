package ru.letusbeus.JavaHomeworkOne;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59;
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
public class TaskOne {
    public static String salutation() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Task 1\nEnter your name: ");
        String userName = userInput.nextLine();
        LocalDateTime currentTime = LocalDateTime.now();
        var h = currentTime.getHour();
        if (h >= 5 && h < 12) {
            return "Good morning, " + userName + "!\n";
        } else if (h >= 12 && h < 18) {
            return "Good day, " + userName + "!\n";
        } else if (h >= 18 && h < 23) {
            return "Good evening, " + userName + "!\n";
        } else {
            return "Good night, " + userName + "!\n";
        }
    }
}
