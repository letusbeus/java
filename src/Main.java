import ru.letusbeus.JavaHomeworkOne.TaskOne;
import ru.letusbeus.JavaHomeworkOne.TaskThree;
import ru.letusbeus.JavaHomeworkOne.TaskTwo;
import ru.letusbeus.JavaHomeworkOne.TaskFour;

public class Main {
    public static void main(String[] args) {
        System.out.println(TaskOne.salutation());
        System.out.println(TaskTwo.maxLen());
        System.out.println(TaskThree.sortArrayByKey(new int[]{1,2,3,2,3,3,1,1,3}, "3"));
        System.out.println(TaskFour.triangleNumCalculate());
    }
}