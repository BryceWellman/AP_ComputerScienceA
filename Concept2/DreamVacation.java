public class DreamVacation
{
    private String destination;
    private double cost;

    public DreamVacation()
    {

    }
    public DreamVacation(String dest, double price)
    {
        destination = dest;
        cost = price;
    }
    public String getDestination()
    {
        return destination;
    }
    public double getCost()
    {

        return cost;
    }
    public void setDestination(String dest)

    {
        destination = dest;
    }
    public void setCost(double price)
    {

        cost = price;
    }
}