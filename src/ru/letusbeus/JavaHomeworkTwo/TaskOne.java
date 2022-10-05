package ru.letusbeus.JavaHomeworkTwo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
 * оно должно записаться в лог-файл.
 */

public class TaskOne {
    public static String[] getArrayOfStrings() {
        String[] pathnames;
        String userPath = System.getProperty("user.dir");
        File f = new File(userPath);
        pathnames = f.list();
        return pathnames;
    }

    public static String printArrayOfStrings(String[] pathnames) {
        if (pathnames == null) return "Path not found";
        else {
            return "Task 1\n" + Arrays.toString(pathnames);
        }
    }

    public static void writeArrayToFile(String[] pathnames) {
        File file = new File("TaskOne.txt");
        Logger log = Logger.getLogger(TaskOne.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        assert fh != null;
        fh.setLevel(Level.INFO);
        fh.setFormatter(simpleFormatter);
        log.addHandler(fh);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter("TaskOne.txt", false);
            for (String pathname : pathnames) {
                fileWriter.write(pathname);
                fileWriter.append('\n');
            }
            fileWriter.flush();
            System.out.println("Список файлов каталога сохранен в файл " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            log.warning(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}