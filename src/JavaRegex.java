public class JavaRegex {
    public static void main(String[] args) {
        String regex = "a*b";
        String testString = "aaab";

        boolean matches = testString.matches(regex);
        System.out.println("Does the string \"" + testString + "\" match the regex \"" + regex + "\"? " + matches);
    }
}
