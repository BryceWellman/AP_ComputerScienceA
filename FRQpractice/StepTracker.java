import java.util.ArrayList;
public class StepTracker
{
    private ArrayList<Integer> recordedDays = new ArrayList<Integer>();
    private int activeDay;

    public StepTracker(int daysReq){
        activeDay = daysReq;
    }

    public int activeDays(){
        int count = 0;
        for (int ii=0; ii< recordedDays.size();ii++)
        {
            if (recordedDays.get(ii) >= activeDay)
                count += 1;
        }
        return count;
    }

    public void addDailySteps(int steps){
        recordedDays.add(steps);
    }

    public double averageDailySteps(){
        int sum = 0;
        for (Integer num : recordedDays){
            sum += num;
        }
        if (sum == 0){
            return 0;
        }
        return (sum / recordedDays.size());
    }

}