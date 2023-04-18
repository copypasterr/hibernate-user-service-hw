package mate.academy.util;

import org.mindrot.jbcrypt.BCrypt;

public class HashingUtil {

    private HashingUtil() {
    }

    public static String hashPassword(String textPassword) {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(textPassword, salt);
    }

    public static boolean checkPassword(String textPassword, String hashedPassword) {
        return BCrypt.checkpw(textPassword, hashedPassword);
    }
}
