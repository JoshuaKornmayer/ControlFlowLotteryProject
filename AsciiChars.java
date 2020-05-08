public class AsciiChars {

    public static void printNumbers() {

        int i;
        for (i = 48; i < 58; i++) {

            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }

    public static void printLowerCase() {
        int i;
        for (i = 97; i < 123; i++) {

            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }

    public static void printUpperCase() {
        int i;
        for (i = 65; i < 91; i++) {
            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }
}