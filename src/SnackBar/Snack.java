package SnackBar;

public class Snack
{
    // Field
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // Methods

    // Constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getter
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCost()
    {
        return cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public int getQuantity()
    {
        return quantity;
    }

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
}