import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = 1;
        while (sc.hasNext()) {
            String lineContent = sc.nextLine();
            System.out.println(lineNum + " " + lineContent);
            lineNum++;
        }
        sc.close();
    }
}
