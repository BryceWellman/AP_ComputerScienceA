import java.util.ArrayList;
public class RandomStringChooser {

    private ArrayList<String> words;

    public RandomStringChooser(String[] Str)
    {
        words = new ArrayList<String>();

        for(String word : Str)
        {
            words.add(word);
        }
    }

    public String getNext()
    {
        if (words.size() > 0){
            int randInt = (int) (Math.random() * words.size());
            return words.remove(randInt);
        }
        return "NONE";

    }


}