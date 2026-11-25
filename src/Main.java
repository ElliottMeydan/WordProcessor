import java.util.Scanner;

public class Main {
    static void main() {
        WordProcessor processor = new WordProcessor();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Enter the text you want to process: ");
        processor.setText(scanner.nextLine());
        while (running) {
            printMenu(processor);
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                running = false;
                System.out.println("Goodbye!");
                continue;
            }


            String result = switch (choice) {
                case "1" -> processor.toUpperCase();
                case "2" -> processor.toLowerCase();
                case "3" -> processor.toSnakeCase();
                case "4" -> processor.toCamelCase();
                case "5" -> processor.toPascalCase();
                case "6" -> processor.toKebabCase();
                case "7" -> processor.toTitleCase();
                case "8" -> {System.out.print("Enter the new text: ");
                    processor.setText(scanner.nextLine());
                    yield processor.getText();
                }
                default -> "";
            };

            System.out.println("Result: " + result + "\n");
        }
        scanner.close();
    }


    private static void printMenu(WordProcessor processor) {
        System.out.println("===== Word Processor =====");
        System.out.println("Your current text input is "+processor.getText()+".");
        System.out.println("==========================");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        System.out.println("3. Snake case");
        System.out.println("4. Camel case");
        System.out.println("5. Pascal case");
        System.out.println("6. Kebab case");
        System.out.println("7. Title case");
        System.out.println("8. Change text input");
        System.out.println("0. Exit");
        System.out.println("==========================");
    }

}

