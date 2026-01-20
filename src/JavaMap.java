import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>(n * 2);
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNextLine()) {
            String query = in.nextLine();
            if (query == null || query.isEmpty()) continue;

            Integer phone = phoneBook.get(query);
            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(query + "=" + phone);
            }
        }
        in.close();
    }
}
