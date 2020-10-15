package SnackBar;

public class VendingMachine
{
    // Fields
    private static int maxId = 0;
    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;

        this.name = name;
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

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
}