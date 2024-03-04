import java.util.HashMap;

public class CompareEqualityOfHashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> nameAndAge = new HashMap();
        nameAndAge.put(771, "Abdullah");
        nameAndAge.put(772, "Mohammed");
        nameAndAge.put(773, "Noah");
        nameAndAge.put(774, "Yousuf");
        nameAndAge.put(775, "Anwar");

        HashMap<Integer, String> nameAndAgeF = new HashMap();
        nameAndAgeF.put(776, "Rahaf");
        nameAndAgeF.put(777, "Nawal");
        nameAndAgeF.put(778, "Areej");
        nameAndAgeF.put(779, "Zuhra");
        nameAndAgeF.put(7710, "Lamya");

        System.out.println(nameAndAge.equals(nameAndAgeF));

    }
}
