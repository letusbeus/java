package ru.letusbeus.JavaHomeworkFive;

import java.util.*;

/**
 * 2. Пусть дан список сотрудников:
 * Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
 * Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
 * Иван Мечников, Петр Петин, Иван Ежов.
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности. Для сортировки можно использовать TreeMap, мы не успели,
 * но я расписал пример использования и прикрепил к материалам урока в файле TestTreeMap.
 */

public class TaskTwo {
    static TreeMap<Integer, HashSet<String>> sortedEmployees = new TreeMap<>();
    public static TreeMap<Integer, HashSet<String>> printHandledEmployees() {
        System.out.println("Task Two");
        return sortedEmployees;
    }
    public static void handlingEmployeesList(String[] givenEmployeesList) {
        HashMap<String, HashSet<String>> employees = new HashMap<>();
        for (String employee : givenEmployeesList){
            String[] fullName = employee.split(" ");
            String name = fullName[0];
            if (employees.containsKey(name)) {
                employees.get(name).add(employee);
            } else {
                employees.put(name, new HashSet<>(Arrays.asList(employee)));
            }
        }
        for (Map.Entry<String, HashSet<String>> entry : employees.entrySet()) {
            if (sortedEmployees.containsKey(entry.getValue().size())) {
                sortedEmployees.get(entry.getValue().size()).add(entry.getKey());
            }else {
                sortedEmployees.put(entry.getValue().size(), new HashSet<>(Arrays.asList(entry.getKey())));
            }
        }
    }
}
