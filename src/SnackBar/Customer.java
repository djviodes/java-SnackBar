package SnackBar;

public class Customer
{
    // Fields
    private int maxId;
    private int id;
    private String name;
    private double cashOnHand;

    // Methods

    // Getter
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCashOnHand()
    {
        return cashOnHand;
    }

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
}