import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Validator valid = new Validator();
    public static ArrayList<Movie> movieList = new ArrayList<Movie>();

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        int i = 0;
        int movieIndx = 0;
        String movieCategory = " ";
        String inputAnswer = " ";
        boolean userContinue = true;

        // Populate the Movie ArrayList
        movieList.add(new Movie(1, "Planet of the Apes", "scifi"));
        movieList.add(new Movie(2, "Beaches", "drama"));
        movieList.add(new Movie(3, "Jurassic Park", "scifi"));
        movieList.add(new Movie(4, "Silence of the Lambs", "horror"));
        movieList.add(new Movie(5, "Finding Dory", "animated"));
        movieList.add(new Movie(6, "The Witch", "horror"));
        movieList.add(new Movie(7, "How to Train Your Dragin", "animated"));
        movieList.add(new Movie(9, "Forest Gump", "drama"));
        movieList.add(new Movie(10, "Good will Hunting", "drama"));
        movieList.add(new Movie(11, "Friday the 13th", "horror"));
        movieList.add(new Movie(12, "Finding Nemo", "animated"));
        movieList.add(new Movie(13, "Taxi Driver", "drama"));
        movieList.add(new Movie(14, "American", "drama"));

        // Collections.sort(movieList.set());

        while (userContinue = true) {
            DisplayMenu.readTextFromMenuFile();
            System.out.println("There are " + (movieList.size() + 1) + " movies in this list");

            movieIndx = valid.getInt(scan1, "What category are you interested in? (1 - 4)", 1, 4);
            int actualIndex = movieIndx - 1;

            switch (movieIndx) {
                case 1:
                    movieCategory = "animated";
                    break;
                case 2:
                    movieCategory = "drama";
                    break;
                case 3:
                    movieCategory = "horror";
                    break;
                case 4:
                    movieCategory = "scifi";
                    break;
            }

            System.out.println();
            System.out.println("The below movies are in the Category: " + movieCategory);

            for (i = 0; i < movieList.size(); i++) {
                if (movieCategory.equalsIgnoreCase(movieList.get(i).getCategory())) {
                    System.out.println(movieList.get(i).geTitle());
                }
            }

            System.out.println("Do you wish to continue? (Y / N)");
            inputAnswer = scan1.nextLine();
            if (inputAnswer.equalsIgnoreCase("n")) {
                userContinue = false;
                break;
            }
        }
    }
}
    
