import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean firstRun = true;
        while (true) {
            if (!firstRun) {
                System.out.println();
            }
            firstRun = false;
            UserInput.showMenu();
            int choice = UserInput.readIntOnly(scanner,"Input error! Please enter a number:");

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int number = UserInput.readIntOnly(scanner,"Input error! Use only a number:");
                    if (number>7) {
                        System.out.println("Hello");
                        }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    if ("John".equals(name)) {
                        System.out.println("Hello, John");
                    } else {
                        System.out.println("There is no such name");
                    }
                    break;
                case 3:
                    int array [] = UserInput.readIntArray(scanner);
                    String newLine = "";
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 3 == 0){
                            newLine = (newLine + array[i] + " ");
                        }
                    }
                    if (newLine.isEmpty()) {
                        System.out.println("There are no multiples of 3 in the array.");
                    } else {
                        System.out.println(newLine.trim());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Please select the option again! You made an incorrect choice!");

            }
        }
    }
}