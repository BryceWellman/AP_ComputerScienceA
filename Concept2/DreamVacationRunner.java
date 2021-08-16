public class DreamVacationRunner {
    public static void main(String[] args) {
        DreamVacation MyDream = new DreamVacation("Lebanon", 1000);
        DreamVacation HisDream = new DreamVacation("Texas", 500);

        System.out.println(MyDream.getDestination());
        System.out.println(HisDream.getDestination());

        System.out.println(MyDream.getCost());
        System.out.println(HisDream.getCost());

        HisDream.setCost(250);

        System.out.println(HisDream.getCost());
    }
}