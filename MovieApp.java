import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {
        String yOrN;
        do {
            //declaring objects and variables
            String userInput;
            Scanner keyboard = new Scanner(System.in);
            MovieMethods movies = new MovieMethods();
            //prompt user to enter a category
            System.out.println("Welcome to the Movie List App!");
            System.out.println("What categories are you interested? Enter 1 of the following: Animated, Drama, Horror, or Scifi");
            userInput = keyboard.nextLine();
            //check if valid
            userInput = movies.movieValid(userInput);
            //print movies
            movies.movieArray(userInput);
            //ask if they want to continue
            System.out.println("Continue? (y/n)");
            yOrN = keyboard.nextLine();
            //check if valid
            yOrN = movies.yOrNValid(yOrN);
        } while(yOrN.equalsIgnoreCase("y"));
        System.out.println("Goodbye!");
    }
}
