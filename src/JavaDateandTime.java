    import java.time.LocalDate;
import java.io.*;
import java.util.*;

public class JavaDateandTime {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng, ngày, năm (cách nhau bởi dấu cách):");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        String res = JavaDateandTime.findDay(month, day, year);
        System.out.println("Kết quả: " + res);
        scanner.close();
    }
}