public class MakingStrings {
    public static void main(String[] args) {
        //creates teh string myName and prints
        String myName = "Bryce Wellman";
        System.out.println(myName);

        //creates the string herName and prints
        String herName = new String("Grace Lucas");
        System.out.println(herName);

        //combines the 2 names and prints
        String bothNames = myName + herName;
        System.out.println(bothNames);


        //gets the second to last letter in the names
        String herSecondLast = herName.substring(herName.length()-2, herName.length()-1);
        String mySecondLast = myName.substring(myName.length()-2, myName.length()-1);



        //looks to see if the 2 names are the same
        if (myName.equals(herName)== true)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not the same");

        }
    }
}