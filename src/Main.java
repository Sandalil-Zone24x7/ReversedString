import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the a string to reverse!");

        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        String initialReverse = "";
        String reversedString = recReverse(originalString, initialReverse);
        System.out.println(reversedString);


    }
    public static String recReverse(String originalString, String reversedString) {
        System.out.println(reversedString);
        reversedString =  originalString.charAt(0) + reversedString;
        if (originalString.length() == 1) {
            return reversedString;
        }

        return recReverse(originalString.substring(1), reversedString);
    }

}