package ru.letusbeus.JavaHomeworkFive;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

public class TaskOne {
    static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
    public static HashMap<String, HashSet<String>> printPhonebook() {
        return phoneBook;
    }
    public static void addContact(String givenContact) {
        String[] contactArr = givenContact.split(" ");
        if (phoneBook.containsKey(contactArr[0])) {
            phoneBook.get(contactArr[0]).add(contactArr[1]);
        } else {
            phoneBook.put(contactArr[0], new HashSet<>(Arrays.asList(contactArr[1])));
        }

    }

    public static void delContact(String givenContact) {
        String[] contactArr = givenContact.split(" ");
        String contactName = contactArr[0];
        String contactPhone = contactArr[1];
        if (phoneBook.containsKey(contactName)) {
            if (phoneBook.get(contactName).size() > 1 && phoneBook.get(contactName).contains(contactPhone)) {
                phoneBook.get(contactName).remove(contactPhone);
                System.out.printf("Number %s of contact %s has been successfully deleted.\n", contactPhone, contactName);
            } else if (phoneBook.get(contactName).size() == 1) {
                phoneBook.remove(contactName);
                System.out.printf("The contact %s, %s has been successfully removed.\n", contactName, contactPhone);
            }
        }else {
            System.out.printf("Contact %s, %s not found.\n", contactName, contactPhone);
        }
    }
}
