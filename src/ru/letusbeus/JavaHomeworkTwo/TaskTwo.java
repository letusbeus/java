package ru.letusbeus.JavaHomeworkTwo;

import java.io.File;

/*
 * Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
 * 1 Расширение файла: txt
 * 2 Расширение файла: pdf
 * 3 Расширение файла:
 * 4 Расширение файла: jpg
 */

public class TaskTwo {
    public static void printExtensions(String[] files) {
        System.out.println("\nTask 2");
        for (int i = 0; i < files.length; i++) {
            File file = new File(files[i]);
            System.out.println((i + 1) + ". Расширение файла: " + getExtension(file));
        }
    }

    private static String getExtension(File file) {
        String fileName = file.getName();
        File filePath = new File(file.getAbsolutePath());
        if (filePath.isFile()){
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
        else {
            return "";
        }
    }
}
