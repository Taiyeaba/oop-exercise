import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        // Initialize with 4colors
        items.add("red");
        items.add("yellow");
        items.add("green");
        items.add("blue");

        display(items, "Initial list of colors:");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a color");
            System.out.println("2. Remove a color");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter color to add: ");
                    String colorToAdd = scanner.nextLine();
                    items.add(colorToAdd);
                    display(items, "List after adding " + colorToAdd + ":");
                    break;
                case 2:
                    System.out.print("Enter color to remove: ");
                    String colorToRemove = scanner.nextLine();
                    if (items.remove(colorToRemove)) {
                        display(items, "List after removing " + colorToRemove + ":");
                    } else {
                        System.out.println(colorToRemove + " not found in the list.");
                    }
                    break;
                case 3:
                    display(items, "Current list of colors:");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header);

        for (String item : items) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}