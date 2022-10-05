package ru.letusbeus.JavaHomeworkTwo;

/*
 * 3.* Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * (используйте методы split и replace)
 */

public class TaskThree {
    public static String selectString() {
        String sqlString = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        StringBuilder result = new StringBuilder();
        String[] givenStringToArr = sqlString.replace("{", "").replace("}", "").split(",");
        for (String i : givenStringToArr) {
            String[] subArr = i.replace("'", "").split(":");
            if (!subArr[1].equals("null")) {
                result.append(subArr[0]).append(" = ").append(subArr[1]).append(" AND");
            }
        }
        String res = result + ";";
        return "\nTask 3\nSELECT * FROM students WHERE " + res.replace(" AND;", ";");
    }
}
