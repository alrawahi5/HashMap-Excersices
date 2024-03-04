import java.util.HashMap;

public class CheckKeyExistence {

    public static void main(String[] args) {
        HashMap<Integer, String> nameAndAge = new HashMap();
        nameAndAge.put(771, "Abdullah");


        System.out.println(nameAndAge.containsKey(771));
    }
}
