package ru.letusbeus.JavaHomeworkSix;

public class Main {
    public static void main(String[] args) {
        TaskOne.createLaptopList();
        TaskOne.printLaptopList(TaskOne.laptops);
        TaskOne.userSearch();
        TaskOne.printLaptopList(TaskOne.selectedLaptops);
    }
}