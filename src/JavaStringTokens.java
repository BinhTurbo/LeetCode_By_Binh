import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()) {
            System.out.println(0);
            scan.close();
            return;
        }
        String s = scan.nextLine().trim();
        if (s.length() == 0) {
            System.out.println(0);
            scan.close();
            return;
        }
        String[] tokens = s.split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
