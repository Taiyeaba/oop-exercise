import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Initialize the list with 7 colors
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("orange");
        colors.add("purple");
        colors.add("pink");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Remove a color");
            System.out.println("2. Replace a color");
            System.out.println("3. Add a new color");
            System.out.println("4. Display all colors");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    display(colors, "\nSelect the color to remove:");
                    System.out.print("Enter the number of the color to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline character
                    if (isValidIndex(removeIndex, colors)) {
                        String removedColor = colors.remove(removeIndex);
                        System.out.println(removedColor + " has been removed.");
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 2:
                    display(colors, "\nSelect the color to replace:");
                    System.out.print("Enter the number of the color to replace: ");
                    int replaceIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline character
                    if (isValidIndex(replaceIndex, colors)) {
                        System.out.print("Enter the new color: ");
                        String newColor = scanner.nextLine();
                        if (colors.contains(newColor)) {
                            System.out.println(newColor + " is already in the list. Replacement not made.");
                        } else {
                            String replacedColor = colors.set(replaceIndex, newColor);
                            System.out.println(replacedColor + " has been replaced with " + newColor + ".");
                        }
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a new color to add: ");
                    String newColor = scanner.nextLine();
                    if (colors.contains(newColor)) {
                        System.out.println(newColor + " is already in the list. It cannot be added again.");
                    } else {
                        colors.add(newColor);
                        System.out.println(newColor + " has been added to the list.");
                    }
                    break;

                case 4:
                    display(colors, "\nCurrent colors in the list:");
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the list of colors with numbered options
    public static void display(ArrayList<String> items, String header) {
        System.out.println(header);
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    // Method to check if the index is valid
    private static boolean isValidIndex(int index, ArrayList<String> items) {
        return index >= 0 && index < items.size();
    }
}