public class StarbucksRunner
{
    public static void main(String[] args)
    {
        StarbucksStore store1 = new StarbucksStore();
        StarbucksStore store2 = new StarbucksStore();
        StarbucksStore store3 = new StarbucksStore();

        System.out.println(store1.getTotalCoffeesServed());
        System.out.println(store2.getTotalCoffeesServed());
        System.out.println(store3.getTotalCoffeesServed());

        store2.serveOneCoffee();
        store1.serveOneCoffee();
        store2.serveOneCoffee();
        store3.serveOneCoffee();

        System.out.println(store1.getTotalCoffeesServed());
        System.out.println(store2.getTotalCoffeesServed());
        System.out.println(store3.getTotalCoffeesServed());
    }
}