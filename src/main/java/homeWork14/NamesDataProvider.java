package homeWork14;

import java.util.List;
import java.util.Random;

public class NamesDataProvider {
    private static List<TeacherNames> namesList;

    static {
        namesList.add(new TeacherNames("Артем"));
        namesList.add(new TeacherNames("Ольга"));
        namesList.add(new TeacherNames("Денис"));
    }
    public static TeacherNames getRandomName(){
        return namesList.get(new Random().nextInt(namesList.size()-1));
    }
}
