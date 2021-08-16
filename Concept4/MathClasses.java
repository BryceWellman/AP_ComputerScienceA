public class MathClasses {
    public static void main (String[] args) {
        int myInt = Math.abs(-69);
        double herDoub = Math.pow(420, 2); //power always returns a double
        System.out.println(myInt);
        System.out.println(herDoub);

        int randInt = (int) (Math.random() * 10) + 1;  //random int from 1-10
        System.out.println(randInt);

        int heads = 0, tails = 0;
        for (int i = 0; i < 1000000; i++)
        {
            int flip = (int) (Math.random() * 2) + 1;
            if (flip == 1)
                heads ++;
            else
                tails ++;
        }
        System.out.println("Total number of heads: " + heads);
        System.out.println("Total number of tails: "+ tails);


    }
}