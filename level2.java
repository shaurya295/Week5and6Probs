import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose a question:");
            System.out.println("1. Check if string is palindrome");
            System.out.println("2. Reverse a string");
            System.out.println("3. Count vowels in a string");
            System.out.println("4. Count consonants in a string");
            System.out.println("5. Convert string to uppercase");
            System.out.println("6. Convert string to lowercase");
            System.out.println("7. Find length of string");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    checkPalindrome(scanner);
                    break;
                case 2:
                    reverseString(scanner);
                    break;
                case 3:
                    countVowels(scanner);
                    break;
                case 4:
                    countConsonants(scanner);
                    break;
                case 5:
                    toUppercase(scanner);
                    break;
                case 6:
                    toLowercase(scanner);
                    break;
                case 7:
                    stringLength(scanner);
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void checkPalindrome(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void reverseString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    public static void countVowels(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }

    public static void countConsonants(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                count++;
            }
        }
        System.out.println("Number of consonants: " + count);
    }

    public static void toUppercase(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    public static void toLowercase(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    public static void stringLength(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Length: " + str.length());
    }
}