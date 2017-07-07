import java.util.ArrayList;
import java.util.Scanner;


public class MovieMethods {

    public static String movieValid(String userInput) {
        Scanner keyboard = new Scanner(System.in);
        while ((!userInput.equalsIgnoreCase("Drama")) && (!userInput.equalsIgnoreCase("Animated"))
                && (!userInput.equalsIgnoreCase("Horror")) && (!userInput.equalsIgnoreCase("Scifi"))) {
            System.out.println("Invalid input! MUST ENTER: Animated, Drama, Horror, or Scifi.");
            userInput = keyboard.nextLine();
        }
        return userInput;
    }
    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }

    public void movieArray(String userInput) {
        Movie lionKing = new Movie("The Lion King", "Animated");
        Movie theLorax = new Movie("The Lorax", "Animated");
        Movie shrek = new Movie("Shrek", "Animated");
        Movie thePregnancyPact = new Movie("The Pregnancy Pact", "Drama");
        Movie theLastSong = new Movie("The Last Song", "Drama");
        Movie safeHaven = new Movie("Safe Haven", "Drama");
        Movie texasChainsaw = new Movie("Texas Chainsaw Massacre", "Horror");
        Movie saw = new Movie("Saw", "Horror");
        Movie theConjuring = new Movie("The Conjuring", "Horror");
        Movie divergent = new Movie("Divergent", "Sci-fi");
        Movie theHungerGames = new Movie("The Hunger Games", "Sci-fi");
        Movie mazeRunner = new Movie("Maze Runner", "Sci-fi");

        ArrayList<Movie> animated = new ArrayList<>();
        animated.add(lionKing);
        animated.add(theLorax);
        animated.add(shrek);

        ArrayList<Movie> drama = new ArrayList<>();
        drama.add(thePregnancyPact);
        drama.add(theLastSong);
        drama.add(safeHaven);

        ArrayList<Movie> horror = new ArrayList<>();
        horror.add(texasChainsaw);
        horror.add(saw);
        horror.add(theConjuring);

        ArrayList<Movie> scifi = new ArrayList<>();
        scifi.add(divergent);
        scifi.add(theHungerGames);
        scifi.add(mazeRunner);;

        if(userInput.equalsIgnoreCase("Animated")){
            for(Movie x: animated){
                System.out.println(x);
            }
        }
        if(userInput.equalsIgnoreCase("Drama")){
            for(Movie x: drama){
                System.out.println(x);
            }
        }
        if(userInput.equalsIgnoreCase("Horror")){
            for(Movie x: horror){
                System.out.println(x);
            }
        }
        if(userInput.equalsIgnoreCase("Scifi")){
            for(Movie x : scifi){
                System.out.println(x);
            }
        }
    }
}

