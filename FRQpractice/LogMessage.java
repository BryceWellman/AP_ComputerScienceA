public class LogMessage {

    private String description;
    private String machineId;

    public LogMessage(String message)
    {
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index+1);
    }

    public boolean containsWord(String word)
    {
        if (description.indexOf(word) != -1)
        {
            if (description.indexOf(word) == 0 || description.indexOf(word) == description.length()
            - word.length())
            {
                return true;
            }
            int index = description.indexOf(word);
            int endIndex = index + word.length();
            if (description.substring(index -1, index).equals(" "))
            {
                return true;
            }
            if (description.substring(endIndex + 1, endIndex + 2).equals(" "))
            {
                return true;
            }
        }
        return false;
    }

    
}