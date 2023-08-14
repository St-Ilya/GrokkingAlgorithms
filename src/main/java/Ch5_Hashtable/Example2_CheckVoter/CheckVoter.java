package Ch5_Hashtable.Example2_CheckVoter;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    public static void main(String[] args) {
        Map<String, Boolean> voted = new HashMap<>();
        voted.put("Vasya", true);
        voted.put("Maggy", true);
        checkVoted("Add", voted);
        checkVoted("Maggy", voted);
    }

    public static void checkVoted(String name, Map<String, Boolean> voted) {
        if (voted.containsKey(name)) {
            System.out.println("kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("let them voice");
        }


    }
}
