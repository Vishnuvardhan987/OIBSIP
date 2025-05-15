package ATM;

import java.util.HashMap;

public class BankDatabase {
    private static HashMap<String, String> users = new HashMap<>();

    static {
        // Dummy users (userId, pin)
        users.put("user1", "1234");
        users.put("user2", "5678");
    }

    public static boolean authenticateUser(String userId, String pin) {
        return users.containsKey(userId) && users.get(userId).equals(pin);
    }
}
