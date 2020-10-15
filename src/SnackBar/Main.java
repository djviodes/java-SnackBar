package SnackBar;

/*
Vending Machine
    Snacks
    Customers
*/

public class Main
{
    private static void workWithData()
    {
        System.out.println("Welcome to the Vending Machine. Choose your snack.");

        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine vendingMachine1 = new VendingMachine("Food");
        VendingMachine vendingMachine2 = new VendingMachine("Drink");
        VendingMachine vendingMachine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, vendingMachine1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vendingMachine1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vendingMachine1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vendingMachine2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vendingMachine2.getId());

        customer1.setCashOnHand(customer1.getCashOnHand() - (3 * snack4.getCost()));
        snack4.setQuantity(snack4.getQuantity() - 3);
        System.out.println(customer1.getName() + " cash on hand " + "$" + customer1.getCashOnHand());
        System.out.println("Quantity of " + snack4.getName() + " is " + snack4.getQuantity());

        customer1.setCashOnHand(customer1.getCashOnHand() - (1 * snack3.getCost()));
        snack3.setQuantity(snack3.getQuantity() - 1);
        System.out.println(customer1.getName() + " cash on hand " + "$" + customer1.getCashOnHand());
        System.out.println("Quantity of " + snack3.getName() + " is " + snack3.getQuantity());

        customer2.setCashOnHand(customer2.getCashOnHand() - (2 * snack4.getCost()));
        snack4.setQuantity(snack4.getQuantity() - 2);
        System.out.println(customer2.getName() + " cash on hand " + "$" + customer2.getCashOnHand());
        System.out.println("Quantity of " + snack4.getName() + " is " + snack4.getQuantity());

        customer1.setCashOnHand(customer1.getCashOnHand() + 10);
        System.out.println(customer1.getName() + " cash on hand " + "$" + customer1.getCashOnHand());

        customer1.setCashOnHand(customer1.getCashOnHand() - (1 * snack2.getCost()));
        snack2.setQuantity(snack2.getQuantity() - 1);
        System.out.println(customer1.getName() + " cash on hand " + "$" + customer1.getCashOnHand());
        System.out.println("Quantity of " + snack2.getName() + " is " + snack2.getQuantity());

        snack3.setQuantity(snack3.getQuantity() + 12);
        System.out.println("Quantity of " + snack3.getName() + " is " + snack3.getQuantity());

        customer2.setCashOnHand(customer2.getCashOnHand() - (3 * snack3.getCost()));
        snack3.setQuantity(snack3.getQuantity() - 3);
        System.out.println(customer2.getName() + " cash on hand " + "$" + customer2.getCashOnHand());
        System.out.println("Quantity of " + snack3.getName() + " is " + snack3.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}