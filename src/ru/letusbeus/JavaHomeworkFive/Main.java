package ru.letusbeus.JavaHomeworkFive;

public class Main {
    public static void main(String[] args) {
        TaskOne.addContact("Ann 1111");
        TaskOne.addContact("Bruce 2222");
        TaskOne.addContact("Dave 3333");
        TaskOne.addContact("Elizabet 4444");
        TaskOne.addContact("Fiona 5555");
        TaskOne.addContact("Francis 6666");
        TaskOne.addContact("Elizabet 7777");
        TaskOne.addContact("Elizabet 7778");
        TaskOne.addContact("Elizabet 7779");
        TaskOne.addContact("Dave 8888");
        TaskOne.addContact("Dave 9999");
        System.out.println("Task One");
        System.out.println(TaskOne.printPhonebook());
        //а еще можем удалять с проверкой как контакт целиком, так и конкретный номер
        TaskOne.delContact("Elizabet 7778");
        TaskOne.delContact("Ann 1111");
        TaskOne.delContact("Ann 0000");
        System.out.println(TaskOne.printPhonebook());
        TaskTwo.handlingEmployeesList(new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"});
        System.out.println(TaskTwo.printHandledEmployees());
    }
}
