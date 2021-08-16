public class StepTrackerRunner {
    public static void main(String[] args) {
        StepTracker Bill = new StepTracker(10000);
        StepTracker Clara = new StepTracker(5000);

        Bill.addDailySteps(500);
        Bill.addDailySteps(10001);
        Bill.addDailySteps(10000);

        Clara.addDailySteps(5000);
        Clara.addDailySteps(8000);
        Clara.addDailySteps(8500);

        System.out.println("Bill--------");
        System.out.println(Bill.activeDays()+"         |");
        System.out.println(Bill.averageDailySteps()+"    |");
        System.out.println("------------");
        System.out.println("Clara-------");
        System.out.println(Clara.activeDays()+"         |");
        System.out.println(Clara.averageDailySteps()+"    |");
        System.out.println("------------");
    }
}