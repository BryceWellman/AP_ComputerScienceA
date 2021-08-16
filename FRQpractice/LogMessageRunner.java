public class LogMessageRunner {
    public static void main(String[] args){
        LogMessage test = new LogMessage("SERVER2:read error in disk DSK2");

        System.out.println(test.containsWord("disk"));
    }
}