import java.util.HashMap;

public class CheckIfEmpty {
    public static void main(String[] args) {
        HashMap<Integer, String> nameAndAge = new HashMap();
        nameAndAge.put(771, "Abdullah");
        nameAndAge.put(772, "Mohammed");
        nameAndAge.put(773, "Noah");
        nameAndAge.put(774, "Yousuf");
        nameAndAge.put(775, "Anwar");

        System.out.println(nameAndAge.isEmpty());
    }
}
