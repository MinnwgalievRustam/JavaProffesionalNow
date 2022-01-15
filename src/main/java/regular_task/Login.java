package regular_task;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (;;) {
            System.out.println("Please, enter login");
            String login = scanner.nextLine();
            if (login.equals("end")){
                System.out.println(list);
                break;
            }
            if (!valLogin(login)){
                System.out.println("Wrong format login");
                continue;
            } else {
                list.add("Login: " + login);
            }
            System.out.println("Please, enter password");
            String password = scanner.nextLine();
            if (!valPassword(password)){
                System.out.println("Wrong format password");
            } else {
                list.add("Password: " + password);
            }
        }
    }

    public static boolean valLogin(String login) {
        Pattern loginPattern = Pattern.compile("^[a-z]{3,15}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = loginPattern.matcher(login);
        return matcher.find();
    }

    public static boolean valPassword(String password) {
        Pattern passwordPattern = Pattern.compile("^[a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = passwordPattern.matcher(password);
        return matcher.find();
    }
}