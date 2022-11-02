package ru.letusbeus.JavaHomeworkSix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class TaskOne {
    static ArrayList<Laptop> laptops = new ArrayList<>();
    static ArrayList<Laptop> selectedLaptops = new ArrayList<>();

    public static void printLaptopList(ArrayList<Laptop> givenList) {
        if (givenList.size() != 0) {
            for (Laptop laptop : givenList) {
                System.out.println(laptop);
            }
        } else {
            System.out.println("No match found.");
        }
    }

    public static void createLaptopList() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity of laptops: ");
        int laptopsQuantity = scan.nextInt();
        for (int i = 0; i < laptopsQuantity; i++) {
            laptops.add(new Laptop());
        }
    }

    public static void userSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required parameter of a laptop " +
                "(manufacturer, type, display size, OS, RAM, graphics, HDD):");
        String userInput = scanner.nextLine();
        for (Laptop laptop : laptops) {
            if (laptop.getManufacturer().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getLaptopType().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getDisplaySize().equals(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getOperatingSystem().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getRAM().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getGraphicsController().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            } else if (laptop.getHdd().equalsIgnoreCase(userInput)) {
                selectedLaptops.add(laptop);
            }
        }
    }
}