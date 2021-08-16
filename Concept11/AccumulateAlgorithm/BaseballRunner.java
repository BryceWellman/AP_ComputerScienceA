public class BaseballRunner
{
    public static void main(String[] args)
    {
        BaseballPlayer[] roster = new BaseballPlayer[9];

        roster[0] = new BaseballPlayer("Joe", 1, 4);
        roster[1] = new BaseballPlayer("Sam", 1, 4);
        roster[2] = new BaseballPlayer("Kyle", 2, 4);
        roster[3] = new BaseballPlayer("Joey", 1, 4);
        roster[4] = new BaseballPlayer("tommy", 1, 4);
        roster[5] = new BaseballPlayer("Daddy", 3, 4);
        roster[6] = new BaseballPlayer("Gerald", 1, 4);
        roster[7] = new BaseballPlayer("John", 1, 4);
        roster[8] = new BaseballPlayer("Brian", 4, 4);

        System.out.println("Team average: "+ findTeamAverage(roster));

    }







    public static double findTeamAverage(BaseballPlayer[] arr)
    {
        int totalHits = 0;                          //initialize totals
        int totalAtBats = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != null)                       //make sure player exists
            {
                totalHits += arr[i].getHits();        //add hits to total
                totalAtBats =+ arr[i].getAtBats();      //add at-bats to total
            }
        }

        if (totalAtBats == 0)                          //make sure total is not 0
            return 0;
        else
            return (double)(totalHits/totalAtBats);     //cast average to a double
    }

}