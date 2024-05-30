
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public void removeItem(FoodItem item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order Details:");
        for (FoodItem item : items) {
            System.out.println("- " + item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getTotalPrice());
    }
}

class FoodOrderingSystem {
    private List<FoodItem> menu;
    private Order currentOrder;

    public FoodOrderingSystem() {
        menu = new ArrayList<>();
        currentOrder = new Order();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            FoodItem item = menu.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
        }
    }

    public void addToMenu(FoodItem item) {
        menu.add(item);
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.println("Enter the item number to add to your order (0 to finish):");
            choice = scanner.nextInt();

            if (choice > 0 && choice <= menu.size()) {
                FoodItem selectedItem = menu.get(choice - 1);
                currentOrder.addItem(selectedItem);
                System.out.println(selectedItem.getName() + " added to your order.");
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        System.out.println("Order completed.");
        currentOrder.printOrder();
    }
}

public class Main {
    public static void main(String[] args) {
        FoodOrderingSystem foodOrderingSystem = new FoodOrderingSystem();

        // Adding items to the menu
        foodOrderingSystem.addToMenu(new FoodItem("Burger", 5.99));
        foodOrderingSystem.addToMenu(new FoodItem("Pizza", 8.99));
        foodOrderingSystem.addToMenu(new FoodItem("Salad", 4.99));
        foodOrderingSystem.addToMenu(new FoodItem("Fries", 2.99));

        // Taking order from the customer
        foodOrderingSystem.takeOrder();
    }
}


This program allows the user to select food items from a menu, add them to an order, and display the total price of the order. You can add more items to the menu by calling the addToMenu() method in the FoodOrderingSystem class.