import java.util.ArrayList;
public class Test {
    public static void main(String[] args)
    {
        double value = 30000;
        int loop =1;
        double add = 0;

        for (int i = 0; i<loop; i++)
        {
            add = value * .05;
            value += add;
        }

        System.out.println(value);
    }

}