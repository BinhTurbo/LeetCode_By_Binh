//import java.util.Scanner;
//
//public class SdInOut {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] a = new int[3];
//        for (int i = 0; i < 3; i++) {
//            a[i] = scan.nextInt();
//        }
//        for (int i : a) {
//            System.out.println(i);
//        }
//    }
//}


import java.util.Scanner;

public class SdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}