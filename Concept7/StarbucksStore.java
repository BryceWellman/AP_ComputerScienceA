public class StarbucksStore
{
    private static int totalCoffeesServed = 0;

    public void serveOneCoffee()
    {
        totalCoffeesServed++;
    }

    public int getTotalCoffeesServed()
    {
        return totalCoffeesServed;
    }
}