package hash_map;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        for (; ;) {
            System.out.println("Please, enter date: ");
            String date = scanner.nextLine();
            map.put("Nick", "79874561235");
            map.put("Stiv", "79561235487");
            map.put("Diana", "79998745698");

            if (NumberUtils.isDigits(date) &&!date.equals("list")) {
                for (String values: map.values()){
                    if (values.equals(date)){
                        System.out.println("Name: " + map.get(date) + " phone number: " + date);
                        scanner.close();
                    }
                }
                System.out.println("Please, enter name ");
                String name = scanner.nextLine();
                map.put(name,date);

            }  if (!NumberUtils.isDigits(date) && !date.equals("list")){
                for (String key: map.keySet()){
                    if (key.equals(date)){
                        System.out.println("Name: " + date + " phone number: " + map.get(date));
                    }
                }
                System.out.println("Please, enter phone");
                String phone = scanner.nextLine();
                map.put(date,phone);

            }if (date.equals("list")){
                System.out.println(map);
                break;
            }


        }
    }
}
