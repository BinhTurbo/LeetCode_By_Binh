import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String type = scan.next();

            if ("Insert".equals(type)) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            } else if ("Delete".equals(type)) {
                int x = scan.nextInt();
                list.remove(x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(list.get(i));
        }
        scan.close();
    }
}
