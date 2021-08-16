public class BaseballPlayer
{
    private String name;
    private int hits;
    private int atBats;

    public BaseballPlayer(String Name, int Hits, int AtBats)
    {
        name = Name;
        hits = Hits;
        atBats = AtBats;
    }

    public String getName()
    {
        return name;
    }

    public int getHits()
    {
        return hits;
    }

    public int getAtBats()
    {
        return atBats;
    }

    public double getBattingAverage()
    {
        return hits;
    }


}
